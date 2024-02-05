package day0105;

import java.util.Scanner;

public class QuizOper_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price;
		
		System.out.print("알바비는? ");
		price = sc.nextInt();
		
		System.out.println("만원: " + (price/10000));
		System.out.println("천원: " + ((price/1000)%10));
		System.out.println("백원: " + ((price/100)%10));
		System.out.println("십원: " + ((price/10)%10));
		System.out.println("일원: " + (price%10));
		
	}

}
