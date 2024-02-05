package day0104;

public class ParseNum_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String su1 = "8";
		String su2 = "2";
		System.out.println("두 수 더하기: "+(su1+su2));
		
		
		// 문자열을 정수로 변환 후 계산해보기
		// Wrapper Class: 기본형과 클래스형간의 변환을 위한 클래스를 
		int s1=Integer.parseInt(su1);
		int s2=Integer.parseInt(su2);
		System.out.println(s1+s2);
		System.out.println(s1-s2);
		System.out.println(s1*s2);
		System.out.println(s1/s2);

	}

}
