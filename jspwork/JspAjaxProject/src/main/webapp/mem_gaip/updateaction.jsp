<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<title>회원정보 수정 처리</title>
</head>
<body>
    <%
    request.setCharacterEncoding("utf-8");

    String num = request.getParameter("m_num");
    String name = request.getParameter("m_name");
    String pass = request.getParameter("m_pass");
    String id = request.getParameter("m_id");
    String hp = request.getParameter("m_hp");

    MemgaipDao dao = new MemgaipDao();
    MemgaipDto dto = new MemgaipDto();

    dto.setM_num(num);
    dto.setM_name(name);
    dto.setM_pass(pass);
    dto.setM_id(id);
    dto.setM_hp(hp);
	
    // 수정 메서드 호출
    dao.updateMem(dto);

    // 목록으로 이동
    response.sendRedirect("memList.jsp");
    %>
</body>
</html>
