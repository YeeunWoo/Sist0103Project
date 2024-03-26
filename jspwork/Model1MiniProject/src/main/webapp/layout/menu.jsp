<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<%
  //프로젝트 경로
  String root=request.getContextPath();

	String loginok = (String)session.getAttribute("loginok");
	String myid=(String)session.getAttribute("myid");
%>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="<%=root%>" style="color: black; text-decoration: none;"> <img src="<%=root%>/image/title.png"></a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            카테고리
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="#"><i class="icon-wrench"></i> 수납/정리</a></li>
                            <li><a class="dropdown-item" href="#"><i class="icon-credit-card"></i> 가구</a></li>
                            <li><a class="dropdown-item" href="#"><i class="icon-gift"></i> 침대/매트리스</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            회원
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="index.jsp?main=member/addform.jsp"><i class="icon-wrench"></i> 회원가입</a></li>
                            <% if(loginok != null && myid.equals("admin")) { %>
                                <li><a class="dropdown-item" href="index.jsp?main=member/memberlist.jsp"><i class="icon-credit-card"></i> 회원목록</a></li>
                            <% } %>
                            <li><a class="dropdown-item" href="index.jsp?main=member/mypage.jsp"><i class="icon-gift"></i> 마이페이지</a></li>
                            <li><a class="dropdown-item" href="index.jsp?main=login/loginmain.jsp"><i class="icon-gift"></i> 로그인</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            방명록
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="index.jsp?main=memberguest/guestlist.jsp">회원방명록</a></li>
                            <li><a class="dropdown-item" href="#">Medium Image</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <% MemberDao dao = new MemberDao();
                           String name = dao.getName(myid);
                           if(loginok==null){ %>
                            <a href="index.jsp?main=login/loginform.jsp" class="nav-link">로그인</a>
                            <% } else { %>
                            <span class="nav-link" style="float: left;"><b><%=name %>님</b></span>
                            <a href="login/logoutaction.jsp" class="nav-link" style="float: right;">로그아웃</a>
                            <% } %>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
