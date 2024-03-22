<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<%
String num=request.getParameter("num");
MemberDao dao = new MemberDao();
MemberDto dto = dao.getDataMember(num);
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

String loginok = (String) session.getAttribute("loginok");
String myid = (String) session.getAttribute("myid");
%>
<script type="text/javascript">
$(function(){
  
	  //이메일 선택 이벤트
	  $("#selemail").change(function(){
		  
		  if($(this).val()=='-'){
			  $("#email2").val('');
		  }else{
			  $("#email2").val($(this).val());
		  }
	  });
	    
})

</script>
</head>
<body>
<div style="margin: 100px 100px; width: 500px;">
	<form action="member/updateaction.jsp" method="post" onsubmit="return check(this)">
	<input type="hidden" name="num" value="<%=num%>">
	   <table class="table table-bordered" >
	      <caption align="top"><b>회원가입</b></caption>
	      <tr>
	        <th width="100" class="table-success">아이디</th>
	        <td>
	        	<div class="d-inline-flex">
		          <b><%=dto.getId() %></b>
	          </div>
	        </td>
	      </tr>
	      
	      <tr>
	        <th width="100" class="table-success">이름</th>
	        <td>
	          <input type="text" name="name" class="form-control" required="required" style="width: 120px;" value="<%=dto.getName()%>">
	        </td>
	      </tr>
	      
	      <tr>
	        <th width="100" class="table-success">핸드폰</th>
	        <td>
	          <input type="text" name="hp" class="form-control" required="required" style="width: 180px;" value="<%=dto.getHp()%>">
	        </td>
	      </tr>
	      <tr>
	        <th width="100" class="table-success">주소</th>
	        <td>
	          <input type="text" name="addr" class="form-control" required="required" style="width: 330px;" value="<%=dto.getAddr()%>">
	        </td>
	      </tr>
	      <tr>
	        <th width="100" class="table-success">이메일</th>
	        <td>
	         <div class="d-inline-flex">
	          <input type="text" name="email1" class="form-control" required="required"
	          style="width: 80px;" value="<%=dto.getEmail().split("@")[0]%>">
	          <b style="margin-left: 10px;">@</b>
	          <input type="text" name="email2" id="email2" class="form-control" required="required"
	          style="width: 120px; margin-left: 10px;" value="<%=dto.getEmail().split("@")[1]%>">
	          <select id="selemail" class="form-control" style="margin-left: 10px;">
	             <option value="-">직접입력</option>
	             <option value="naver.com">네이버</option>
	             <option value="nate.com">네이트</option>
	             <option value="gmail.com">구글</option>
	             <option value="daum.net">다음</option>
	          </select>
	          </div>
	        </td>
	      </tr>
	      
	      <tr>
	        <td colspan="2" align="center">
	            <button type="submit" class="btn btn-outline-info"
	            style="width: 100px;">수정하기</button>
	            <button type="reset" class="btn btn-outline-info"
	            style="width: 100px;">초기화</button>
	        </td>
	      </tr>
	   </table>
	</form>
</div>
</body>
</html>