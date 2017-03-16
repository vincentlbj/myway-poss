<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>添加酒店</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=request.getContextPath()%>/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="<%=request.getContextPath()%>/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="<%=request.getContextPath()%>/assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
    <%@ include file="/common-header.jsp" %>
    <div class="container-fluid">
      <div class="row">
        <%@ include file="/sidebar.jsp" %>
        
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

          <h2 class="sub-header">酒店详情</h2>
          <form class="form-horizontal" role="form" id="form" action="<%=request.getContextPath()%>/hotel/insertSubmit" method="post">
	          
	          <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">酒店名字</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" name="name">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="address" class="col-sm-2 control-label">地址</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="address" name="address">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="baiduPoint" class="col-sm-2 control-label">百度api地址(如广州塔;广州)</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="baiduPoint" name="baiduPoint">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="introduction" class="col-sm-2 control-label">介绍</label>
			    <div class="col-sm-10">
			      <textarea class="form-control" id="introduction" name="introduction" rows="5"></textarea>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="price" class="col-sm-2 control-label">价格</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="price" name="price">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="installation" class="col-sm-2 control-label">设施信息(json格式)</label>
			    <div class="col-sm-10">
			      <textarea class="form-control" id="installation" name="installation" rows="5"></textarea>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="policy" class="col-sm-2 control-label">酒店政策(json格式)</label>
			    <div class="col-sm-10">
			      <textarea class="form-control" id="policy" name="policy" rows="5"></textarea>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="around" class="col-sm-2 control-label">周边信息</label>
			    <div class="col-sm-10">
			      <textarea class="form-control" id="around" name="around" rows="5"></textarea>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="headerPicture" class="col-sm-2 control-label">头部图片链接</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="headerPicture" name="headerPicture">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="picture" class="col-sm-2 control-label">图片墙链接(分号分隔)</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="picture" name="picture">
			    </div>
			  </div>
			</form>
			
			<center>
				<div class="btn-group" role="group" aria-label="...">
					<button type="button" onclick="$('#form').submit();" class="btn btn-info">添加</button>
					<button type="button" onclick="location.href='<%=request.getContextPath()%>/hotel/insert'" class="btn btn-danger">重置</button>
				</div>
			</center>
			
		  
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="<%=request.getContextPath()%>/assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="<%=request.getContextPath()%>/dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="<%=request.getContextPath()%>/assets/js/vendor/holder.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="<%=request.getContextPath()%>/assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
