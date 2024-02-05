package day0111;

class Shop {
	private String sangpum;
	private int price;
	private String sangColor;
	
	public Shop(String s, int p, String c) {
		sangpum = s;
		price = p;
		sangColor = c;
	}
	
	// 제목
	public static void showTitle() {
		System.out.println("상품명\t가격\t색상");
		System.out.println("=========================");
	}
	
	// 생성한 갯수만큼 출력
	public void showShop() {
		System.out.println(sangpum + "\t" + price + "원\t" + sangColor);
	}
}

public class ArrObTest_11 {

	public static void main(String[] args) {
		// 4개 생성해서 출력 할 것
		
		Shop[] arr = {
			new Shop("초코파이", 2500, "빨강"),
			new Shop("다이제", 2000, "초록"),
			new Shop("누텔라", 2000, "갈색")
		};
		
		Shop.showTitle();
		
		for(Shop s: arr) {
			
			s.showShop();
		}
		

	}

}
