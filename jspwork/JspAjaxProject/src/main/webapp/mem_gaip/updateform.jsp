<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<title>회원정보 수정</title>
</head>
<%
String num=request.getParameter("num");
MemgaipDao dao=new MemgaipDao();
MemgaipDto dto=dao.getData(num);
%>
<body>
    <div style="margin: 50px 100px; width: 500px;">
        <form action="updateaction.jsp" method="post" enctype="multipart/form-data">
            <table class="table table-bordered">
                <caption align="top">
                    <b>회원정보 수정</b>
                </caption>
                <input type="hidden" name="m_num" value="<%=num%>">
                <tr>
                    <td width="120" class="table-primary">아이디</td>
                    <td>
                        <input type="text" class="form-control" style="width: 120px;" name="m_id" value="<%=dto.getM_id()%>" readonly>
                    </td>
                </tr>
                <tr>
                    <td width="120" class="table-primary">비밀번호</td>
                    <td>
                        <input type="password" class="form-control" style="width: 120px;" name="m_pass" value="<%=dto.getM_pass()%>" required>
                    </td>
                </tr>
                <tr>
                    <td width="120" class="table-primary">회원명</td>
                    <td>
                        <input type="text" class="form-control" style="width: 120px;" name="m_name" value="<%=dto.getM_name()%>" required>
                    </td>
                </tr>
                <tr>
                    <td width="120" class="table-primary">사진</td>
                    <td>
                        <!-- 기존 사진명 표시 -->
                        <input type="text" class="form-control" style="width: 200px;" value="<%=dto.getM_photo()%>" readonly>
                        <!-- 파일 변경 시에만 파일 선택 -->
                        <input type="file" class="form-control" style="width: 200px;" name="m_photo">
                    </td>
                </tr>
                <tr>
                    <td width="120" class="table-primary">핸드폰</td>
                    <td>
                        <input type="text" class="form-control" style="width: 180px;" name="m_hp" value="<%=dto.getM_hp()%>" required>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <button type="submit" class="btn btn-info">정보 수정</button>
                        <button type="button" class="btn btn-secondary" onclick="history.back()">취소</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
