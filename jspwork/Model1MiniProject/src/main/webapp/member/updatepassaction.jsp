<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String pass = request.getParameter("pass");
MemberDao dao = new MemberDao();
boolean isEqualPass = dao.isEqualPass(num, pass);

if (isEqualPass) {
	response.sendRedirect("../index.jsp?main=member/updateform.jsp?num="+num);
} else {%>
	<script type="text/javascript">
		alert("비밀번호가 맞지 않습니다");
		history.back();
	</script>
	
<%
}
%>