<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
</head>
<body>
	<div style="margin: 50px auto; width:800px;">
		<h3 class="alert alert-info">Ex3번 예제</h3>
		<br>
		<h4>메뉴 입력 후 엔터</h4><br>
		<input type="text" id="search" class="form-control" style="width:150px;"><br><br>
		<h2 id="fname"></h2>
		<img src="" id="photo">
		<div id="out1"></div>		
	</div>
	<script type="text/javascript">
		$("#search").keypress(function(event) {
			if(event.which === 13){ // 엔터 키의 keyCode는 13입니다.
	            event.preventDefault(); // 폼 전송 방지
	            
	            var name = $(this).val(); // 입력 필드의 값을 가져옴

	            $.ajax({
	            	type : "get",
	            	dataType : "json",
	                url: 'foodlist3',	   
	                data: { foodname: name },
	                success: function(res){	                    
						$("#fname").text(res.foodname);
						$("#photo").attr("src", "upload/"+res.photo);
						$("#search").val('');
	                },
	                error: function(xhr, status, error){
	                    // 오류 발생 시 처리
	                    console.error(xhr.responseText);
	                }
	            });
	        }
		})
	</script>
</body>
</html>