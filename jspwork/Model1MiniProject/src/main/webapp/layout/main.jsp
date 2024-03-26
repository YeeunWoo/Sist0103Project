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
<title>Insert title here</title>
<style type="text/css">
.center-image {
	display: flex;
	justify-content: center;
}
h3 {
        text-align: center;
    }
</style>
</head>
<%
//프로젝트 경로
String root = request.getContextPath();
%>
<body>

	<div style="display: flex; justify-content: center;">
		<img alt="" src="<%=root%>/image/main_visual03.jpg"
			style="width: 1600px;">
	</div>
	<br>
	<br>

	<h3>쌍용교육센터 모집과정</h3>
	<br>
	<div class="center-image">
		<img src="<%=root%>/image/main_con01_img01.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img02.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img03.jpg" style="margin-right: 10px;"> 
		<img src="<%=root%>/image/main_con01_img04.jpg">
	</div>
	
	<hr>
	 
	<div class="container">
        <h1>가구 판매 사이트에 오신 것을 환영합니다!</h1>
        <p>우리의 다양한 제품을 살펴보세요.</p>
        
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">카테고리 1</h5>
                        <p class="card-text">카테고리 1에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">카테고리 2</h5>
                        <p class="card-text">카테고리 2에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">카테고리 3</h5>
                        <p class="card-text">카테고리 3에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
        </div>
        
        <hr>
        
        <h2>특별 상품</h2>
        <div class="row">
            <div class="col-md-3">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">상품 1</h5>
                        <p class="card-text">특별 상품 1에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">상품 2</h5>
                        <p class="card-text">특별 상품 2에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">상품 3</h5>
                        <p class="card-text">특별 상품 3에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="card">
                    <img src="https://via.placeholder.com/150" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">상품 4</h5>
                        <p class="card-text">특별 상품 4에 대한 간단한 설명이 들어갈 수 있습니다.</p>
                        <a href="#" class="btn btn-primary">자세히 보기</a>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>
</html>
