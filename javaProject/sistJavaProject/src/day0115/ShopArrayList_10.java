package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Shop {
	private String sangName;
	private int price, su;
	
	public Shop(String name, int price, int su) {
		this.sangName = name;
		this.price = price;
		this.su = su;
	}
	public String getSangName() {
		return sangName;
	}
	public void setSangName(String sangName) {
		this.sangName = sangName;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int total() {
		//return su*price;
		return getSu()*getPrice();
	}
}

public class ShopArrayList_10 {
	
	List<Shop> list = new Vector<Shop>();

	public void ipgo() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("상품명: ");
		String sangName = sc.nextLine();
		
		System.out.print("가격: ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("수량: ");
		int su = Integer.parseInt(sc.nextLine());
		
		Shop data = new Shop(sangName, price, su);
		list.add(data);
		
		System.out.println(list.size() + "개의 상품을 입고했어요!");
		
	}
	
	public void jego() {
		System.out.println("No.\t상품명\t가격\t수량\t총액");
		for(int i = 0; i<list.size(); i++) {
			Shop s = list.get(i);
			//System.out.print((i+1) + "\t" + s.getSangName() + "\t" + s.getPrice() + "\t" + s.getSu() + "\t" + s.getPrice()*s.getSu() +"\n");
			System.out.print((i+1) + "\t" + s.getSangName() + "\t" + s.getPrice() + "\t" + s.getSu() + "\t" + s.total() +"\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		ShopArrayList_10 shop = new ShopArrayList_10();
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		while(true) {
			System.out.println("1. 상품입고\t2. 상품재고\t9. 종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n==1) {
				shop.ipgo();
			} else if(n==2) {
				shop.jego();
			} else if(n==9) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}

}
