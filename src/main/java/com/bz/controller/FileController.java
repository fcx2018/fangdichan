package com.bz.controller;

import com.bz.bean.LP_TuPian;
import com.bz.service.LP_TuPianService;
import com.bz.util.KindEditorResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Random;

@Controller
@RequestMapping("")
public class FileController {

    @Autowired
    private LP_TuPianService lp_tuPianService;

    @RequestMapping("/uploadImg")
    @ResponseBody
    public synchronized KindEditorResult uploadImg(HttpServletRequest request,@RequestParam("imgFile") MultipartFile imgFile) {
        KindEditorResult result = new KindEditorResult();

        try {
            // 获取绝对路径
            String realpath = "d:/myfile/upload/uploads";
            File uploadDir = new File(realpath);
            if (!uploadDir.isDirectory())
            {
                uploadDir.mkdirs();
            }

            // 检查目录写权限
            if (!uploadDir.canWrite())
            {
                result.setError(1);
                result.setMessage("上传图片出错！");
                return result;
            }

            String name = "";
            Random r = new Random();
            name += System.currentTimeMillis();
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            String newname = name+"."+imgFile.getOriginalFilename().substring(imgFile.getOriginalFilename().lastIndexOf(".")+1);

            // 上传文件
            imgFile.transferTo(new File(realpath, newname));
            result.setError(0);
            System.out.println();
            String src = "https://"+request.getServerName()+":"+request.getServerPort()+request.getServletContext().getContextPath() + "/uploads/" + newname;
            result.setUrl(src);
        } catch (Exception e) {
            System.out.println("---"+e);
            result.setError(1);
            result.setMessage("上传图片出错！");
        }

        return result;

    }

    @RequestMapping("/uploadImg1")
    @ResponseBody
    public synchronized ModelMap  uploadImg1(HttpServletRequest request,@RequestParam(name = "xiangtu",required = false,defaultValue = "1") MultipartFile imgFile,Integer lpid) {
        ModelMap map = new ModelMap();
        try {
            // 获取绝对路径
            String realpath = "d:/myfile/upload/uploads";
            File uploadDir = new File(realpath);
            if (!uploadDir.isDirectory())
            {
                uploadDir.mkdirs();
            }

            // 检查目录写权限
            if (!uploadDir.canWrite())
            {
                /*result.setError(1);
                result.setMessage("上传图片出错！");
                return result;*/
            }
            Random r = new Random();
            String name = "";
            name += System.currentTimeMillis();
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            String newname = name+"."+imgFile.getOriginalFilename().substring(imgFile.getOriginalFilename().lastIndexOf(".")+1);

            // 上传文件
            imgFile.transferTo(new File(realpath, newname));

            String src = "https://"+request.getServerName()+":"+request.getServerPort()+request.getServletContext().getContextPath() + "/uploads/" + newname;
            map.put("subGraphAddress", src);
            map.put("viceGraphName", newname);
            LP_TuPian lp_tuPian = new LP_TuPian();
            lp_tuPian.setLujing(src);
            lp_tuPian.setLoupanid(lpid);
            lp_tuPianService.insert(lp_tuPian);
        } catch (Exception e) {
            System.out.println("---"+e);
        }
        return map;
    }
    @RequestMapping("/uploadImg2")
    @ResponseBody
    public synchronized KindEditorResult uploadImg2(HttpServletRequest request,@RequestParam("file") MultipartFile imgFile) {
        KindEditorResult result = new KindEditorResult();

        try {
            // 获取绝对路径
            String realpath = "d:/myfile/upload/uploads";
            File uploadDir = new File(realpath);
            if (!uploadDir.isDirectory())
            {
                uploadDir.mkdirs();
            }

            // 检查目录写权限
            if (!uploadDir.canWrite())
            {
                result.setError(1);
                result.setMessage("上传图片出错！");
                return result;
            }

            String name = "";
            Random r = new Random();
            name += System.currentTimeMillis();
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            name += r.nextInt(9);
            String newname = name+"."+imgFile.getOriginalFilename().substring(imgFile.getOriginalFilename().lastIndexOf(".")+1);

            // 上传文件
            imgFile.transferTo(new File(realpath, newname));
            result.setError(0);
            System.out.println();
            String src = "https://"+request.getServerName()+":"+request.getServerPort()+request.getServletContext().getContextPath() + "/uploads/" + newname;
            result.setUrl(src);
        } catch (Exception e) {
            System.out.println("---"+e);
            result.setError(1);
            result.setMessage("上传图片出错！");
        }

        return result;

    }

    @RequestMapping("/fileDelete")
    @ResponseBody
    public Object fileDelete(HttpServletRequest request,String key){
        String[] keys = key.split("@",-1);
        String name = keys[0].split("/")[keys[0].split("/").length-1];
        String filePath = "d:/myfile/upload/uploads/"+name;
        try {
            File file = new File(filePath);
            if(file.exists()){
                if(file.isFile()){
                    file.delete();
                }
            }
            lp_tuPianService.deleteByPrimaryKey(Integer.parseInt(keys[1]));//从数据库中删除
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "{}";
    }
}
