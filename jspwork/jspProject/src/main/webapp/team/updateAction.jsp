<%@page import="team.model.TeamDao"%>
<%@page import="team.model.TeamDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Action</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

String num = request.getParameter("num");
String name = request.getParameter("name");
String driver = request.getParameter("driver");
String addr = request.getParameter("addr");

TeamDao dao = new TeamDao();
TeamDto dto = new TeamDto();
dto.setName(name);
dto.setDriver(driver == null ? "없음" : "있음");
dto.setAddr(addr);

// 수정된 데이터를 DB에 업데이트
dao.updateTeam(dto, num);

// 목록 페이지로 이동
response.sendRedirect("teamList.jsp");
%>
</body>
</html>
