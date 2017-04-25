<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<div class="col-sm-3 col-md-2 sidebar">
  <ul class="nav nav-sidebar">
    <li id="index"><a href="<%=request.getContextPath()%>/index" style="font-size:20px">主页 </a></li>
  </ul>
  <ul class="nav nav-sidebar">
    <li id="tour"><a href="<%=request.getContextPath()%>/tour/list" style="font-size:20px">线路管理 </a></li>
    <li id="hotel"><a href="<%=request.getContextPath()%>/hotel/list" style="font-size:20px">酒店管理</a></li>
    <li id="ticket"><a href="<%=request.getContextPath()%>/ticket/list" style="font-size:20px">门票管理</a></li>
    <li id="exposure"><a href="<%=request.getContextPath()%>/exposure/list" style="font-size:20px">曝光台</a></li>
  </ul>
  <ul class="nav nav-sidebar">
    <li id="order"><a href="<%=request.getContextPath()%>/order/list" style="font-size:20px">订单中心</a></li>
    <li id="diary"><a href="<%=request.getContextPath()%>/diary/list" style="font-size:20px">博客中心</a></li>
    <li id="user"><a href="<%=request.getContextPath()%>/user/list" style="font-size:20px">用户中心</a></li>
    <li id="contact"><a href="<%=request.getContextPath()%>/contact/list" style="font-size:20px">用户反馈</a></li>
  </ul>
</div>
<script>
	$("#${item}").attr("class","active");
</script>