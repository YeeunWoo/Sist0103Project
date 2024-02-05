package day0112;

// 부모
class Work{
	
	public void goodmorning() {
		System.out.println("좋은 아침~");
	}
	
	public void proc() {
		System.out.println("아무 것도 안 하고 있음...");
	}
}

// 자식
class Food1 extends Work{
	
	@Override
	public void proc() {
		System.out.println("***음식 담당***");
	}
	
}

//자식
class Clean extends Work {
	
	@Override
	public void proc() {
		System.out.println("***청소 담당***");
	}
	
}

//자식
class Sing extends Work {
	
	@Override
	public void proc() {
		System.out.println("***노래 담당***");
	}
	
}

public class Inherit_10 {

	public static void main(String[] args) {
		
		/*
		 * 다형성
		 * 부모 클래스로 선언하고 자식 클래스로 생성하는 경우(변수가 하나만 필요할 때)
		 */
		
		Work work = null; // 부모로 선언
		work = new Food1(); // 자식으로 생성
		
		work.goodmorning();
		work.proc();
		
		work = new Clean();
		work.goodmorning();
		work.proc();
		
		work = new Sing();
		work.goodmorning();
		work.proc();
	
	}

}
