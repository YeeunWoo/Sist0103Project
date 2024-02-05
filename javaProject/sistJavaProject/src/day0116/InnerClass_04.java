package day0116;

class OuterObj{
	
	public void disp() {
		System.out.println("외부 클래스의 disp메서드");
		System.out.println("외부에서 내부 클래스의 write 메서드 호출");
		InnerObj inObj = new InnerObj();
		inObj.write();
	}
	
	class InnerObj{
		public void write() {
			System.out.println("내부 클래스의 write메서드");
		}
	}
}

public class InnerClass_04 {

	public static void main(String[] args) {
		
		OuterObj outObj = new OuterObj();
		outObj.disp();
		System.out.println();
		
		//내부 클래스는 외부를 통해서만 생성 가능
		OuterObj.InnerObj obj = new OuterObj().new InnerObj();
		obj.write();
		System.out.println();
		
		OuterObj.InnerObj obj2 = outObj.new InnerObj();
	}

}
