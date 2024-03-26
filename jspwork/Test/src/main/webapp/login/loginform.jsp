<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>로그인</title>
<style>
    .login-form {
        margin: 200px auto;
        width: 300px;
    }
</style>
</head>
<%
//세션값 얻기
String saveok=(String)session.getAttribute("saveok");
String myid="";
if(saveok!=null){
	myid=(String)session.getAttribute("myid");
}
%>
<body>
	<div class="login-form">
		<form action="login/loginaction.jsp" method="post">
			<table class="table table-bordered">
				<tr>
					<td>
						<input type="text" name="id" class="form-control" required="required" 
						placeholder="아이디입력" value="<%=myid%>">
					</td>
				</tr>
				<tr>	
					<td>
						<input type="password" name="pass" class="form-control" required="required" 
						placeholder="패스워드입력">
					</td>
				</tr>
				<tr>	
					<td>
						<input type="checkbox" name="cbsave" <%=saveok==null?"":"checked" %>>&nbsp;아이디저장
					</td>
				</tr>
				<tr>	
					<td>
						<button type="submit" class="btn btn-secondary btn-lg btn-block">로그인</button>
					</td>
				</tr>
				<tr>	
					<td class="signup-btn">
				        <button type="button" class="btn btn-outline-secondary btn-lg btn-block" onclick="location.href='index.jsp?main=member/addform.jsp'">회원가입</button>
				    </td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>