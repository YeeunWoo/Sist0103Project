package day0108;

public class DoWhile_08 {

	public static void main(String[] args) {
		// 선조건 후조건 차이
		
		int n=1;
		
		System.out.println("while문 결과");
		while(n<5) {
			System.out.println(n++);
		}
		
		System.out.println("do while문 결과");
		
		n=1;
		
		do {
			System.out.println(n++);
		}while(n<=5);
		
	}

}
