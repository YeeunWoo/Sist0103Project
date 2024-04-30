package spring.last.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderController {
	
	@Autowired // 메소드들을 자동으로 주입 받겠다...
	ShopDaoInter shopInter;
	
	int cnt = 20;
	String name = "주문자";
	
	public void jumunInsert(String sang, int price, String color) {
		shopInter.insertShop(sang, price, color);
		System.out.println(name + "님이 " + cnt + "개를 주문하였습니다.");
	}
	
	public void jumunDelete(String num) {
		System.out.println(num + "번 삭제 완료!");
	}
	
	public void jumunSelect(String sang, int price, String color) {
		shopInter.selectShop(sang, price, color);
		System.out.println("주문자: " + name);
		System.out.println("주문개수: " + cnt);
	}
}
