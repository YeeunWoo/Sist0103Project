package day0105;

import java.util.Calendar;
import java.util.Scanner;

public class QuizMyAgeInOut_08 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		int curYear = cal.get(cal.YEAR);
		int myYear, myAge;
				
		System.out.print("당신의 이름은?==>");
		name = sc.nextLine();
		
		System.out.print("당신이 태어난 연도는?==>");
		myYear = Integer.parseInt(sc.nextLine());
		
		System.out.print("당신이 사는 지역은?==>");
		addr = sc.nextLine();
		
		myAge = curYear - myYear;
		
		System.out.printf("이름: %s\n태어난년도:%s\n나이: %d세\n지역: %s", name, myYear, myAge, addr);

	}

}
