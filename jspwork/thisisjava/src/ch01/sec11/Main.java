package ch01.sec11;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("src/ch01/sec11/input.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = N / 4;

		for (int i = 0; i < cnt; i++) {
			System.out.print("long ");
		}

		System.out.print("int");

	}
}
