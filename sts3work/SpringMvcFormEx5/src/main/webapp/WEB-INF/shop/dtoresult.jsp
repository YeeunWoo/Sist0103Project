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
	<h2>상품 정보 출력_dto</h2>
	<div style="color: ${shopDto.color}">
		상품명: ${shopDto.sang }<br>
		수량: ${shopDto.su }<br>
		단가: <fmt:formatNumber value="${shopDto.dan }" type="currency"/><br>
		총 금액: <fmt:formatNumber value="${shopDto.su*shopDto.dan }" type="currency"/><br>
	</div>
</body>
</html>