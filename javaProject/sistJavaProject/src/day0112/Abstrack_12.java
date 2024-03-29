package day0112;

import java.util.Scanner;

abstract class Board { 
	public abstract void play();
}

class Insert extends Board {

	@Override
	public void play() {
		System.out.println("입력합니다.");
		
	}
	
}

class Select extends Board {

	@Override
	public void play() {
		System.out.println("출력합니다.");
		
	}
	
}

class Update extends Board {

	@Override
	public void play() {
		System.out.println("수정합니다.");
		
	}
	
}

class Delete extends Board {

	@Override
	public void play() {
		System.out.println("삭제합니다.");
		
	}
	
}

public class Abstrack_12 {

	public static void main(String[] args) {
		
		// 다형성으로 생성 메서드 출력
		/*Board b;
		
		b = new Insert();
		b.play();
		
		b = new Select();
		b.play();
		
		b = new Update();
		b.play();
		
		b = new Delete();
		b.play();*/
		
		//Board board = new Board(); 추상클래스 new로 생성 못 함
		
		Scanner sc = new Scanner(System.in);
		int num;
		Board board = null; // 부모클래스 선언
		
		while(true) {
			System.out.println("1. 쓰기 2. 조회 3. 수정 4. 삭제 5. 그 외 숫자 종료");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				board = new Insert();
				break;
			case 2:
				board = new Select();
				break;
			case 3:
				board = new Update();
				break;
			case 4:
				board = new Delete();
				break;
			default:
				System.out.println("종료");
				System.exit(0);
			}
			
			board.play();
		}
	}

}
