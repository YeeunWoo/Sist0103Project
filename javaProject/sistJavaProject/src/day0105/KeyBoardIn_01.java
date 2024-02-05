package day0105;

import java.util.Scanner;

public class KeyBoardIn_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String name, hp, addr;
		
		System.out.print(("이름 입력: "));
		name = sc.nextLine();
		
		System.out.print("핸드폰 번호 입력: ");
		hp = sc.nextLine();
		
		System.out.print("주소 입력: ");
		addr = sc.nextLine();
		
		System.out.println("==============================");
		System.out.println("\t[입력 결과]");
		System.out.println("이름: "+ name + "님");
		System.out.println("핸드폰: "+ hp);
		System.out.println("주소: "+ addr);
		
	}

}
