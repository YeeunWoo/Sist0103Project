<%@page import="data.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
String root = request.getContextPath();
String loginok = (String)session.getAttribute("loginok");
String myid=(String)session.getAttribute("myid");
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<a class="navbar-brand" href="<%=root%>">
		<img src="<%=root%>/image/title.png" style="max-height: 50px;">
	</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">홈 <span
					class="sr-only">(current)</span></a></li>
			<li class="nav-item"><a class="nav-link" href="#">가구 카테고리</a></li>
			<li class="nav-item"><a class="nav-link" href="#">특별 상품</a></li>
			<li class="nav-item dropdown"><a class="nav-link" href="#">게시판</a></li>
		</ul>
		<form class="form-inline my-2 my-lg-0 mr-3">
			<input class="form-control mr-sm-2" type="search" placeholder="검색"
				aria-label="Search">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
		</form>
		<ul class="navbar-nav">
			<li class="nav-item">
				<%
				UserDao dao = new UserDao();
				String name = dao.getName(myid);

				if (loginok == null) {
				%> <a class="nav-link" href="index.jsp?main=login/loginform.jsp">로그인</a>
				<%
				} else {
				%> <b><%=name%>님</b> <a class="nav-link"
				href="login/logoutaction.jsp">로그아웃</a> <%
				}
				%>
			</li>
		</ul>
	</div>
</nav>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

