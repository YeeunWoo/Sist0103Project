package day0108;

import java.util.Scanner;

public class YoonYear_03 {

	public static void main(String[] args) {
		/* 4로 나누어 떨어지면 윤년O
		 * 100으로 나누어 떨어지면 윤년X
		 * 400으로 나누어 떨어지면 윤년O
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
		System.out.print("입력연도: ");
		year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0)
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다..");
		
		if(year%4==0) 
			if(year%100!=0) {
				if(year%400==0) {
					System.out.println("윤년입니다.");
				}else
					System.out.println("윤년이 아닙니다..");
			} else
				System.out.println("윤년입니다.");	
		
	}

}
