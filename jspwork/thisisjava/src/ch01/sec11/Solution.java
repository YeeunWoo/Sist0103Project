package ch01.sec11;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("src/ch01/sec11/input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("#" + test_case + " " + (A/B) + " " + (A%B));
			
		}
	}
}