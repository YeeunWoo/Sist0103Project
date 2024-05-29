<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="loginform" style="margin: 100px auto; width: 400px; text-align: center;">
        <form action="loginprocess" method="post">
            <table class="table table-bordered" style=" text-align: center; vertical-align: middle;">

                <caption align="top"><b>회원 로그인</b></caption>
                <tr>
                    <th>아이디</th>
                    <td>
                        <input type="text" name="id" class="form-control" required="required" autofocus="autofocus" placeholder="아이디"
                        value="${sessionScope.saveok==null?"":sessionScope.myid }">
                    </td>
                </tr>
                <tr>
                    <th>비밀번호</th>
                    <td>
                        <input type="password" name="pass" class="form-control" required="required" placeholder="비밀번호">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="checkbox" name="cbsave"> 아이디저장 &nbsp;&nbsp;&nbsp;
                        <button type="submit" class="btn btn-secondary btn-submit">회원로그인</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>