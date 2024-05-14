package ch01.sec11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = {"aasd","b","c","d","e"};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		String str = "abcd";
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		String str2 = new String(arr2);
		System.out.println(str2);
	}
}
