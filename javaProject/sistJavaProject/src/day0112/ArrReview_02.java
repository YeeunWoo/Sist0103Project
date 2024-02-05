package day0112;

class Shop {
	private String pName;
	private int pPrice;
	private String pColor;
	static int no;
	static String shopName = "쌍용";

	public Shop(String n, int p, String c) {
		pName = n;
		pPrice = p;
		pColor = c;
	}
	
	public static void showTitle() {
		System.out.printf("[%s매장 입고상품]\n", shopName);
		System.out.printf("번호\t상품명\t가격\t색상\n");
	}
	
	public void getShop() {
		no++;
		System.out.printf("%d\t%s\t%d원\t%s\n", no, pName, pPrice, pColor);
	}
	
}

public class ArrReview_02 {

	public static void main(String[] args) {
		
		Shop[] s = {
				new Shop("요가매트", 2500, "핑크"),
				new Shop("아령", 3000, "블랙"),
				new Shop("레깅스", 4500, "베이지"),
				new Shop("나시", 2200, "화이트"),
		};
		
		Shop.showTitle();		
		for(Shop shop:s) {
			shop.getShop();
		}

	}

}
