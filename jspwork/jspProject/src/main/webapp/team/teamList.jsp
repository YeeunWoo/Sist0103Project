<%@page import="team.model.TeamDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="team.model.TeamDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao dao = new TeamDao(); // TeamDao 객체로 수정
ArrayList<TeamDto> list = dao.getAllTeams(); // ArrayList<TeamDto>로 수정
SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");
%>
<div style="margin: 30px 50px;">
<button type="button" class="btn btn-success" onclick="location.href='addForm.jsp'">팀원추가</button>
<br>
<table class="table table-bordered" style="width: 900px;">
<tr class = "table-primary">
<th width="60">번호</th>
<th width="120">이름</th>
<th width="120">운전면허</th>
<th width="260">주소</th>
<th width="250">작성일</th>
<th width="150">편집</th>
</tr>
<%
	for(int i =0;i<list.size();i++){
		TeamDto dto = list.get(i); //i번지의 dto를 꺼낸다
		%>
		<tr>
			<td><%=i+1 %></td>
			<td><%=dto.getName() %></td>
			<td><%=dto.getDriver() %></td>
			<td><%=dto.getAddr() %></td>
			<td><%=sdf.format(dto.getWriteday()) %></td>
			<td><button type="button" class="btn btn-primary btn-sm" onclick="location.href='updateForm.jsp?num=<%=dto.getNum()%>'">수정</button></td>
			<td><button type="button" class="btn btn-primary btn-sm" onclick="location.href='teamDelete.jsp?num=<%=dto.getNum()%>'">삭제</button></td>
		</tr>
		<%
	}
%>
</table>
</div>
</body>
</html>