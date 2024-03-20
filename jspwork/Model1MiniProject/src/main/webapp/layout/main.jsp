<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
.center-image {
	display: flex;
	justify-content: center;
}
h3 {
        text-align: center;
    }
</style>
</head>
<%
//프로젝트 경로
String root = request.getContextPath();
%>
<body>

	<div style="display: flex; justify-content: center;">
		<img alt="" src="<%=root%>/image/main_visual03.jpg"
			style="width: 1600px;">
	</div>
	<br>
	<br>

	<h3>쌍용교육센터 모집과정</h3>
	<br>
	<div class="center-image">
		<img src="<%=root%>/image/main_con01_img01.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img02.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img03.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img04.jpg">
	</div>


</body>
</html>
