package day0108;

import java.util.Scanner;

public class Quiz_18 {

	public static void main(String[] args) {
		//quiz_1();
		quiz_2();
	}

	public static void quiz_1() {
		// 문제) 숫자를 반복 입력하여 양수의 갯수와 음수의 갯수를 구하시오(0 입력 시 종료)
		Scanner sc = new Scanner(System.in);
		
		int cnt1 = 0; 
		int cnt2 = 0;
		
		while(true) {
			
			System.out.print("숫자 입력: ");
			int num = sc.nextInt();
			
			if(num>0)
				cnt1++;
			else if(num<0)
				cnt2++;
			else
				break;
			
		}
		System.out.printf("양수: %d개\n음수: %d개",cnt1, cnt2);
	}

	public static void quiz_2() {
		// 문제) 반복해서 점수를 입력하고 (1~100) 0을 입력 시 빠져나와 갯수와 합계, 평균을 구하시오.
		Scanner sc = new Scanner(System.in);
		
		int score, total = 0, cnt=0;
		double avg;
		
		while(true) {
			
			System.out.print("점수 입력: ");
			score = sc.nextInt();
			
			if(score>0 && score<=100) {
				cnt++;
				total += score;
			} else if(score == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		avg = total/cnt;
		
		System.out.printf("%d개\n총합: %d\n평균: %.2f",cnt, total, avg);
		
	}
	


}
