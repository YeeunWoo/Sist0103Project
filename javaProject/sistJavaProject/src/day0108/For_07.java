package day0108;

public class For_07 {

	public static void main(String[] args) {
		// while문과 for문 비교
		
		int i = 10;
		
		System.out.println("while문 10~0 출력");
		
		while(i>=0) {
			System.out.print(i--+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("for문 10~0 출력");
		
		for(i=10;i>=0;i--)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println();
		System.out.println("for문 1~10 출력");
		
		for(i=1;i<=10;i++)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println();
		System.out.println("while문 1~10 출력");
		
		i = 1;
		
		while(i<=10) {
			System.out.print(i++ + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("for문 1, 4, 7, 10 출력");
		
		for(i=1;i<=10;i += 3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("for문 5 4 3 2 1 출력");
		
		for(i=5;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("while문 5 4 3 2 1 출력");
		
		i = 5;
		
		while(i>0) {
			System.out.print(i-- + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for(i=5;i>=1;i--) {
			System.out.println("HelloJava");
		}
	}

}
