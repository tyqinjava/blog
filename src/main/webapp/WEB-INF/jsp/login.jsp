<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<!doctype html>
<html>
<head>
<title>登录页面</title>
<%@include file="common.jsp"%>
<link rel="stylesheet" type="text/css"
	href="/bbs-ssm/resources/css/login.css">
<script type="text/javascript" src="/bbs-ssm/resources/js/base64.js"
	charset="utf-8"></script>
<script type="text/javascript" src="/bbs-ssm/resources/js/login.js"
	charset="utf-8"></script>

</head>
<body>
	<div id="content">
		<h1>Flying Light BBS</h1>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">@</span> <input
				type="text" class="form-control" placeholder="Username"
				aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="input-group">
			<span class="input-group-addon" id="basic-addon1">@</span> <input
				type="password" class="form-control" placeholder="Password"
				aria-describedby="basic-addon1">
		</div>
		<br>
		<div class="button-group">
			<button class="btn btn-primary" href="javscript:;">登录</button>
			<a href="/bbs-ssm/resources/html/reg.html" class="btn btn-info">注册</a>
		</div>
	</div>
	<div id="footer">
		<ul>
			<li class="no_border"><a href="javascript:;">版本1.0</a></li>
			<li><a href="/bbs/about.html">关于作者</a></li>
			<li><a href="/bbs/cantact.html">联系作者</a></li>
			<li><a href="/bbs/feedback.hml">意见反馈</a></li>
			<li><a href="/bbs/help.html">帮助中心</a></li>
		</ul>
		<p>Copyright © 2017 飞光BBS All rights reserved.</p>
	</div>
</body>
</html>