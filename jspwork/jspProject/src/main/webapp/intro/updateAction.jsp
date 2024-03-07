<%@page import="intro.model.IntroDto"%>
<%@page import="intro.model.IntroDao"%>
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
  request.setCharacterEncoding("utf-8");
  String hobby=request.getParameter("hobby");
%>

<jsp:useBean id="dao" class="intro.model.IntroDao"/>
<jsp:useBean id="dto" class="intro.model.IntroDto"/>
<jsp:setProperty property="*" name="dto"/>

<%


//update
dao.updateIntro(dto);

//목록으로 이동
response.sendRedirect("introList.jsp");
%>
</body>
</html>