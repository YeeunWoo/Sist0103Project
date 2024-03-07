<%@page import="team.model.TeamDao"%>
<%@page import="team.model.TeamDto"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	String driver = request.getParameter("driver");
	String addr = request.getParameter("addr");

	TeamDto dto = new TeamDto();
	
	dto.setName(name);
	dto.setDriver(driver==null?"없음":"있음");
	dto.setAddr(addr);

	//dao선언
	TeamDao dao = new TeamDao();
	//insert메서드 호출
	dao.insertTeam(dto);
	
	//목록파일로 이동
	response.sendRedirect("teamList.jsp");
%> --%>

<% 
request.setCharacterEncoding("utf-8");
%>
<!-- jsp:useBean: new로 객체 생성하는 것과 같음 -->
<jsp:useBean id="dao" class="team.model.TeamDao"></jsp:useBean>
<jsp:useBean id="dto" class="team.model.TeamDto"></jsp:useBean>
<!-- dto의 멤버와 같은 이름의 태그는 자동으로 읽어서  dto에 넣음 -->
<jsp:setProperty property="*" name="dto"/>
<% 
String driver = request.getParameter("driver");
dto.setDriver(driver==null?"없음":"있음");

dao.insertTeam(dto);
response.sendRedirect("teamList.jsp");
%>