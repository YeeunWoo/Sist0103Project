package day0108;

public class SumTest_11 {

	public static void main(String[] args) {
		// 반복문안에서 합계구하기
		
		int sum = 0;
		
		for(int i = 1; i<=10;i++) {
			sum+=i;
		}
		
		System.out.println("1~10까지의 합: "+sum);
		
		int n = 1;
		int tot = 0;
		
		while(n<=10) {
			tot += n;
			n++;
		}
		
		System.out.println("1~10까지의 합: "+tot);
		
		System.out.println("for문으로 1~10까지 중 2씩 증가할 경우의 합계를 구하시오");
		
		sum = 0;
		
		for(int x = 1; x <=10; x +=2) {
			sum +=x ;
		}
		System.out.println(sum);
		
	}

}
