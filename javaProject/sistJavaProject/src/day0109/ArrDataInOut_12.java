package day0109;

import java.util.Scanner;

public class ArrDataInOut_12 {

	public static void main(String[] args) {
		// 배열 생성 후 생성한 만큼의 입력 출력
		Scanner sc = new Scanner(System.in);
		
		int[] data; 
		data = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i<data.length;i++) {
			System.out.print((i+1)+"번째 값: ");
			data[i] = sc.nextInt();
			sum += data[i];
		}
		System.out.println(sum);
	}

}
