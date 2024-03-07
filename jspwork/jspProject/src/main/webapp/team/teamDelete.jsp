<%@page import="team.model.TeamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String num = request.getParameter("num");
TeamDao dao = new TeamDao();
dao.deleteTeam(num);
response.sendRedirect("teamList.jsp");
%>
</body>
</html>