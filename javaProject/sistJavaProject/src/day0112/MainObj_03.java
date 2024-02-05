package day0112;

//부모클래스의 멤버를 자식 클래스가 선언 없이 사용 가능 
//private은 같은 패키지여도 상속X
//자바는 단일 상속만 가능
//상속 extends라는 키워드로 표현
//class 자식클래스 extends 부모클래스

public class MainObj_03 {

	public static void main(String[] args) {
		
		SubObj_03 sub = new SubObj_03("김선호", 22, "강남구");
		sub.writeData();
		
	}

}
