package day0115;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_09 {

	// 제네릭 유형을 클래스로 지정했으므로 데이터를 꺼내고 받을 때도 클래스로
	List<Board_09> list = new Vector<Board_09>();
	
	// 입력 메서드
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		
		String writer, subject, content;
		
		System.out.println("작성자명: ");
		writer = sc.nextLine();
		
		System.out.println("제목: ");
		subject = sc.nextLine();
		
		System.out.println("내용: ");
		content = sc.nextLine();
		
		Board_09 data = new Board_09(writer, subject, content);
		list.add(data);
		
		System.out.println("현재 데이터 갯수: " + list.size() + "개");
	}
	
	// 출력 메서드
	public void writeData() {
		System.out.println("IT교재 목록");
		System.out.println("======================");
		for(int i = 0; i<list.size(); i++) {
			Board_09 b = list.get(i);
			System.out.println("No. " + (i+1) + "\t작성자: " + b.getWriter());
			System.out.println("제목: " + b.getSubject());
			System.out.println("내용: " + b.getContent());
			System.out.println("--------------------");
		}
	}
	
	public static void main(String[] args) {
		
		VectorBoard_09 vt = new VectorBoard_09();
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			System.out.println("1. 입력   2. 전체 출력   3. 종료");
			n = Integer.parseInt(sc.nextLine());
			
			if(n==1)
				vt.inputData();
			else if ( n==2) {
				vt.writeData();
			} else if (n==3) {
				System.out.println("종료");
				break;
			}
		}
	}

}
