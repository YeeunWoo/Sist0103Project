package day0108;

import java.util.Scanner;

public class QuizFor_12 {

	public static void main(String[] args) {
		
		// 문제) 1 2 4 5 7 8 10 continue활용하여 출력 
		
		for(int i = 1; i<=10; i++) {
			if(i%3==0) 
				continue;
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 문제) 홀수값:1 홀수값:3 홀수값:5 홀수값:7 홀수값:9 출력

		for(int i = 1; i<=10; i++) {
			if(i%2==0)
				continue;
			System.out.print("홀수값: "+ i + " ");
		}
		
		System.out.println();
		
		// 문제) 점수를 입력 후 합계를 구하는데 0을 입력하면 빠져나와서 합계 출력
		
		Scanner sc = new Scanner(System.in);
		
		int x, sum = 0;
				
		while(true) {
			System.out.println("점수 입력: ");
			x = sc.nextInt();

			if(x==0)
				break;
		
			if(x<=0||x>100) {
				System.out.println("다시 입력해주세요(1~100");
				continue;
			}	
			
			sum += x;
		}
		System.out.println(sum);
	}

}
