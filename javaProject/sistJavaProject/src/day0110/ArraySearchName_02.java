package day0110;

import java.util.Scanner;

import day0105.Equal_15;

public class ArraySearchName_02 {

	public static void main(String[] args) {

		String[] names = {"우일", "우이", "우삼", "우사", "우오", "우육"};
		String name;
		boolean flag;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("이름 입력: ");
			name = sc.nextLine();
			
			if(name.equals("0")) {
				System.out.println("종료");
				break;
			}
			
			flag = false;
			
			for(int i = 0; i<names.length; i++) {
				if(name.equals(names[i])) {
					flag = true;
					System.out.println((i+1)+"번째 이름입니다.");
				} 
			}
			if(!flag)
				System.out.println("없는 이름");
			
		}

	}

}
