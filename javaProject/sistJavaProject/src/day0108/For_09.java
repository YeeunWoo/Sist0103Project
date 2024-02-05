package day0108;

public class For_09 {

	public static void main(String[] args) {
		/*
		 * 가로로 1~10까지 출력
		 */
		
		int n = 1;
		while(n<=10) {
			System.out.print(n++ + " ");
		}
		
		System.out.println();
		
		n = 10;
		while(n>=1) {
			System.out.print(n-- + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i <50; i+=5) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 1; i <=20; i++) {
			// 1 2 3 4 6 7 8 9 11 12... 19
			// 5의 배수 빼고 출력
			if(i%5==0)
				continue; // i++로 이동
			System.out.print(i+" ");
		}

	}

}
