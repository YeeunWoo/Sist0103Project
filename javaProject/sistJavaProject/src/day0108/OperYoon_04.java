package day0108;

import java.util.Scanner;

public class OperYoon_04 {

	public static void main(String[] args) {
		// 윤년공식: (year % 4 == 0 && year%100 != 0 || year % 400 == 0)
		// 연도를 입력해서 그 해가 윤년인지 평년인지 출력하고 해당 달이 몇 일까지 있는 지 출력
		
		Scanner sc = new Scanner(System.in);
		int year, month, days;
		boolean flag;
		
		System.out.print("년도와 월 입력: ");
		year = sc.nextInt();
		month = sc.nextInt();
		
		// 월 잘못 입력 시 프로그램 종료
		if(month<1 || month >12) {
			System.out.println("월을 잘못 입력했어요!");
			return; // 메인메서드 종료
		} 
		
		// 윤년 구하기
		flag = year % 4 == 0 && year%100 != 0 || year % 400 == 0;
		
		if(flag)
			System.out.printf("%d년도는 윤년입니다.\n",year);
		else
			System.out.printf("%d년도는 평년입니다.\n",year);
		
		// 해당 년도의 월이 몇 일까지 있는 지 구하기
		if(month==4||month==6||month==9||month==11)
			days = 30;
		else if(month==2) {
			if(flag)
				days = 29; // 윤년일 경우는 29일까지 있다
			else
				days = 28;
		} else 
			days= 31;
		System.out.printf("%d년 %d월은 %d일 까지 있습니다.",year, month, days);
	
	}

}
