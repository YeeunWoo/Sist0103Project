package day0110;

import java.util.Calendar;

class Test{
	private Test() {
		
	}

	// 생성자 대신 인스턴스를 반환해주는 매서드
	public static Test getInstance() {
		return new Test();
	}
	
	public void writeMessage() {
		System.out.println("안녕");
	}
}

public class GetInstance_15 {
	public static void main(String[] args) {
		
		//Test t1 = new Test();
		Test t1 = Test.getInstance();
		t1.writeMessage();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		
		System.out.println(year);
	}
}
