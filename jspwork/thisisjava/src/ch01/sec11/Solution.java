package ch01.sec11;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/ch01/sec11/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == i) {
						arr[i][j] = 1;
					} else {
						arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
					}
				}
			}

			System.out.println("#" + test_case);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}

		}

		sc.close();
	}
}