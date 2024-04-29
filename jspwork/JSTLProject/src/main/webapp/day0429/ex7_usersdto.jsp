<%@page import="jstl.data.UsersDto"%>
<%@page import="java.util.List"%>
<%@page import="jstl.data.UsersDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<%
UsersDao dao = new UsersDao();
List<UsersDto> list = dao.getAllUsers();
request.setAttribute("list", list);
%>
</head>
<body>
	<div style="margin: 30px 50px;">
		<h3 class="alert alert-danger" style="width:600px;">Users 목록</h3>
		<br>
		
		<table class="table table-bordered" style="width:600px;">
			<tr>
				<th>번호</th><th>ID</th><th>이름</th><th>이메일</th><th>가입일</th>
			</tr>
			<c:forEach var="dto" items="${list }" varStatus="i">
			<tr>
				<td>${i.count }</td>
				<td>${dto.id }</td>
				<td>${dto.name}</td>
				<td>${dto.email}</td>
				<td>${dto.signup_date}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>