<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 양식</title>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                var addr = ''; // 주소 변수

                if (data.userSelectedType === 'R') { // 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("address").value = addr;
                document.getElementById("detailAddress").focus();
            }
        }).open();
    }
</script>
</head>
<body>
<h2>주문/결제</h2>

<form action="orderaction.jsp" method="post">  
    <h3>배송지</h3>
    받는 사람: <input type="text" name="order_name" required><br>
    휴대폰: <input type="text" name="order_hp" required><br>
    <input type="text" id="postcode" name="order_zipcode" placeholder="우편번호" readonly required>
    <input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
    <input type="text" id="address" name="order_addr" placeholder="주소" readonly required><br>
    <input type="text" id="detailAddress" name="order_address_detail" placeholder="상세주소" required><br>
    
    배송메세지: <textarea name="order_delivery_request"></textarea><br>
    
    <h3>결제 수단</h3>
    <input type="radio" name="payment_method" value="credit_card" required>신용카드<br>
    <input type="radio" name="payment_method" value="bank_transfer" required>무통장입금<br>
    
    <button type="submit">주문하기</button>
</form>

</body>
</html>
