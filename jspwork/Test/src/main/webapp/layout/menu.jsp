<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String root = request.getContextPath();
%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="<%=root%>"><img src="<%=root%>/image/title.png" style="max-height: 50px;"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">홈 <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">가구 카테고리</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">특별 상품</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">고객 서비스</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0 mr-3">
            <input class="form-control mr-sm-2" type="search" placeholder="검색" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
        </form>
        <ul class="navbar-nav">
            <li class="nav-item">
            	<%
            		
            	%>
                <a class="nav-link" href="#">로그인</a>
            </li>
        </ul>
    </div>
</nav>
