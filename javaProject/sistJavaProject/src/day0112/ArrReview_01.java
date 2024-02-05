package day0112;

class Food {
	private String fName;
	private int fPrice;
	static int no;
	
	// 명시적 생성자
	public Food(String n, int p) {
		fName = n;
		fPrice = p;
	}
	
	// 출력문
	public void write() {
		no++;
		System.out.println("[메뉴_" + no + "]");
		System.out.println("음식명: " + fName);
		System.out.println("가격: " + fPrice);
	}
}

public class ArrReview_01 {

	public static void main(String[] args) {
				
		Food[] f = new Food[3];
		
		f[0] = new Food("마리게리타 피자", 12000);
		f[1] = new Food("마리게리타 피자", 12000);
		f[2] = new Food("리코타 샐러드", 15000);

		for(int i = 0; i<f.length; i++) {
			f[i].write();
		}
	}

}
