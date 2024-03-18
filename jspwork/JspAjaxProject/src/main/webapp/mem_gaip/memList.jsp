<%@page import="mem_gaip.model.MemgaipDto"%>
<%@page import="mem_gaip.model.MemgaipDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
    rel="stylesheet">
<link
    href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
    rel="stylesheet">
<link 
    href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css"
    rel="stylesheet">
<title>회원 목록</title>
<style type="text/css">
img {
    width: 60px;
    height: 60px;
    border-radius: 50%;
}

.member-info {
    display: flex;
    align-items: center; /* 이미지와 텍스트를 수직으로 정렬하기 위한 CSS */
}

.member-name {
    margin-left: 10px; /* 이미지와 텍스트 사이의 간격 조절 */
}

.btn-container {
    display: flex;
    gap: 5px; /* 버튼 사이의 간격 설정 */
}

.btn-container .btn {
    width: auto;
}
</style>
</head>
<body>
    <div style="margin: 50px 100px; width: 800px;">
        <button type="button" class="btn btn-outline-info"
            onclick="location.href='addForm.jsp'" style="margin-left: auto; margin-right: 0;">
            <i class="bi bi-plus"></i>회원 추가
        </button>
        <br><br>
        <%
        MemgaipDao dao = new MemgaipDao();
        List<MemgaipDto> list = dao.getAllDatas();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        %>
        <h6><b>총 <%=list.size()%>명의 회원이 있습니다</b></h6>
        <table class="table table-bordered">
            <caption align="top">
                <b>회원 목록</b>
            </caption>
            <tr class="table-light">
                <th width="80">번호</th>
                <th width="100">아이디</th>
                <th width="180">회원명</th>
                <th width="200">전화번호</th>
                <th width="200">가입일</th>
                <th width="160">편집</th>
            </tr>

            <%
            int i = 1;
            for (MemgaipDto dto : list) {
            %>

            <tr>
                <td><%=i++%></td>
                <td><%=dto.getM_id()%></td>
                <td>
                    <div class="member-info">
                        <img src="<%=dto.getM_photo()%>" alt="프로필 이미지">
                        <div class="member-name"><%=dto.getM_name()%></div>
                    </div>
                </td>
                <td align="center"><%=dto.getM_hp()%></td>
                <td align="center"><%=sdf.format(dto.getGaipday())%></td>
                <td align="center">
                    <div class="btn-container">
                        <button type="button" class="btn btn-outline-primary btn-sm"
                            onclick="location.href='updateform.jsp?num=<%=dto.getM_num()%>'">
                            <i class="bi bi-pencil-square"></i>수정
                        </button>
                        <button type="button" class="btn btn-outline-danger btn-sm"
                            onclick="location.href='deleteMem.jsp?num=<%=dto.getM_num()%>'">
                            <i class="bi bi-trash"></i>삭제
                        </button>
                    </div>
                </td>
            </tr>

            <%
            }
            %>
        </table>
    </div>
</body>
</html>
