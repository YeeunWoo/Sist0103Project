package day0105;

import java.util.Scanner;

public class QuizOper_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, max;
		
		System.out.println("3개의 숫자를 입력하시오.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				max = a;
			} else {
				max = c;
			}
		} else {
			if(b>c) {
				max = b;
			} else { 
				max =c;
			}
		}
		System.out.println("if문");
		System.out.printf("max = %d\n",max);
		
		max=(a>b&&a>c)?a:(b>c)?b:c;
		
		System.out.println("조건연산자");
		System.out.printf("max = %d",max);
		
		
		

	}

}
