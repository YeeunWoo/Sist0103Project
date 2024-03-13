<%@page import="log.medel.LogDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
String id=request.getParameter("id");
String pass=request.getParameter("pass");
String save=request.getParameter("savechk");

//아이디와 비번이 맞는 지 확인
LogDao db = new LogDao();
boolean flag = db.isLogin(id, pass);

//맞으면 세션저장 후 로그인 메인으로 이동
if(flag){
	//로그인 중인지 알 수 있는 세션저장
	session.setAttribute("loginok", "yes");
	//아이디와 체크값 저장
	session.setAttribute("idok",id);
	//체크하면 on, 체크 안 하면 null
	session.setAttribute("saveok", save);
	
	//세션 유지시간
	session.setMaxInactiveInterval(60*60*8); //8시간
	
	//로그인 메인
	response.sendRedirect("loginMain.jsp");
} else{%>
	<script type="text/javascript">
		alert("아이디와 비밀번호가 맞지 않습니다");
		history.back();
	</script>
<%}
%>
</body>
</html>