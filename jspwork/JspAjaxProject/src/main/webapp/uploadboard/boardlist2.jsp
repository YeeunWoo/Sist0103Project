<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="uploadboard.data.UploadBoardDao"%>
<%@page import="uploadboard.data.UploadBoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>앨범형 목록</title>
<style>
  .album-container {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
    gap: 20px;
  }
  .album-item {
    border: 1px solid #ccc;
    padding: 10px;
  }
  .album-item img {
    width: 100%;
    height: auto;
  }
</style>
</head>
<%
UploadBoardDao dao = new UploadBoardDao();
List<UploadBoardDto> list = dao.getAllDatas();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
%>
<body>
  <div class="container">
    <h2 class="alert alert-info">앨범형 목록</h2>
    <div class="album-container">
      <% for(UploadBoardDto dto : list) { %>
        <div class="album-item">
          <a href="content.jsp?num=<%=dto.getNum()%>">
            <img src="../save/<%=dto.getImgname()%>" alt="<%=dto.getSubject()%>">
            <h4><%=dto.getSubject()%></h4>
            <p>작성자: <%=dto.getWriter()%></p>
            <p>작성일: <%=sdf.format(dto.getWriteday())%></p>
            <p>조회수: <%=dto.getReadcount()%></p>
          </a>
        </div>
      <% } %>
    </div>
  </div>
</body>
</html>
