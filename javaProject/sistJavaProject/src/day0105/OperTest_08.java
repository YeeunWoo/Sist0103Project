package day0105;

import java.util.Scanner;

public class OperTest_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		float my_height, my_weight, st_weight;
		
		System.out.print("당신의 이름? ");
		name = sc.nextLine();
		
		System.out.print("키? ");
		my_height = sc.nextFloat();
		
		System.out.print("몸무게? ");
		my_weight = sc.nextFloat();
		
		st_weight = (my_height-100)*0.9f;
		
		System.out.println("================================");
		System.out.printf("%s님의 권장 표준 몸무게는 %.1fKg 입니다.", name, st_weight);

	}

}
