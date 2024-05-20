package ch01.sec11;

import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/ch01/sec11/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			if(test_case%3!=0) {
				System.out.print(test_case+" ");
			} else {
				//System.out.print("- ");
				
			}
		}

		sc.close();
	}
}