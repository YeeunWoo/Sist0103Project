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
		<div style="text-align: right;">
			<button type="button" class="btn btn-outline-secondary"
				onclick="location.href='addform'">상품등록</button>
		</div>

		<br>
		<br>
		<c:if test="${totalCount==0 }">
			<div class="alert alert-secondary">
				<b>저장된 정보가 없습니다</b>
			</div>
		</c:if>

		<c:if test="${totalCount>0 }">
			<div class="alert alert-secondary">
				<b>총 ${totalCount }개의 상품정보가 있습니다</b>
			</div>
		</c:if>

		<br>

		<c:forEach var="a" items="${list }">
			<table class="table table-bordered">
				<tr>
					<td><c:if test="${a.photoname!=null }">
							<img alt="" src="../photo/${a.photoname }" style="width: 150px;"
								align="left">

						</c:if> <c:if test="${a.photoname==null }">
							<img alt="" src="../photo/noImage.jpeg" style="width: 150px; margin-right: 20px;" align="left">

						</c:if>

						<h5>상품명: ${a.sang }</h5>
						<h5>
							상품단가:
							<fmt:formatNumber value="${a.dan }" type="currency" />
						</h5>
						<h5>
							입고일:
							<fmt:formatDate value="${a.ipgoday }" pattern="yyyy-MM-dd HH:mm" />
						</h5>
						<h5>
							<button type="button" class="btn btn-outline-secondary"
								onclick="location.href='updateform?num=${a.num}'">수정</button>
							<button type="button" class="btn btn-outline-secondary"
								onclick="location.href='delete?num=${a.num}'">삭제</button>
						</h5></td>
				</tr>
			</table>

		</c:forEach>



	</div>


</body>
</html>