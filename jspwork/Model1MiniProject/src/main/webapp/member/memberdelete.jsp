<%@page import="data.dao.MemberDao"%>

<%
	String num = request.getParameter("num");
	MemberDao dao = new MemberDao();
	dao.deleteMember(num);
	response.sendRedirect("../index.jsp?main=member/memberlist.jsp");
%>
