<%@page import="java.util.ArrayList"%>
<%@page import="jstl.data.Student"%>
<%@page import="java.util.List"%>
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
</head>
<body>
<%
List<Student> list = new ArrayList<>();
list.add(new Student("김영민","서울시서초구",88));
list.add(new Student("우예은","인천시연수구",100));
list.add(new Student("유재석","대구시 교동",67));
list.add(new Student("이영자","서울시 길동",80));

request.setAttribute("list",list);
%>
<c:set value="0" var="sum"></c:set>
<table class="table table-bordered" style="width:500px;">
	<tr>
		<th>번호</th><th>인덱스</th><th>이름</th><th>주소</th><th>점수</th>
	</tr>
	<!-- items: 리스트가 받아올 배열명 varStatus: 상태변수 -->
	<c:forEach var="dto" items="${list }" varStatus="i">
	<tr>
		<td>${i.count }</td>
		<td>${i.index }</td>
		<td>${dto.name}</td>
		<td>${dto.addr}</td>
		<td>${dto.score}</td>
		<!-- 합계 -->
		<c:set var="sum" value="${sum + dto.score }"></c:set>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5" align="center"><h3>점수의 총 합계는 ${sum }입니다</h3></td>
	</tr>
</table>
</body>
</html>