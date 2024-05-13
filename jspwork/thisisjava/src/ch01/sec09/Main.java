package ch01.sec09;

public class Main {
	public static void main(String[] args) {

		int A = ((int) (Math.random() * 7))+1;
		int B = ((int) (Math.random() * 7))+1;
		int C = ((int) (Math.random() * 7))+1;
		int money = 0;
		if(A==B && B==C) {
			money = 10000+A*1000;
		} else if((A==B && B!=C)||(A!=B && B==C)){
			
		}
	}
}
