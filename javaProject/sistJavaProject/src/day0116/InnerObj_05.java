package day0116;

class Outer{
	
	String name = "우예은";
	int age = 22;
	
	// member 내부1
	class Inner1{
		// 내부 클래스에서는 외부 클래스의 멤버 변수 사용 가능
		public void disp() {
			System.out.println("Inner1");
			System.out.println("이름: "+ name + ", 나이: " + age + "세");
		}
	}

	// member 내부2
	class Inner2{
		public void disp2() {
			System.out.println("Inner2");
			System.out.println("이름: "+ name + ", 나이: " + age + "세");
		}
		
		
	}
	
	public void write() {
		Inner1 in1 = new Inner1();
		in1.disp();
		
		Inner2 in2 = new Inner2();
		in2.disp2();
	}
}

public class InnerObj_05 {

	public static void main(String[] args) {
		// 외부생성
		Outer out = new Outer();
		out.write();
		
		System.out.println("다른 클래스에서 외부 통하지 않고 직접 내부 클래스 메서드 호출하고 싶다면?");
		Outer.Inner1 in1 = new Outer().new Inner1();
		in1.disp();
		
		
		
	}

}
