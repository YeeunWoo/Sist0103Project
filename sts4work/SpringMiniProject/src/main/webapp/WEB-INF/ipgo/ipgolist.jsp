<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

	<div style="margin: 100px auto; width: 800px;">
		<b>${totalCount }개의 상품이 있습니다</b>
		<div style="text-align: right;">
			<button type="button" class="btn btn-outline-secondary"
				onclick="location.href='writeform'">상품추가</button>
		</div>
		<br>

		<table class="table table-bordered">

			<c:forEach var="dto" items="${list }">
				<tr>
					<td rowspan="4"><c:if test="${dto.photoname!='no' }">
							<c:forTokens var="pn" items="${dto.photoname }" delims=","
								begin="0" end="0">
								<a> <img src="../ipgoimage/${pn }" style="width: 150px;">
								</a>
							</c:forTokens>
						</c:if> <c:if test="${dto.photoname=='no' }">
							<img src="../image/noimage.png" style="width: 150px;">
						</c:if></td>
					<td><b>상품명: ${dto.sangpum }</b></td>
				</tr>

				<tr>
					<td><b>단가: <fmt:formatNumber value="${dto.price }"
								type="currency" /></b></td>
				</tr>
				<tr>
					<td><b>입고일: <fmt:formatDate value="${dto.ipgoday }"
								pattern="yyyy년 MM월 dd일" /></b></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" class="btn btn-secondary" onclick="location.href='updateform?num=${dto.num}'">수정</button>
						<button type="button" class="btn btn-secondary"
							onclick="location.href='delete?num=${dto.num}'">삭제</button>
					</td>
				</tr>
			</c:forEach>

		</table>

	</div>

</body>
</html>