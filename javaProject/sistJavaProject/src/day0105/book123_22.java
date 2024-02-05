package day0105;

import java.util.Scanner;

public class book123_22 {

	public static void main(String[] args) {
		/*
		 * score1: 80
		 * score2: 80
		 */

		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.print("학점 입력: ");
		grade = sc.nextLine();
		
		switch(grade){
			case "A":
				score = 100;
				break;
			case "B":
				score = 80;
				break;
			default:
				score = 50;
		}
		
		System.out.println("점수는" + score);	
			
	}
		
		
}
