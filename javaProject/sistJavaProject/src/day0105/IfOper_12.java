package day0105;

import java.util.Scanner;

public class IfOper_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y, max;
		
		System.out.println("**두 개의 숫자를 입력하세요**");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.printf("입력한 두 수는 %d, %d 입니다.\n", x, y);

		
		/*if(x>y)
			max = x;
		else
			max = y;
		
		System.out.printf("두 수 중에서 더 큰 값은 %d 입니다.", max);
		*/
		
		max = x>y?x:y;
		
		System.out.printf("두 수 중에서 더 큰 값은 %d 입니다.\n", max);
		
		System.out.println("첫 번째 수가 더 " + ( x > y ? "크다" : "작다" ));
		
	}

}
