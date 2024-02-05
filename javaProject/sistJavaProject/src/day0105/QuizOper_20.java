package day0105;

import java.util.Scanner;

public class QuizOper_20 {

	public static void main(String[] args) {
		/*
		 * 5개 이상 구매 시 10% 할인
		 * 상품명: 키보드
		 * 수량: 5
		 * 가격: 20000
		 * 
		 * ==========================
		 * ** 5개 이상 구매 시 10% 할인됩니다.
		 * 키보드 5개는 총 100000원 입니다.
		 * 할인 된 금액: 10000원
		 */
		
		String name;
		int count, price;
		double total_price, discount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품명: ");
		name = sc.nextLine();
		
		System.out.print("수량: ");
		count = sc.nextInt();
		
		System.out.print("가격: ");
		price = sc.nextInt();
		
		total_price = count * price;
		
		System.out.println("========================");
		System.out.println("*5개 이상 구매 시 10% 할인됩니다.*");
		
		if(count>=5) {
			discount = total_price*0.1;
			total_price *=0.9;
			System.out.printf("할인된 금액 %.0f원\n", discount);
			System.out.printf("%s %d개는 총%.0f원 입니다.\n",name, count, total_price);
		} else {
			System.out.printf("%s %d개는 총%.0f원 입니다.",name, count, total_price);
		}

	}

}
