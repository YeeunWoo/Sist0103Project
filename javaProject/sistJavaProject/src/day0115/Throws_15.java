package day0115;

import java.util.Scanner;

/*
 * throws - 호출한 영역으로 예외처리를 던짐
 * 강제로 예외를 발생시킬 때
 */

public class Throws_15 {

	public static void scoreInput() throws Exception {
		Scanner sc = new Scanner(System.in);
		int score;
		
		// 점수가 1~100 사이가 아니면 익셉션 강제 발생
		System.out.println("점수 입력: ");
		score = sc.nextInt();
		
		if(score<0 || score >100) {
			throw new Exception("점수가 잘못 입력됨");
		} else {
			System.out.println("나의 점수는 " + score + "점 입니다.");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			scoreInput();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("오류 메세지: " + e.getMessage());
		}
		
		System.out.println("정상 종료");
	}

}
