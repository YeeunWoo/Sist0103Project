package day0105;

import java.util.Scanner;

public class QuizOper_19 {

	public static void main(String[] args) {
		/*
		 * (평가는 90점 이상은 참 잘 함!
		 * 80점 이상은 좀 더 노력하세요..
		 * 80점 미만은 불합격
		 * 이름을 입력하세요
		 * 손흥민
		 * 국, 영, 수 점수를 입력하세요
		 * 88
		 * 99
		 * 77
		 * 
		 * =======================
		 * [손흥민 님의 기말고사 성적]
		 * 총점: ** 점
		 * 평균: **.*점
		 * 평가: 좀 더 노력하세요...
		 */

		Scanner sc = new Scanner(System.in);
		
		String name, score;
		int kor, eng, math,total;
		double avg;
		
		System.out.print("국, 영, 수 점수를 입력하세요");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		total = kor+ eng+ math;
		avg = total / 3.0;
			
		score = avg>=90?"참 잘 함":avg>=80?"좀 더 노력하세요":"불합격";
	
		System.out.printf("총점: %d점\n평균: %.1f점\n평가: %s", total, avg, score);
	}

}
