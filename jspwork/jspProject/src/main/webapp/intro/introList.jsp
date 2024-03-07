<%@page import="java.text.SimpleDateFormat"%>
<%@page import="intro.model.IntroDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="intro.model.IntroDao"%>
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
</head>
<%
  //db목록 가져오기
    IntroDao dao=new IntroDao();
	ArrayList<IntroDto>list=dao.getAllIntros();
%>
<body>
<div style="margin: 30px 50px;">

    
    <br><br>
    <table class="table table-bordered" style="width: 900px;">
       <tr class="table-primary">
          <th width="60">번호</th>
          <th width="100">이름</th>
          <th width="60">나이</th>
          <th width="100">생일</th>
          <th width="100"></th>
          
       </tr>
       
       <%
		if(list.size()==0){%>
			<tr>
				<td colspan="5" align="center">
					<h3>자기소개가 없습니다</h3>
				</td>
			</tr>
			
		<%}
         for(int i=0;i<list.size();i++)
         {
        	 IntroDto dto=list.get(i);  //i번지의 dto를 꺼낸다
        	 %>
        	 
        	 <tr>
        	   <td><%=i+1 %></td>
        	   <td><%=dto.getName() %></td>
        	   <td><%=dto.getAge() %></td>
        	   <td><%=dto.getBirthday() %></td>
        	   <td>
        	     <button type="button" class="btn btn-success btn-sm"
        	     onclick="location.href='detailPage.jsp?num=<%=dto.getNum()%>'">자세히</button>
        	  
        	  
        	   </td>
        	 </tr>
         <%}
       %>
       
       
    </table>
    <button type="button" class="btn btn-success"
    onclick="location.href='addForm.jsp'">추가</button>
    
</div>
</body>
</html>