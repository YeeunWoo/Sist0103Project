package ch01.sec11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int total = H*60+M+X;
		H = total/60;
		if(H>=24)
			H-=24;
		M = total%60;
		System.out.println(H + " " + M);      
    }
}

