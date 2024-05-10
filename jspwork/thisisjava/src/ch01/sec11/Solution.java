package ch01.sec11;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			int avg = (int) Math.round(sum / 10.0);
			System.out.println("#" + test_case + " " + avg);
		}
	}
}
