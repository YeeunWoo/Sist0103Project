<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
ul.menu {
	list-style: none;
	padding: 0;
	margin: 0;
	display: flex;
}

ul.menu li {
	width: 130px;
	height: 60px;
	text-align: center;
	line-height: 60px;
	font-size: 20px;
	background-color: #d0d0d0;
	cursor: pointer;
}

ul.menu li a {
	color: black;
	text-decoration: none;
	display: block;
	height: 100%;
	width: 100%;
}
</style>
</head>
<c:set var="root" value="<%=request.getContextPath()%>" />
<body>
	<ul class="menu">
		<li><a href="${root }/">Home</a></li>
		<li><a href="${root }/ipgo/writeform">상품등록</a></li>
		<li><a href="${root }/ipgo/list">상품목록</a></li>
		<li><a href="${root }/member/list">회원목록</a></li>
		<li><a href="${root }/member/form">회원가입</a></li>
		<li><a href="${root }/board/list">게시판</a></li>
		<li><a href="${root }/load/map">오시는길</a></li>
	</ul>
</body>
</html>