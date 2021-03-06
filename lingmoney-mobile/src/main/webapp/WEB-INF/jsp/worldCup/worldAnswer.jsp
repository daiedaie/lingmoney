<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="viewport"
    content="width=device-width,initial-scale=1.0,maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>领钱儿-测测你的“伪球迷”指数</title>
<style type="text/css">
/*em设置*/
html {
    font-size: 100%;
}

ul, ol, li, p {
    list-style: none;
    margin: 0px;
    padding: 0px;
}

html, body, .screen {
    position: relative;
    width: 100%;
    height: 100%;
    margin: 0 auto;
}

.main {
    position: absolute;
    width: 100%;
    max-width: 7.5rem;
    left: 50%;
    overflow-y: auto;
    -webkit-overflow-scrolling: touch;
    transform: translate(-50%, 0);
    -webkit-transform: translate(-50%, 0);
    -moz-transform: translate(-50%, 0);
    -o-transform: translate(-50%, 0);
    transform: translate(-50%, 0);
}

.world-cup {
    line-height: 0rem;
    font-size: 0rem;
}

.world-cup img {
    width: 100%;
}

.begin_subject {
    width: 5.2rem;
    height: 3.1rem;
    color: #125507;
    font-size: 0.4rem;
    margin-top: 3.2rem;
    margin-left: auto;
    margin-right: auto;
}

.begin_answer {
    width: 6.4rem;
    height: 6.4rem;
    margin: 0 auto;
}

.begin_answer .begin_answer-active {
    background-color: #fca50e;
    border: solid #e57700 0.05rem;
    color: #fff;
}

.begin_answer p {
   width: 6.29rem;
    height: 0.84rem;
    background-color: #FCD20E;
    margin-top: 0.45rem;
    color: #5D8519;
    font-size: 0.3rem;
    line-height: 0.84rem;
    border-radius: 0.1rem;
    border: solid #f0b000 0.05rem;
    text-indent: 0.5rem;
    cursor: pointer;
}

.assessment-box {
    margin-left: auto;
    margin-right: auto;
    position: relative;
    height: 13.34rem;
    overflow: hidden;
    background: #468937
}

.assessment-block {
    overflow: hidden;
    position: absolute;
    top: 0rem;
    padding: 0;
    margin: 0;
    width: 2000rem;
    left: 0rem;
}

.assessment-warp {
    width: 7.5rem;
    float: left;
    background:
        url('http://static.lingmoney.cn/lingmoneywap/images/05df339c-1d85-4fa9-ac9b-494ca3affe9b.jpg')
        no-repeat top center;
    background-size: 100%;
}
.index-Popup-bg {
    width: 100%;
    height: 100%;
    position: fixed;
    opacity: 0.5;
    background: #000;
    z-index: 9999;
    left: 0;
    top: 0;
    display: none;
}


.iphone-tip {
    width: 1.57rem;
    height: 0.65rem;
    font-size: 0.24rem;
    background: #cadecc;
    line-height: 0.6rem;
    text-align: center;
    position: absolute;
    right: 0rem;
    top: 0rem;
}

.iphone-tips {
    width: 1.57rem;
    height: 0.65rem;
    font-size: 0.24rem;
    background: #e4e6e9;
    line-height: 0.6rem;
    text-align: center;
    position: absolute;
    right: 0rem;
    top: 0rem;
}

</style>
</head>
<body style="background:
        url('http://static.lingmoney.cn/lingmoneywap/images/a6dc39bb-be94-4fdc-95ac-7811338a0cb9.png')
         ;
    background-size: 100%;">
    <div class="screen">
        <div class="main">
            <div class="assessment-box">
                <div class="assessment-block">
                    <!-- 循环题 -->
                    <div class="assessment-warp" data-index="" data-zfz="">
                        <div class="begin_subject">Q1.测测你伪球迷指数是多少？</div>
                        <div class="begin_answer">
                            <p class="begin_answer-active" data-fen="1">A:一级</p>
                            <p data-fen="0">A:一级</p>
                            <p data-fen="0">A:一级</p>
                            <p data-fen="0">A:一级</p>

                        </div>
                    </div>
                    <!-- 循环题 -->

                </div>
                
            </div>
            
        </div>

   <input type="hidden" class="fenshuzhi">
   <input type="hidden" class="fenshutip">

        
        <!-- 手机号输入 end-->
        <div class="index-Popup-bg"></div>
    </div>

    <div id="jsondata"></div>

    <script type="text/javascript" src="/resource/js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="/resource/js/worldCupcommon.js"></script>
    <script>
    $(function(){ 
        
         $.ajax({
                url: '/worldCup/answersList',
                type: 'post',
                data:{
                    
                },
                dataType: 'json',
                success: function(data) {
                    var d = data.json;
                    var html="";
                    if(d.code==200){
                        $.each(d.rows, function(i, item){ 
                            var remarkHtml="";
                            $.each(JSON.parse(item.optionJson), function(k, item1){ 
                                    remarkHtml += '<p data-fen="'+item1.title+'" >'+item1.title+''+': '+item1.count+'</p>';
                            }) 
                            html+='<div class="assessment-warp www'+i+'"  data-index="" data-zfz="" data-id="'+item.id+'">'
                            html+='<div class="begin_subject">'+(i+1)+' '+', '+item.problem+'</div>'
                            html+='<div class="begin_answer">'+remarkHtml
                            html+='</div>'
                            html+='</div>'
                            
                        })
                        $('.assessment-block').html(html)
                    }else{
                        
                    }
                },
                error: function(d) {}
            });
         setTimeout(function(){
             var eachcount=0;
             $('.assessment-warp').each(function(index,item){
                
                    _index=$(this).index()+1;
                    $(this).attr('data-index',_index);
                    _that=$(this);
                    
                    $('body').on('click','.assessment-warp p',function(){
                        
                        if(Number($(this).closest('.assessment-warp').attr('data-index'))<_index){
                            $('.assessment-page').html(Number($(this).closest('.assessment-warp').attr('data-index'))+1)
                            $('.assessment-block').animate({left:-(Number($(this).closest('.assessment-warp').attr('data-index'))*7.5)+'rem'},15) 
                            
                        }else{
                                if($(this).closest('.begin_answer').closest('.assessment-warp').attr('data-index')==10){
                                
                                    if($(this).closest('.begin_answer').closest('.assessment-warp').attr('data-zfz')!=''){
                                         eachcount++
                                        if(eachcount==9){
                                            callbamk()
                                        }
                                        
                                    }       
                                    
                              }
                                
                                
                        }
                        
                        
                        flag=true;  
                        $(this).addClass('begin_answer-active')
                        $(this).siblings().removeClass('begin_answer-active')
                        $(this).closest('.begin_answer').closest('.assessment-warp').attr('data-zfz',$(this).attr('data-fen'))
                    /*  var linshi = "{\""+$('.www0').attr('data-id')+"\":"+$('.www0').attr('data-zfz')+";\""+$('.www1').attr('data-id')+"\":"+$('.www1').attr('data-zfz')+";\""+$('.www2').attr('data-id')+"\":"+$('.www2').attr('data-zfz')+";\""+$('.www3').attr('data-id')+"\":"+$('.www3').attr('data-zfz')+";\""+$('.www4').attr('data-id')+"\":"+$('.www4').attr('data-zfz')+";\""+$('.www5').attr('data-id')+"\":"+$('.www5').attr('data-zfz')+";\""+$('.www6').attr('data-id')+"\":"+$('.www6').attr('data-zfz')+";\""+$('.www7').attr('data-id')+"\":"+$('.www7').attr('data-zfz')+";\""+$('.www8').attr('data-id')+"\":"+$('.www8').attr('data-zfz')+";\""+$('.www9').attr('data-id')+"\":"+$('.www9').attr('data-zfz')+"}"; */      
                    /*  console.log(linshi)  */
                    })
                })
                
            },500)  

        //提交计算
            
        var callbamk=function(){
             function GetJsonData() {
                var json = $('.www0').attr('data-id')+":"+$('.www0').attr('data-zfz')+";"+$('.www1').attr('data-id')+":"+$('.www1').attr('data-zfz')+";"+$('.www2').attr('data-id')+":"+$('.www2').attr('data-zfz')+";"+$('.www3').attr('data-id')+":"+$('.www3').attr('data-zfz')+";"+$('.www4').attr('data-id')+":"+$('.www4').attr('data-zfz')+";"+$('.www5').attr('data-id')+":"+$('.www5').attr('data-zfz')+";"+$('.www6').attr('data-id')+":"+$('.www6').attr('data-zfz')+";"+$('.www7').attr('data-id')+":"+$('.www7').attr('data-zfz')+";"+$('.www8').attr('data-id')+":"+$('.www8').attr('data-zfz')+";"+$('.www9').attr('data-id')+":"+$('.www9').attr('data-zfz');
                return json;
             }
             console.log(JSON.stringify(GetJsonData())) 
            /*  提交答案 */
            if(flag=!''){
                 $.ajax({
                        url: '/worldCup/calculatedFraction',
                        type: 'get',
                        data: {
                            sheet :JSON.stringify(GetJsonData())
                        }, 
                        success: function(data) {
                            var d = data.json;
                            if(d.code==200){
                                $('.fenshuzhi').val(d.obj.score);
                                $('.fenshutip').val(d.obj.scoreMsg);
                                window.location.href="/worldCup/worldResult?token=${token}&tips="+$('.fenshutip').val()+"&score="+$('.fenshuzhi').val()
                            }
                        },
                        error: function(d) {}
                    }); 
            }
             
        }
    
          
         
         
        
        

        }); 
                 
(function(doc, win) {
    var docEl = doc.documentElement,
        resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
        recalc = function() {
            var clientWidth = docEl.clientWidth;
            if(!clientWidth) return;
            if(clientWidth >= 750) {
                docEl.style.fontSize = '100px';
            } else {
                docEl.style.fontSize = 100 * (clientWidth / 750) + 'px';
            }
        };
    if(!doc.addEventListener) return;
    win.addEventListener(resizeEvt, recalc, false);
    doc.addEventListener('DOMContentLoaded', recalc, false);
})(document, window);
        
        
</script>
</body>
</html>
