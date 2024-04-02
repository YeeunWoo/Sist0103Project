<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 양식</title>
<script>
// 필요한 경우, 입력 값 검증을 위한 자바스크립트 함수를 여기에 추가할 수 있습니다.
</script>
</head>
<body>
<h2>주문 양식</h2>

<form action="orderaction.jsp" method="post">  
    <h3>배송지</h3>
    받는 사람: <input type="text" name="order_name"><br>
    휴대폰: <input type="text" name="order_hp"><br>
    주소: <input type="text" name="order_addr"><br>
    상세주소: <input type="text" name="order_addr_detail"><br>
    배송 요청사항: <textarea name="order_delivery_request"></textarea><br>
    
    <h3>결제 수단</h3>
    <input type="radio"  name="payment_method" value="credit_card">신용카드<br>
    <input type="radio"  name="payment_method" value="bank_transfer">무통장입금<br>
    
    <!--<h3>주문 상품 정보</h3>-->
    <!-- 주문 상품 정보를 동적으로 표시합니다. 예를 들어, 세션 또는 쿠키에서 주문 상품 정보를 불러와 표시 -->
    <!-- 이 부분은 프로젝트의 구체적인 구현 방법에 따라 달라질 수 있습니다. -->
    
    <input type="submit" value="주문하기">
</form>

</body>
</html>
