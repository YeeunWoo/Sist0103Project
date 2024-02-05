package day0109;

public abstract class ArrString_11 {

	public static void main(String[] args) {
		// 문자열 배열
		String [] str1 = {"텀블러", "키보드","핸드크림"};
		String [] str2 = {"red", "pink","bleu"};
		
		// str1은 1번째: 텀블러
		System.out.println("str1_출력1_for");
		for(int i = 0;i<str1.length; i++)
			System.out.print(str1[i]);
		System.out.println("str1_출력2_foreach");
		for(String a1:str1) {
			System.out.print(a1);
		}
		
		System.out.println("\n\n");
		
		// strColors 0번지 색;
		System.out.println("str2_출력1_for");
		for(int i = 0;i<str2.length; i++)
			System.out.print(str2[i]);
		System.out.println("str2_출력2_foreach");
		for(String a2:str2) {
			System.out.print(a2);
		}
	}

}
