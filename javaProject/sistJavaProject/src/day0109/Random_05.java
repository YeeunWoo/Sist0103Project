package day0109;

import java.util.Random;

public class Random_05 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println("0~9 사이의 랜덤수 5개 발생");
		for(int i = 1; i<=5; i++) {
			int a = r.nextInt(10); // 0~9
			System.out.println(a);
		}
		
		System.out.println("65~90 사이의 랜덤수 5개 발생");
		for(int i = 1; i<=5; i++) {
			int a = r.nextInt(26)+65; // 65~90
			System.out.println(a);
		}
		
		System.out.println("1~10 사이의 랜덤수 5개 발생");
		for(int i = 1; i<=5; i++) {
			int a = r.nextInt(10)+1; // 1~10
			System.out.println(a);
		}
	}

}
