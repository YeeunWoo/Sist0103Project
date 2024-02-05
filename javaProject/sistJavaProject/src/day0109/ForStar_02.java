package day0109;

public class ForStar_02 {

	public static void main(String[] args) {
		
		System.out.println("다중 for문으로 star 출력하기");
		
		for(int i = 1; i<=5; i++) { // 행 갯수
			for(int j = 1; j<=i;j++) { // 열 갯수(i 값 만큼만 반복)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i<=5; i++) { // 행 갯수
			for(int j = i; j<=5;j++) { // 열 갯수(i 값 1일 때 5번, i가 2일 때 4번.....5일 때 1)
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
