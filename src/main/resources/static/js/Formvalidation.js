var from={
    submit: function w(q){

                var isnonull = $("[isnonull]");
                //非空
                for (var i = 0 ; i < isnonull.length ; i++ ){
                    var m = $(isnonull[i]).attr("isnonull");
                    if(m == null || m == "")m = "请填写内容！";
                    if($(isnonull[i]).val() == null || $(isnonull[i]).val() == ""){
                        $(isnonull[i]).focus();
                        layer.msg(m);
                        return;
                    }
                }
                //是否相等
                var equals = $("[equals]");
                for (var i = 0 ; i < equals.length ; i ++ ){
                    //获取属性值，用于获取要判断的其他值
                    var a = $(equals[i]).attr("equals");
                    //获取要判断的值
                    var w = $(equals[i]).val();
                    //获取其他要判断相同的值
                    var e = $("[isequals^='"+a+"']");
                    console.log(e.length);
                    for(var j = 0 ; j < e.length ; j++ ){
                        var r = $(e[j]).val();
                        if( w != r ){
                            $(e[j]).focus();
                            var m = $(e[j]).attr("isequals");
                            console.log(m);
                            var s = m.split(" ")[1];
                            if(s == null || s == "")s = "请填写内容！";
                            layer.msg(s);
                            return;
                        }
                    }
                }

                q();
            },
    init:   function(w){
                document.onkeydown = function(e) { // 回车提交表单
                    // 兼容FF和IE和Opera
                    var theEvent = window.event || e;
                    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
                    if (code == 13) {
                        $(w).click();
                    }
                }
            }
}
