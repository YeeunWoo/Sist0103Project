<%@page import="data.dao.MemberDao"%>
<%@page import="data.dto.MemberDto"%>
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
.btn-container {
    display: flex;
    gap: 5px; /* 버튼 사이의 간격 설정 */
}

.btn-container .btn {
    width: auto;
}
</style>
<script type="text/javascript">
	function delfunc(num){
		var yes=confirm("강퇴하시겠습니까?");
		if(yes)
			location.href='member/memberdelete.jsp?num='+num;
	}
</script>
</head>
<body>
    <div style="margin: 100px 100px; width: 900px;">
        <%
        MemberDao dao = new MemberDao();
        List<MemberDto> list = dao.getAllMembers();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        %>
        <h5 class="alert alert-info"><b>총 <%=list.size()%>명의 회원이 있습니다</b></h5>
        <table class="table table-bordered">
            <caption align="top">
                <b>회원 목록</b>
            </caption>
            <tr class="table-light" align="center">
                <th width="80">번호</th>
                <th width="100">아이디</th>
                <th width="180">회원명</th>
                <th width="200">전화번호</th>
                <th width="200">주소</th>
                <th width="200">이메일</th>
                <th width="200">가입일</th>
                <th width="200">비고</th>
            </tr>

            <%
            int i = 1;
            for (MemberDto dto : list) {
            %>

            <tr align="center">
                <td><%=i++%></td>
                <td><%=dto.getId()%></td>
                <td><%=dto.getName()%></td>
                <td><%=dto.getHp()%></td>
                <td><%=dto.getAddr()%></td>
                <td><%=dto.getEmail()%></td>
                <td><%=sdf.format(dto.getGaipday())%></td>
                <td>
                    <div class="btn-container">
                        <button type="button" class="btn btn-outline-danger btn-sm"
                            onclick="delfunc(<%=dto.getNum()%>)">
                            <i class="bi bi-trash"></i>강퇴
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
