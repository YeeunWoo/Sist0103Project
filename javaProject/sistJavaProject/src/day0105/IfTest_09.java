	package day0105;

public class IfTest_09 {

	public static void main(String[] args) {
		
		int a = 10;
		
		if(a>5) { 
			System.out.println(a+"은(는) 5보다 크다");
		}
		
		int b = 9;
		
		if(b%2==0) {
			System.out.printf("%d -> 짝수\n",b);
		}
		System.out.printf("%d -> 홀수\n",b);
		
		System.out.println("if문 종료");

	}

}
