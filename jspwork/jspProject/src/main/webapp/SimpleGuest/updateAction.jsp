<%@page import="simpleguest.model.GuestDto"%>
<%@page import="simpleguest.model.GuestDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String num = request.getParameter("num");
String pass = request.getParameter("pass");
String nickname = request.getParameter("nickname");
String content = request.getParameter("content");
String image = request.getParameter("image");

GuestDao dao = new GuestDao();
//비밀번호가 맞으면 수정 후 목록으로
if(dao.isEqualPass(num, pass)){
	GuestDto dto = new GuestDto();
	dto.setNum(num);
	dto.setNickname(nickname);
	dto.setContent(content);
	dto.setImage(image);
	
	dao.updateGuest(dto);
	
	response.sendRedirect("guestList.jsp");
} else{%>
	<SCRIPT type="text/javascript">
		alert("비밀번호가 맞지 않습니다");
		history.back();
	</SCRIPT>	
<%}

%>