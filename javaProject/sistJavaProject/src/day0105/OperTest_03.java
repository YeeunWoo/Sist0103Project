package day0105;

public class OperTest_03 {

	public static void main(String[] args) {
		
		int a, b;
		a = b = 5;
		
		++a;
		b++;
		
		System.out.println("a = "+a+", b = "+b);;
		
		int m, n;
		m = n = 0;
		a = b = 5;
		
		m=a++;
		System.out.printf("m = %d a = %d\n", m, a);
		
		n=++b;
		System.out.printf("n = %d b = %d", n, b);
		
		
		
	}

}
