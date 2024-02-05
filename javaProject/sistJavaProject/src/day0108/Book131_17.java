package day0108;

import java.util.Scanner;

public class Book131_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int speed = 0;
		
		while(true) {
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			
			String str = sc.nextLine();
			
			if(str.equals("1")) {
				speed ++;
				System.out.println("현재 속도 "+ speed);
			} else if (str.equals("2")) {
				speed --;
				System.out.println("현재 속도 "+ speed);
			} else if (str.equals("3")) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
