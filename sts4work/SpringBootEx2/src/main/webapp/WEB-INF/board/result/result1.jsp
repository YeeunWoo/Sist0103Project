<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
</head>
<body>
	<div style="margin: 50px auto; width: 500px;">				
			<table class="table table-bordered">
				<tr>
					<th>학생명</th>
					<td>${name }</td>
				</tr>
				<tr>
					<th>자바점수</th>
					<td>${java }</td>
				</tr>
				<tr>
					<th>스프링점수</th>
					<td>${spring }</td>
				</tr>
				<tr>
					<th>총점</th>
					<td>${tot }</td>
				</tr>
				<tr>
					<th>평균</th>
					<td>${avg}</td>
				</tr>
			</table>
	</div>
</body>
</html>