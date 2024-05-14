package ch01.sec11;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/ch01/sec11/input.txt"));
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // 테스트 케이스 수 입력 받기
        
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = scanner.nextInt();  // 배열 A의 길이
            int M = scanner.nextInt();  // 배열 B의 길이

            int[] A = new int[N];
            int[] B = new int[M];

            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            for (int i = 0; i < M; i++) {
                B[i] = scanner.nextInt();
            }

            int maxSum = 0;
            // 길이가 짧은 배열을 움직이는 방식으로 비교
            if (N <= M) {
                for (int i = 0; i <= M - N; i++) {
                    int sum = 0;
                    for (int j = 0; j < N; j++) {
                        sum += A[j] * B[i + j];
                    }
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            } else {
                for (int i = 0; i <= N - M; i++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        sum += A[i + j] * B[j];
                    }
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

            // 결과 출력
            System.out.println("#" + test_case + " " + maxSum);
        }

        scanner.close();
	}
}