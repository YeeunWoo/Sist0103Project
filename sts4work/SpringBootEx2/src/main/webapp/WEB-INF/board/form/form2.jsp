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
		<h1 class="alert alert-info">폼데이터 dto 읽기</h1>
		<br>
		<form action="show2" method="post">
			<table class="table table-bordered">
				<tr>
					<th>학생명</th>
					<td><input type="text" name="name" class="form-control"
						required="required"></td>
				</tr>
				<tr>
					<th>연락처</th>
					<td><input type="text" name="hp" class="form-control"
						required="required"></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="addr" class="form-control"
						required="required"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><button type="submit"
							class="btn btn-info">전송</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>