package day0105;

import java.util.Scanner;

public class IfTest_10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("당신이 좋아하는 숫자는?");
		a = sc.nextInt();
		
		if(a%2==0) {
			System.out.printf("%d은(는) 짝수입니다.\n",a);
		} else {
			System.out.printf("%d은(는) 홀수입니다.\n",a);
		}
		
		System.out.println("다음에 만나요!");
		
		
		System.out.println("***switch문***");
		
		switch(a%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
		

	}

}
