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
.ec-base-fold {
	position: relative;
	margin: 0 0 24px;
	padding: 0;
	border-top: 1px solid #D8D8D8;
	border-bottom: 1px solid #D8D8D8;
	background: #fff;
}

.title {
	border-bottom: 1px solid #ececec;
}

.contents {
	overflow: visible;
	opacity: 1;
	height: auto;
	border-top-width: 1px;
	-webkit-transition: height .3s ease, opacity .3s ease-out;
	-moz-transition: height .3s ease, opacity .3s ease-out;
	-ms-transition: height .3s ease, opacity .3s ease-out;
	-o-transition: height .3s ease, opacity .3s ease-out;
	transition: height .3s ease, opacity .3s ease-out;
}

.ec-base-table tr {
	border-bottom: 1px solid var(--gray-1-color);
	padding: 12.5px 16px;
	box-sizing: border-box;
	width: 100%;
	display: flex;
	column-gap: 10px;
}

.icoRequired {
	display: inline-block;
	width: 10px;
	height: 10px;
	vertical-align: middle;
	text-indent: 150%;
	font-size: 0;
	line-height: 0;
	white-space: nowrap;
	background: url(/web/icons/required.svg) no-repeat 0 0;
	background-size: cover;
}
</style>
</head>
<body>
	<div class="billingNshipping">
		<!-- 수령자 정보   -->
		<div id="ec-jigsaw-area-shippingInfo"
			class="ec-base-fold eToggle selected">
			<div id="ec-jigsaw-title-shippingInfo" class="title">
				<h2>배송지</h2>
			</div>
			<div class="contents">
				<!-- app tag -->
				<div id="ec-orderform-billingNshipping-head"></div>
				<!-- 국내배송 정보 -->
				<div class="">
					<!-- 새 배송지 -->
					<div id="ec-shippingInfo-newAddress" class="tabCont newShipArea ">
						<div class="ec-base-table typeWrite">
							<table border="0">
								<caption>배송 정보 입력</caption>
								<colgroup>
									<col style="width: 102px">
									<col style="width: auto">
								</colgroup>
								<tbody>
									<tr class="ec-shippingInfo-newAddress-name">
										<th scope="row">받는사람 <span class="icoRequired">필수</span>
										</th>
										<td><input id="rname" name="rname" fw-filter="isFill"
											fw-label="수취자 성명" fw-msg="" class="inputTypeText"
											placeholder="" size="15" value="" type="text" /></td>
									</tr>
									<tr id="ec-receiver-address" class="address_content">
										<th scope="row">주소 <img
											src="http://img.echosting.cafe24.com/skin/base_ko_KR/order/ico_required.gif"
											alt="필수"></th>
										<td>
											<div class="address_box">
												<input id="rzipcode1" name="rzipcode1" fw-filter="isFill"
													fw-label="수취자 우편번호1" fw-msg="" class="inputTypeText"
													placeholder="" size="6" maxlength="6" readonly="1" value=""
													type="text" /> <a href="#none" id="btn_search_rzipcode">주소검색</a>
											</div> <input id="raddr1" name="raddr1" fw-filter="isFill"
											fw-label="수취자 주소1" fw-msg="" class="inputTypeText"
											placeholder="" size="40" readonly="1" value="" type="text" />
											<span class="grid sr-only">기본주소</span> <input id="raddr2"
											name="raddr2" fw-filter="isFill" fw-label="수취자 주소2" fw-msg=""
											class="inputTypeText" placeholder="" size="40" value=""
											type="text" /> <span class="grid sr-only">나머지주소</span><span
											class="grid displaynone">(선택입력가능)</span>
										</td>
									</tr>
									<tr class="ec-shippingInfo-receiverCell ">
										<th scope="row">휴대전화 <span class=""><span
												class="icoRequired">필수</span></span>
										</th>
										<td><div class="ec-base-mail">
												<select id="rphone2_1" name="rphone2_[]"
													fw-filter="isNumber&isFill" fw-label="수취자 핸드폰번호"
													fw-alone="N" fw-msg="">
													<option value="010">010</option>
													<option value="011">011</option>
													<option value="016">016</option>
													<option value="017">017</option>
													<option value="018">018</option>
													<option value="019">019</option>
												</select>-<input id="rphone2_2" name="rphone2_[]" maxlength="4"
													fw-filter="isNumber&isFill" fw-label="수취자 핸드폰번호"
													fw-alone="N" fw-msg="" placeholder="" size="4" value=""
													type="text" />-<input id="rphone2_3" name="rphone2_[]"
													maxlength="4" fw-filter="isNumber&isFill"
													fw-label="수취자 핸드폰번호" fw-alone="N" fw-msg="" placeholder=""
													size="4" value="" type="text" />
											</div></td>
									</tr>

								</tbody>
							</table>
						</div>
					</div>

				</div>

				<!-- 국내배송 메시지 -->
				<div class="ec-shippingInfo-shippingMessage segment unique  ">
					<select id="omessage_select" name="omessage_select" fw-filter=""
						fw-label="배송 메세지" fw-msg="">
						<option value="oMessage-0">-- 메시지 선택 (선택사항) --</option>
						<option value="oMessage-1" selected="selected">배송 전에 미리
							연락바랍니다.</option>
						<option value="oMessage-2">부재 시 경비실에 맡겨주세요.</option>
						<option value="oMessage-3">부재 시 문 앞에 놓아주세요.</option>
						<option value="oMessage-4">빠른 배송 부탁드립니다.</option>
						<option value="oMessage-5">택배함에 보관해 주세요.</option>
						<option value="oMessage-input">직접 입력</option>
					</select>
					<div class="ec-shippingInfo-omessageInput gBlank10"
						style="display: none">
						<textarea id="omessage" name="omessage" fw-filter=""
							fw-label="배송 메세지" fw-msg="" maxlength="255" cols="70"></textarea>
					</div>
				</div>
			</div>
		</div>



	</div>


	<!-- [주문상품] -->
	<div id="ec-jigsaw-area-orderProduct" class="ec-base-fold eToggle">
		<div id="ec-jigsaw-title-orderProduct" class="title">
			<h2>주문상품</h2>
			<span id="ec-jigsaw-heading-orderProduct" class="txtStrong gRight">2개</span>
		</div>
		<div class="contents">
			<!-- app tag -->
			<div id="ec-orderform-orderProduct-head"></div>

			<!-- 국내배송상품 주문내역 -->
			<div class="orderArea ">
				<!-- 기본배송 -->
				<div class="xans-element- xans-order xans-order-normallist">
					<!-- 참고: 상품반복 -->
					<div class="ec-base-prdInfo xans-record-">
						<div class="prdBox">
							<div class="displaynone">
								<input id="chk_order_cancel_list0"
									name="chk_order_cancel_list_basic0" value="15275:000C:F:449922"
									type="checkbox" />
							</div>
							<div class="thumbnail">
								<a href="/product/detail.html?product_no=15275&cate_no=1"><img
									src="//chapterone.kr/web/product/tiny/202403/2b305a6ab30be0f5abd213d234719f6b.png"
									alt="" width="90" height="90"></a>
							</div>
							<div class="description">
								<strong class="prdName" title="상품명"> <a
									href="/product/단-티-보드-챕터원-에디션-drain-1ea/15275/category/1/"
									class="ec-product-name">단 티 보드 - 챕터원 에디션 (Drain 1ea)</a></strong>
								<ul class="info">
									<li class="displaynone">무이자할부 상품</li>
									<li title="유효기간" class="displaynone">내 사용</li>
									<li title="옵션">
										<p class="option ">
											<span class="option_str">[주문제작 상품으로 취소/교환/반품이 불가합니다.
												동의 후 구매 부탁드립니다. : 1]</span>
										</p>
									</li>
									<li class="info_cont">
										<div class="proCount">
											수량: <span class="product_quantity">1</span>개
										</div>
										<div class="proPrice">
											<span id="">&#8361;238,000 </span> <span class="displaynone">()</span>
										</div>
									</li>
									<li id="" class="displaynone">할인금액: <span class="txtWarn">-&#8361;<span
											id="">0</span>
									</span> <span class="txtWarn displaynone">()</span>
									</li>
									<li class="displaynone" title="배송">[무료] / 기본배송</li>
									<li class="displaynone" title="배송주기">배송주기 : <span
										class="txtEm"></span>
									</li>
									<li id="product_mileage0" class="mileage displaynone"
										title="적립금"><input id='product_mileage_all_15275_000C'
										name='product_mileage_all' value='2380' type="hidden"><img
										src="//img.echosting.cafe24.com/design/common/icon_cash.gif" />
										2,380원</li>
									<li class="displaynone">상품중량 : 1.00kg * <span
										class="product_quantity">1</span>개 = 1.00kg
									</li>
								</ul>
							</div>
							<button type="button" class="btnRemove "
								id="btn_product_one_delete_id0" prd="15275:000C:F:449922"
								set_prd_type="">삭제</button>
						</div>
					</div>
					<!-- //참고 -->
					<!-- 참고: 상품반복 -->
					<!-- //참고 -->
				</div>
				<div class="totalPrice ">
					<div class="title">
						<h3>배송비</h3>
						<span class="deliveryFee">&#8361;<span
							id="domestic_ship_fee">0 (무료)</span></span>
					</div>
				</div>

				<!-- 업체기본배송 -->
				<div class="xans-element- xans-order xans-order-supplierlist">
					<!-- 참고: 상품반복 -->
					<div class="ec-base-prdInfo xans-record-">
						<div class="prdBox">
							<div class="displaynone">
								<input id="chk_order_cancel_list1"
									name="chk_order_cancel_list_supplier1"
									value="8713:R0000001728:F:449924" type="checkbox" />
							</div>
							<div class="thumbnail">
								<a href="/product/detail.html?product_no=8713&cate_no=1"><img
									src="//chapterone.kr/web/product/tiny/202105/0531234d889f3c24b0657efda22453dd.jpg"
									alt="" width="90" height="90"></a>
							</div>
							<div class="description">
								<strong class="prdName" title="상품명"> <a
									href="/product/spring-fabric-collection-20-네온-스트라이프-침구-네온옐로/8713/category/1/"
									class="ec-product-name">[Spring fabric collection, 20%] 네온
										스트라이프 침구 - 네온옐로</a></strong>
								<ul class="info">
									<li class="displaynone">무이자할부 상품</li>
									<li title="유효기간" class="displaynone">내 사용</li>
									<li title="옵션">
										<p class="option ">
											<span class="option_str">[옵션: Q 기본 (+40,000)]</span>
										</p>
									</li>
									<li class="info_cont">
										<div class="proCount">
											수량: <span class="product_quantity">1</span>개
										</div>
										<div class="proPrice">
											<span id="">&#8361;190,000 </span> <span class="displaynone">()</span>
										</div>
									</li>
									<li id="" class="">할인금액: <span class="txtWarn">-&#8361;<span
											id="">38,000</span>
									</span> <span class="txtWarn displaynone">()</span>
									</li>
									<li class="displaynone" title="배송">[무료] / 업체기본배송</li>
									<li class="displaynone" title="배송주기">배송주기 : <span
										class="txtEm"></span>
									</li>
									<li id="product_mileage1" class="mileage displaynone"
										title="적립금"><input
										id='product_mileage_all_8713_R0000001728'
										name='product_mileage_all' value='1520' type="hidden"><img
										src="//img.echosting.cafe24.com/design/common/icon_cash.gif" />
										1,520원</li>
									<li class="displaynone">상품중량 : 1.00kg * <span
										class="product_quantity">1</span>개 = 1.00kg
									</li>
								</ul>
							</div>
							<button type="button" class="btnRemove "
								id="btn_product_one_delete_id1" prd="8713:R0000001728:F:449924"
								set_prd_type="">삭제</button>
						</div>
					</div>
					<!-- //참고 -->
					<!-- 참고: 상품반복 -->
					<!-- //참고 -->
				</div>
				<div class="totalPrice ">
					<div class="title">
						<h3>배송비</h3>
						<span class="deliveryFee">&#8361;<span
							id="supplier_ship_fee">0 (무료)</span></span>
					</div>
				</div>

				<!-- 개별배송 -->
				<div class="totalPrice displaynone">
					<div class="title">
						<h3>배송비</h3>
						<span class="deliveryFee">&#8361;<span id=""></span></span>
					</div>
				</div>
			</div>

			<!-- 해외배송상품 주문내역 -->
			<div class="orderArea displaynone">
				<div class="totalPrice ">
					<div class="title">
						<h3>배송비</h3>
						<span class="deliveryFee">&#8361;<span
							id="f_list_total_delv_price_id"></span></span>
					</div>
				</div>
			</div>
			

			<!-- app tag -->
			<div id="ec-orderform-orderProduct-tail"></div>
		</div>
		<div id="ec-shop-directbuy-order-product-info" class="displaynone"></div>
	</div>
</body>
</html>