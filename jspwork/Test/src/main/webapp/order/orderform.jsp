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
<h2>주문/결제</h2>

<form action="orderaction.jsp" method="post">  
    <h3>배송지</h3>
    받는 사람: <input type="text" name="order_name"><br>
    휴대폰: <input type="text" name="order_hp"><br>
    <input type="text" id="postcode" placeholder="우편번호">
	<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
	<input type="text" id="address" placeholder="주소"><br>
	<input type="text" id="detailAddress" placeholder="상세주소">
	
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
	    function execDaumPostcode() {
	        new daum.Postcode({
	            oncomplete: function(data) {
	                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
	
	                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
	                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
	                var addr = ''; // 주소 변수
	                
	
	                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
	                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
	                    addr = data.roadAddress;
	                } else { // 사용자가 지번 주소를 선택했을 경우(J)
	                    addr = data.jibunAddress;
	                }

	                // 우편번호와 주소 정보를 해당 필드에 넣는다.
	                document.getElementById('postcode').value = data.zonecode;
	                document.getElementById("address").value = addr;
	                // 커서를 상세주소 필드로 이동한다.
	                document.getElementById("detailAddress").focus();
	            }
	        }).open();
	    }
	</script>
	<br>
    배송메세지: <textarea name="order_delivery_request"></textarea><br>
    
    <h3>결제 수단</h3>
    <input type="radio"  name="payment_method" value="credit_card">신용카드<br>
    <input type="radio"  name="payment_method" value="bank_transfer">무통장입금<br>
    
    <!--<h3>주문 상품 정보</h3>-->
    <!-- 주문 상품 정보를 동적으로 표시합니다. 예를 들어, 세션 또는 쿠키에서 주문 상품 정보를 불러와 표시 -->
    <!-- 이 부분은 프로젝트의 구체적인 구현 방법에 따라 달라질 수 있습니다. -->
    
    <button type="submit">주문하기</button>
</form>

</body>
</html>
