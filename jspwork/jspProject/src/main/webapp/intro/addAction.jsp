<%@page import="intro.model.IntroDao"%>
<%@page import="intro.model.IntroDto"%>
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
  request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="dao" class="intro.model.IntroDao"/>
<jsp:useBean id="dto" class="intro.model.IntroDto"/>

<jsp:setProperty property="*" name="dto"/>

<%
String[] hobbies=request.getParameterValues("hobby");
String hobbiesString = "";

if (hobbies != null && hobbies.length > 0) {
 hobbiesString = String.join(",", hobbies);
} else {
    hobbiesString = "없음"; 
}

dto.setHobby(hobbiesString);
dao.insertIntro(dto);

response.sendRedirect("introList.jsp");
%>

</body>
</html>