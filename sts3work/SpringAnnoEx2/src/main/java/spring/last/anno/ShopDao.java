package spring.last.anno;

import org.springframework.stereotype.Component;

@Component
public class ShopDao implements ShopDaoInter {

	@Override
	public void insertShop(String sangpum, int price, String color) {
		System.out.println(sangpum + ": " + price + ": " + color);

	}

	@Override
	public void deleteShop(String num) {
		System.out.println(num + "번 삭제!");

	}

	@Override
	public void selectShop(String sangpum, int price, String color) {
		System.out.println("***상품관리***");
		
		System.out.println("상품명: " + sangpum);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);

	}

}
