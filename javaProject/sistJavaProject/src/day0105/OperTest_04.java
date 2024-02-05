package day0105;

import java.util.Scanner;

public class OperTest_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("두 수를 입력해주세요.");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("[산술 연산자 결과]");
		System.out.println("더하기: " + (a+b));
		System.out.println("빼기: " + (a-b));
		System.out.println("곱하기: " + (a*b));
		System.out.println("나누기: " + (double)a/b);
		System.out.println("나머지 값: " + (a%b));
	}

}
