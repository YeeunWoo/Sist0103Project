package day0105;

import java.util.Scanner;

public class book114_21 {

	public static void main(String[] args) {
		/* 점수가 70~79입니다.
		 * 등급은 C입니다.
		 */
		
		int score;
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			System.out.println("점수가 90~100입니다.");
			System.out.println("등급은 "+grade+"입니다.");
			break;
		case 8:
			grade = 'B';
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 "+grade+"입니다.");
			break;
		case 7:
			grade = 'C';
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 "+grade+"입니다.");
			break;
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade = 'F';
			System.out.println("점수가 0~69입니다.");
			System.out.println("등급은 "+grade+"입니다.");
			break;
		default:
			System.out.println("허용된 숫자X");
		}
		

	}

}
