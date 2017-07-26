$(document).ready(function(){
	
	$('.btn').eq(0).click(function(){
		var $username=$(".form-control").eq(0).val();
		var $password=$(".form-control").eq(1).val();
		alert($username+" "+$password);
	});
	/*$password;*/
	
/*	submitBtn.onclick=function(){
		var username=confirm[0].value;
		var password=confirm[1].value;
		if(username==""||password=="")return;
		var xhr=new XMLHttpRequest();
		var url="/bbs/login";
		var param="username="+username+"&password="+password;
		xhr.open("post", url,true);
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send(param);
		xhr.onreadystatechange=function(){
			if(this.readyState===4&&this.status==200){
				if(this.responseText=="")return;
				var data=window.eval("("+this.responseText+")");
				if(data["state"]==0){//等于0成功
					msg[0].innerHTML="";
					msg[1].innerHTML="";
					window.location.href="/bbs-ssm/login";
				}else if(data["state"]==1){
				    msg[0].innerHTML="账号不存在";
				}else{
					msg[1].innerHTML="密码错误";
				}
			}
		}
	}*/
	
});
