<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Page couldn't be found.</title>
		<link rel="stylesheet" media="screen" href="<%=request.getContextPath()%>/css/error.css">
		
		<script language="JavaScript">
			function dosearch() {
			var sf=document.searchform;
			var submitto = sf.sengine.value + escape(sf.searchterms.value);
			window.location.href = submitto;
			return false;
			}
		</script>
	</head>
	<body>
		
		<div class="header">
			<img src="<%=request.getContextPath()%>/images/logo-white.png" style="height:45px"/>
		</div>
		
		<p class="error">ERROR</p>
		
		<div class="content">
			<h2>出现错误咯！</h2>
			
			<p class="text">
				<!-- Change www.yoursite.com to your website domain -->
			</p>
				
			<p class="links">
				<a id="button" href="<%=request.getContextPath()%>/index">&larr; 返回主页</a> <a href="#">关于我们</a> <a href="#">博客</a>
			</p>
		</div>
		
	</body>
</html>