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
		System.out.println(num + "�� ����!");

	}

	@Override
	public void selectShop(String sangpum, int price, String color) {
		System.out.println("***��ǰ����***");
		
		System.out.println("��ǰ��: " + sangpum);
		System.out.println("����: " + price);
		System.out.println("����: " + color);

	}

}
