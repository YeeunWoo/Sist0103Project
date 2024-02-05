package day0104;

import java.util.Scanner;

public class ArgsParse_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int price, count, total;
		
		System.out.print("상품명을 입력하세요==>");
		name = sc.nextLine();
		
		System.out.print("가격은 얼마입니까?==>");
		price = sc.nextInt();
		
		System.out.print("수량은 몇 개입니까?==>");
		count = sc.nextInt();
		
		total = price * count;
		
		System.out.println("");
		System.out.println("상품입고");
		System.out.println("================");
		System.out.printf("입고상품명: %s \n수량: %d개\n가격: %d원\n",name, count, price);
		System.out.println("================");
		System.out.printf("총 가격: %d원", total);

	}

}
