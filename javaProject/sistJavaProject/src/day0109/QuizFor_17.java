package day0109;

import java.util.Scanner;

public class QuizFor_17 {

	public static void main(String[] args) {
		//quiz1();
		//quiz2();
		quiz3();
	}

	public static void quiz1() {

		/*
		 * 문제1) 팩토리얼 구할 숫자를 입력하여 해당 숫자에 대한 팩토리알 구하기
		 * 
		 * 팩토리얼 구할 숫자 입력
		 * 3
		 * 3!=6
		 */
		
		Scanner sc = new Scanner(System.in);
		int num, num2 = 1;
		
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			num2 = num2*(i+1);
		}
		
		System.out.println(num2);

	}
	
	public static void quiz2() {
		/*
		 * 문제2) 두 수 x, y를 입력 후 x의 y승 구하기 (for문 이용, x를 y횟수 만큼 곱하기)
		 * 두 수 입력
		 * 3	3
		 * 3의 3승은 27입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x, y, result = 1;
		
		System.out.print("x 입력: ");
		x = sc.nextInt();
		System.out.print("y 입력: ");
		y = sc.nextInt();
		
		for(int i = 0; i < y; i++ ) {
			result *= x; 
		}

		System.out.println(result);

	}
	
	public static void quiz3() {

		/*
		 * 1~100까지의 숫자 중 짝수의 합과 홀수의 합 출력하기 (for문 이용)
		 */
		
		int sum1=0, sum2=0;
		
		for(int i = 1; i <=100 ;i++) {
			if(i%2==0)
				sum1+=i;
			else if(i%2==1)
				sum2+=i;
		}
		
		System.out.println("짝수 합: " + sum1);
		System.out.println("홀수 합: " + sum2);

	}

}
