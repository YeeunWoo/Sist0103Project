package day0109;

import java.util.Scanner;

public class WhileReview_03 {

	public static void main(String[] args) {
		/*
		 * 반복적으로 나이를 입력한다. 0이 되면 종료
		 * 나이가 50세 이상일 경우 a변수 증가
		 * 나이가 30세 이상 b변수 증가
		 * 그 이외는 c변수 증가
		 * 
		 * 빠져나온 후 출력 내용
		 * 50세 이상: 3명
		 * 30세 이상: 2명
		 * 그 외: 3명
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int age, a=0, b=0, c=0;
		
		while(true) {
			
			System.out.print("나이 입력: ");
			age = sc.nextInt();
			
			if(age==0)
				break;
			
			if(age>=50) {
				a++;
			} else if(age>=30) {
				b++;
			} else if(age>0 && age<30){
				c++;
			} else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		System.out.println("50세 이상: " + a);
		System.out.println("30세 이상: " + b);
		System.out.println("그 외: " + c);

	}

}
