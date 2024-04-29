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
	<!-- 한글 엔코딩 -->
	<fmt:requestEncoding value="utf-8"/>
	
	<form action="ex2_param,choose,if.jsp" method="post" style="width:300px;">
		<h2>이름</h2>
		<input type="text" name="irum" class="form-control">
		
		<h2>가고 싶은 나라</h2>
		<input type="text" name="nara" class="form-control">
		<br>
		<button type="submit" class="btn btn-info"> 결과확인</button>
	</form>
	
	<!-- 결과 출력(이름 입력 시 결과 출력) -->
	<c:if test="${!empty param.irum }">
		<h3>이름: ${param.irum }</h3>
		<h3>나라: ${param.nara }</h3>
		
		<c:choose>
			<c:when test="${param.nara=='영국'}">
				<h3 style="color:green;">영국 항공비는 250만원</h3>
			</c:when>
			<c:when test="${param.nara=='하와이'}">
				<h3 style="color:purple;">하와이 항공비는 370만원</h3>
			</c:when>
			<c:when test="${param.nara=='뉴욕'}">
				<h3 style="color:orange;">뉴욕 항공비는 480만원</h3>
			</c:when>
			<c:otherwise>
				<h3 style="color:red;">${param.nara } 가는 항공은 결항입니다.</h3>			
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>