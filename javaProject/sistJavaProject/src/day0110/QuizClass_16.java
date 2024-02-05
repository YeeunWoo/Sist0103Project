package day0110;

class Mart{
	
	private String sangpum;
	int su;
	int dan;
	static String SHOPNAME = "롯데마트";
	
	// sangpum은 메서드가 아니면 다른 클래스에서 접근 불가
	public void setSangpum(String sangpum) {
		this.sangpum = sangpum;
	}
		
	public String getSangpum() {
		return sangpum;
	}
	
	// su, dan은 private이 아니므로 다른 클래스에서 생성 시 변수 접근 가능
	// static은 다른 클래스에서 접근 시 클래스명. 변수명으로 접근 가능 
	
}

public class QuizClass_16 {

	public static void main(String[] args) {

		
		
		Mart m1 = new Mart();
		m1.setSangpum("초코파이");
		m1.su = 10;
		m1.dan = 4500;
		
		Mart m2 = new Mart();
		m2.setSangpum("엄마손파이");
		m2.su = 5;
		m2.dan = 2500;
		
		System.out.printf("***%s 입고 물품***\n", Mart.SHOPNAME);
		System.out.println("====================");
		System.out.printf("상품명: %s\n수량: %d개\n가격: %d원\n", m1.getSangpum(), m1.su, m1.dan);
		System.out.println("--------------------");
		System.out.printf("상품명: %s\n수량: %d개\n가격: %d원\n", m2.getSangpum(), m2.su, m2.dan);
	}

}
