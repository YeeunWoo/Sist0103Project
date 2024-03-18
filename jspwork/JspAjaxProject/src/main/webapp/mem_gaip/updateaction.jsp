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
    
    // 파일 업로드를 위한 부분
    String realPath = getServletContext().getRealPath("/upload");
    int uploadSize = 1024 * 1024 * 5; // 5mb
    MultipartRequest multi = null;
    multi = new MultipartRequest(request, realPath, uploadSize, "utf-8", new DefaultFileRenamePolicy());

    MemgaipDao dao = new MemgaipDao();
    MemgaipDto dto = new MemgaipDto();

    dto.setM_num(num);
    dto.setM_name(name);
    dto.setM_pass(pass);
    dto.setM_id(id);
    dto.setM_hp(hp);

    String photo = multi.getFilesystemName("m_photo");
    if (photo == null) {
        dto.setM_photo("../image/연예인사진/noimage.png"); // 기존의 사진 유지
    } else {
        dto.setM_photo("../upload/" + photo);
    }

    // 수정 메서드 호출
    dao.updateMem(dto);

    // 목록으로 이동
    response.sendRedirect("memList.jsp");
    %>
</body>
</html>
