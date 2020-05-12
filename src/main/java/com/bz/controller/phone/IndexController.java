package com.bz.controller.phone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bz.bean.*;
import com.bz.service.*;
import com.bz.util.Configuration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("phone")
public class IndexController {

    @Autowired
    private BannerService bannerService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private LouPanService louPanService;
    @Autowired
    private FenLeiService fenLeiService;
    @Autowired
    private QuYuService quYuService;
    @Autowired
    private UserService userService;
    @Autowired
    private ZiJinMingXiService ziJinMingXiService;
    @Autowired
    private TiXianJiLuService tiXianJiLuService;

    /*
    *首页方法
    */
    @RequestMapping("index")
    @ResponseBody
    public String index(){
        Map<String , Object> map = new HashMap<>();
        List<Banner> banners = bannerService.selectIndex();
        List<FenLei> fenLeis = fenLeiService.selectIndex();
        List<Message> messages = messageService.selectIndex();
        LouPan louPan = new LouPan();
        List<LouPan> louPans = louPanService.selectByExample(louPan,1, Configuration.getInteger("phoneSize"));
        map.put("banners",banners);
        map.put("messages",messages);
        map.put("fenLeis",fenLeis);
        map.put("louPans",louPans);
        return new Gson().toJson(map);
    }

    @RequestMapping("index_louPan")
    @ResponseBody
    public String index_LouPan(LouPan louPan){
        Map<String , Object> map = new HashMap<>();
        List<Object> jgList = Configuration.getList("RealEstatePriceTerms");
        List<Object> fxList = Configuration.getList("RoomTypeCondition");
        List<Object> mjList = Configuration.getList("AreaCondition");
        List<QuYu> dqList = quYuService.getAll();
        List<LouPan> louPans = louPanService.selectByExample(louPan,1, Configuration.getInteger("phoneSize"));
        map.put("jiaGeList",jgList);
        map.put("fangXingList",fxList);
        map.put("mianJiList",mjList);
        map.put("quYuList",dqList);
        map.put("louPanList",louPans);
        return new Gson().toJson(map);
    }

    /*
    * 获取楼盘分页信息
    * */
    @RequestMapping("loupan_list")
    @ResponseBody
    public String louPan_List(LouPan louPan , Integer pageNo , String jiaGeS){
        louPan.setZhuangtai(1);
        List<LouPan> list = louPanService.selectLouPan(louPan , pageNo , Configuration.getInteger("phoneSize"),null,jiaGeS);
        return JSON.toJSONString(list);
    }

    /**
     * 解密并且获取用户手机号码
     * @param encrypdata
     * @param ivdata
     * @param userid
     * @param request
     * @return
     * @throws Exception 
     */
    @RequestMapping(value = "deciphering", method = RequestMethod.POST)
    @ResponseBody
    public String deciphering(String encrypdata,String ivdata, Integer userid, HttpServletRequest request) throws IOException {
        User user = userService.selectByPrimaryKey(userid);
        byte[] encrypData = net.iharder.Base64.decode(encrypdata);
        byte[] ivData = net.iharder.Base64.decode(ivdata);
        byte[] sessionKey = net.iharder.Base64.decode(user.getSession_key());
        String str="";
        try {
            str = decrypt(sessionKey,ivData,encrypData);
        } catch (Exception e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(str);
        return str;

    }
    public static String decrypt(byte[] key, byte[] iv, byte[] encData) throws Exception {
        AlgorithmParameterSpec ivSpec = new IvParameterSpec(iv);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        //解析解密后的字符串  
        return new String(cipher.doFinal(encData),"UTF-8");
        }
    @RequestMapping("getQrcode")
    @ResponseBody
    public String getQrcode(HttpServletRequest request, String path , String scene , Integer width){
        String accessToken = getAccessToken();
        System.out.println(accessToken);
        String urlpath = "";
        String httpurl = "";
        //图片文件名称
        String fileName = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()) +
                UUID.randomUUID().toString().substring(8)+".png";
        RestTemplate rest = new RestTemplate();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken;
            Map<String,Object> param = new HashMap<>();
            System.out.println(url);
            param.put("path", path);
            param.put("width", width);
            param.put("auto_color", true);
            param.put("scene",scene);
            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
            HttpEntity requestEntity = new HttpEntity(param, headers);
            ResponseEntity<byte[]> entity = rest.exchange(url, HttpMethod.POST, requestEntity, byte[].class, new Object[0]);

            byte[] result = entity.getBody();
            inputStream = new ByteArrayInputStream(result);
            urlpath = "d:/myfile/upload/Qrcode/"+fileName;
            httpurl = request.getScheme() + "://" +request.getServerName()
                    + ":" + request.getServerPort()+"/Qrcode/"+fileName;
            File file = new File(urlpath);
            outputStream = new FileOutputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = inputStream.read(buf, 0, 1024)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.flush();

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return httpurl;
    }

    /*
    * 获取accessToken
    * */
    public String getAccessToken(){
        //微信接口url
        String accessTokenUrl = "https://api.weixin.qq.com/cgi-bin/token?" +
                "grant_type=client_credential" +
                "&appid=" + Configuration.getString("appid") +
                "&secret=" + Configuration.getString("appsecret");
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(accessTokenUrl,String.class);
        String accessToken = null;
        if(responseEntity != null && responseEntity.getStatusCode() == HttpStatus.OK){
            String strBody = responseEntity.getBody();
            JSONObject jsonObject = JSONObject.parseObject(strBody);
            accessToken = jsonObject.getString("access_token");
        }
        return accessToken;

    }
    @ResponseBody
    @RequestMapping("ziJinMingXi")
    public String ziJinMingXi(ZiJinMingXi ziJinMingXi , Integer pageNo){
        List<ZiJinMingXi> list = ziJinMingXiService.selectByExample(ziJinMingXi,pageNo,Configuration.getInteger("phoneSize"));
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("tiXianMingXi")
    public String tiXianMingXi(TiXianJiLu tixianjilu , Integer pageNo){
        List<TiXianJiLu> list = tiXianJiLuService.selectByExample(tixianjilu,pageNo,Configuration.getInteger("phoneSize"));
        return JSON.toJSONString(list);
    }

    @ResponseBody
    @RequestMapping("getUser")
    public String getUser(User user){
        user = userService.getId(user.getId());
        List<FenLei> fenLeiList = fenLeiService.selectIndex();
        List<QuYu> quYuList = quYuService.getAll();
        Map<String , Object> map = new HashMap<>();
        map.put("user",user);
        map.put("fenLeiList",fenLeiList);
        map.put("quYuList",quYuList);
        return new Gson().toJson(map);
    }

}
