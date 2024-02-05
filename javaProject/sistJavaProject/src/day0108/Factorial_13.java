package day0108;

import java.util.Scanner;

public class Factorial_13 {

	public static void main(String[] args) {
		// 1~10까지의 팩토리얼 구하기
		
		int result=1;
		
		for(int i = 1; i <=10; i++) {
			result *= i;
			System.out.println(i+"!"+result);
		}
		
		//문제) 합계를 구할 숫자를 입력 시 1부터 여러분이 입력한 숫자까지의 합을 구하세요
		Scanner sc = new Scanner(System.in);
		
		int num, sum;
		sum = 0;
		System.out.print("숫자 입력: ");
		num = sc.nextInt();

		for(int i = 1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
