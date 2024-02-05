package day0108;

import java.util.Scanner;

public class ForGugo_14 {

	public static void main(String[] args) {
		// 중첩 for문 이용한 구구단(2~9단)

		/*for(int dan = 2; dan<=9; dan++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",dan, j, dan*j);
			}
			System.out.println();
		}*/

		//break문을 이용한 구구단

		/*loop1:  for(int dan = 2; dan <=9; dan++) {
			for(int j = 1; j<=9;j++) {
				if(j==5)
					break loop1; // 이름을 명시하여 여러 반복문을 빠져나가는 것도 가능(네이밍:)
				System.out.printf("%d X %d = %d\n",dan, j, dan*j);
			}
			System.out.println();


		}*/
		/*System.out.println("문제) 단을 입력하면 해당 단이 나오게 해주세요.[n단] 2~9단까지만 가능 0단 입력 시 종료");

		Scanner sc = new Scanner(System.in);
		int dan;

			while(true) {
				System.out.print("단을 입력해주세요: ");
				dan = sc.nextInt();

				if(dan==0) {
					System.out.println("프로그램 종료");
					break;
				}

				// 잘못 입력한 경우
				if(dan<2 || dan>9) {
					System.out.println("2~9단으로 다시 입력해주세요.");
					continue;
				}

				System.out.printf("[%d단]\n",dan);

				for(int i = 0; i<=9;i++) {
					System.out.printf("%d X %d = %d\n",dan, i, dan*i);
				}
			}
		 */
		System.out.println("가로 방향으로 구구단 출력");
		/*
		 * [2단]		[3단]	[4단] 	-단일 for
		 * 2X1=2	3X1=3	4X1=4	-다중 for
		 * 2X2=4
		 */
		for(int d=2;d<=9;d++) {
			System.out.printf("[%d단]\t\t",d);
		}

		System.out.println();
		System.out.println();

		for(int i = 1;i<=9;i++) {
			for(int d =2;d<=9;d++) {
				System.out.printf("%d X %d = %d\t",d, i, d*i);
			}
			System.out.println();
		}
	}

}
