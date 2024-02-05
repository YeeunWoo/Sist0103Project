package day0105;

import java.util.Scanner;

public class QuizOper_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name, score;
		int java;
		
		System.out.print("이름을 입력해주세요");
		name = sc.nextLine();
		
		System.out.print("자바 시험 점수를 입력해주세요");
		java = sc.nextInt();
		
		System.out.println("========================");
		
		//if 문
		if(java>=90) {
			score = "매우 잘함";
		} else if(java>=80) {
			score = "잘함";
		} else if(java>=70) {
			score = "좀 더 노력 할 것";
		} else
			score = "꽝!!";
		
		System.out.printf("%s님의 시험평가는 %s 입니다.\n",name, score);
		
		//삼항 연산자
		score = java>=90 ? "매우 잘함": java>=80 ? "잘함" : java>=70 ? "좀 더 노력 할 것" : "꽝!!";

		System.out.printf("%s님의 시험평가는 %s 입니다.",name, score);
		
	}

}
