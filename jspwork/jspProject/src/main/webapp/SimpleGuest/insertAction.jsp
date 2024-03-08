<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="dao" class="simpleguest.model.GuestDao"/>
<jsp:useBean id="dto" class="simpleguest.model.GuestDto"/>
<jsp:setProperty property="*" name="dto"/>

<%
dao.insertGuest(dto);
response.sendRedirect("guestList.jsp");
%>
