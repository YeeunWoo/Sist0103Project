package day0108;

import java.util.Scanner;

public class OperReview_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat;
		
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("국영수 점수: ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		double avg = (kor+eng+mat)/3.0;
		
		/*System.out.println("3과목 점수: "+kor+","+eng+","+mat);
		System.out.printf("평균: %5.2f\n",avg);
		
		System.out.println("**합격조건: 평균 60점 이상이고 각 과목 모두 40점 이상**");
		System.out.println("===========================================");
		
		// if 조건문
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) {
			System.out.println(name + "님은 합격입니다.");
		} else {
			System.out.println(name + "님은 불합격입니다.");
		}*/
		
		// 삼항연산자
		System.out.printf("평균: %5.1f\n",avg);
		System.out.println("**80점 이상: 매우 잘 함 70점 이상: 잘 함 70점 미만: 불합격**");
		System.out.println("평가: "+(avg>=80?"매우 잘 함":avg>=70?"잘 함":"불합격"));
		
	}

}
