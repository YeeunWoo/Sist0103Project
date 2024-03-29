<%@page import="data.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dao.MemberDao"%>
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
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>마이페이지</title>
<%
MemberDao dao = new MemberDao();
List<MemberDto> list = dao.getAllMembers();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

String loginok = (String) session.getAttribute("loginok");
String myid = (String) session.getAttribute("myid");

//로그인 상태인지 확인
if (loginok == null) {
 // 로그인 상태가 아니라면 로그인 페이지로 리다이렉트
 response.sendRedirect("index.jsp?main=login/loginmain.jsp");
}
%>
<script type="text/javascript">
	function delfunc(num) {
		//alert(num);
		$("#delnum").val(num);
		$("#myModal").modal('show');

		$("button.btndel").click(
				function() {

					var num = $("#delnum").val();
					var pass = $("#delpass").val();
					// 비밀번호 확인을 위한 AJAX 요청
					alert(num + "," + pass);
					//삭제파일 호출
					location.href = "member/deletemypage.jsp?num=" + num
							+ "&pass=" + pass;

				})

	}
</script>
</head>

<body>
	<div style="margin: 100px 100px; width: 900px;">
		<table class="table table-bordered">
			<caption align="top">
				<b>마이페이지</b>
			</caption>
			<%
			for (MemberDto dto : list) {
				if (loginok != null && myid.equals(dto.getId())) {
			%>
			<tr>
				<td rowspan="6" align="center" valign="middle"><img
					src="image/shopimg.png" id="mainimg"></td>
				<td>회원명: <%=dto.getName()%>
				</td>
				<td rowspan="6" style="width: 200px" align="center" valign="middle">
					<button type="button" class="btn btn-outline-info"
       				onclick="location.href='index.jsp?main=member/updatepassform.jsp&num=<%=dto.getNum()%>'">수정</button>

					<button type="button" class="btn btn-outline-danger"
						onclick="delfunc('<%=dto.getNum()%>')">탈퇴</button>
				</td>
			</tr>
			<tr>
				<td>아이디: <%=dto.getId()%></td>
			</tr>
			<tr>
				<td>이메일: <%=dto.getEmail()%></td>
			</tr>
			<tr>
				<td>전화번호: <%=dto.getHp()%></td>
			</tr>
			<tr>
				<td>주소: <%=dto.getAddr()%></td>
			</tr>
			<tr>
				<td>가입일: <%=sdf.format(dto.getGaipday())%></td>
			</tr>
			<%
				}
			}
			%>

		</table>
	</div>

	<!-- The Modal -->
	<div class="modal fade" id="myModal">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">

				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">삭제확인</h4>
					<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
				</div>

				<!-- Modal body -->
				<div class="modal-body d-inline-flex">
					<input type="hidden" id="delnum"> <b>삭제비밀번호: </b> <input
						type="password" id="delpass" class="form-control"
						style="width: 120px; margin-left: 10px">
				</div>

				<!-- Modal footer -->
				<div class="modal-footer">
					<button type="button" class="btn btn-danger btndel"
						data-bs-dismiss="modal">삭제</button>
				</div>

			</div>
		</div>
	</div>
</body>
</html>