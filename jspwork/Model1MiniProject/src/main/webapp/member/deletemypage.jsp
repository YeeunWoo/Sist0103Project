<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String num = request.getParameter("num");
String pass = request.getParameter("pass");
MemberDao dao = new MemberDao();
boolean isEqualPass = dao.isEqualPass(num, pass); // 비밀번호 일치 여부 확인

if (isEqualPass) {
	// 비밀번호가 일치하면 회원 삭제 작업 수행
	dao.deleteMember(num);
	//세션삭제
	session.removeAttribute("loginok");
	session.removeAttribute("myid");
	session.removeAttribute("saveok");
	%>
	<script type="text/javascript">
		alert("탈퇴성공");
		location.href="../index.jsp";
	</script>
	
<%
	//response.sendRedirect("../index.jsp?main=member/memberlist.jsp");
} else {%>
	// 비밀번호가 일치하지 않으면 메인 페이지로 이동
	<script type="text/javascript">
		alert("비밀번호가 맞지 않습니다");
		history.back();
	</script>
	
<%
}
%>