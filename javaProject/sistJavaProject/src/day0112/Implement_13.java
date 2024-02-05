package day0112;

// interface는 상수와 추상메서드만 가질 수 있다
// class가 class를 : extends
// class가 interfase를 : imlement
// interface가 interfacr : extends
interface FoodShop {
	String SHOPNAME = "남소관"; // 상수? final 생략
	
	public void order(); // 추상메서드들이다... abstract 생략
	public void bedal();
}

class Food2 implements FoodShop {

	@Override
	public void order() {
		// SHOPNAME = "토끼정"; 상수이므로 수정 안 됨
		System.out.println("음식을 주문합니다.");
		
	}

	@Override
	public void bedal() {
		// TODO Auto-generated method stub
		
	}
	
}
class Food3 implements FoodShop {

	@Override
	public void order() {
		System.out.println("키오스크 주문");
		
	}

	@Override
	public void bedal() {
		System.out.println("쿠팡이츠 배달");
		
	}
	
}
public class Implement_13 {

	public static void main(String[] args) {
		
		FoodShop fs;
		fs = new Food2();
		fs.order();
		fs.bedal();
		
		fs =new Food3();
		fs.order();
		fs.bedal();
	}

}
