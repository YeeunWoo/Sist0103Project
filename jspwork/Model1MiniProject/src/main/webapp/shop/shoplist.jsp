<%@page import="java.text.NumberFormat"%>
<%@page import="data.dto.ShopDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<%
  ShopDao dao=new ShopDao();
  List<ShopDto> list=dao.getAllSangpums();
  NumberFormat nf=NumberFormat.getCurrencyInstance();
%>
<body>
<div class="container mt-3">
  
  <!-- Nav tabs -->
  <ul class="nav nav-tabs" role="tablist">
    <li class="nav-item">
      <a class="nav-link active" data-bs-toggle="tab" href="#tabs-total">전체</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-bs-toggle="tab" href="#tabs-outer">아우터</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-bs-toggle="tab" href="#tabs-top">상의</a>
    </li>
  </ul>

  <!-- Tab panes -->
  <div class="tab-content">
    <div id="tabs-total" class="container tab-pane active"><br>
      <h3>전체</h3>
      <p>
        <table class="table table-bordered" style="width: 1000px;">
           <tr>
              <%
                 int i=0;
                for(ShopDto dto: list)
                {
                	%>
                	<td>
                	  <a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
                	     <img alt="" src="shopsave/<%=dto.getPhoto()%>">
                	     <br>
                	     <%=dto.getSangpum() %><br>
                	     <%=nf.format(dto.getPrice()) %>
                	  </a>
                	</td>
                	
                	<%
                	  if((i+1)%6==0)
                	  {%>
                		  </tr><tr>
                	  <%}
                	%>
                <%}
              %>
           </tr> 
        
        </table>
      
      </p>
    </div>
    
    
    
    
    <div id="tabs-outer" class="container tab-pane fade"><br>
      <h3>아우터</h3>
      <p>전체목록-아우터</p>
    </div>
    <div id="tabs-top" class="container tab-pane fade"><br>
      <h3>상의</h3>
      <p>전체목록-상의</p>
    </div>
  </div>
</div>
</body>
</html>