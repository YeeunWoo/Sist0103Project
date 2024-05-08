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
<div style="margin: 50px auto; width: 1000px;">

	<button type="button" class="btn btn-info" onclick="location.href='writeform'">자동차 정보 입력</button><br><br>
	
	<c:if test="${totalCount==0 }">
		<h3 class="alert alert-info">저장된 정보가 없습니다</h3>
	</c:if>
	<c:if test="${totalCount>0 }">
		<h3 class="alert alert-info">총 ${totalCount }개의 정보가 있습니다</h3>
		<hr>
		<table class="table table-bordered">
			<tr>
				<th width="80">번호</th>
				<th width="80">자동차명</th>
				<th width="80">차량색상</th>
				<th width="80">차량가격</th>
				<th width="80">구입일</th>
				<th width="80">편집</th>
			</tr>
			<c:forEach var="dto" items="${list }" varStatus="i">
			<tr>
				<td>
					${i.count }
				</td>
				<td>
					${dto.carname }
				</td>
				<td>
					<div style="20px; height:20px; background-color:${dto.carcolor}"></div>
				</td>
				<td>
					<fmt:formatNumber value="${dto.carprice }" type="currency"/>
				</td>
				<td>
					${dto.carguip }
				</td>
				<td>
					<button type="button" class="btn btn-outline-info btn-sm" onclick="location.href='updateform?num=${dto.num}'">수정</button>
					<button type="button" class="btn btn-outline-danger btn-sm" onclick="location.href='delete?num=${dto.num}'">삭제</button>
				</td>
			</tr>
			</c:forEach>
		</table>
	</c:if>
</div>	
</body>
</html>