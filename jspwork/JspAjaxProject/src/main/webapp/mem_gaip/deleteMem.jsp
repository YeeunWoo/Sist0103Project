<%@page import="mem_gaip.model.MemgaipDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
MemgaipDao dao = new MemgaipDao();
dao.deleteMem(num);
response.sendRedirect("memList.jsp");
%>