<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
%>

<form action="member/updatepassaction.jsp" method="post">
    <input type="hidden" name="num" value="<%= num %>">
    <input type="password" name="pass" placeholder="비밀번호를 입력하세요"> 
    <button type="submit">확인</button>
</form>
