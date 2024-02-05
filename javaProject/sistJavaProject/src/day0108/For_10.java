package day0108;

public class For_10 {

	public static void main(String[] args) {

		int i;
		for(i = 1; i <=10; i++) { 
			System.out.println(i+" ");
		}
		
		System.out.println("\nfor문 빠져나온 i의 값: "+i);
		
		int a = 10;
		for(;a<=50;a+=5)
			System.out.print(a+" ");
		System.out.println("\n빠져나온 a의 값: "+a);
		
		System.out.println("1~10까지 숫자 중에서 짝수 출력");
		for(int n = 1; n<=10; n++) {
			if(n%2==1)
				continue;
			System.out.println(n+"는 짝수입니다.");
		}
	}

}
