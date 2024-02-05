package day0112;

public class MainSawon_05 {

	public static void main(String[] args) {
		
		My my1 = new My("이영자", "인사부", 22);
		my1.writeMy();
		System.out.println();
		System.out.println("오버라이드 통해 만든 메서드 호출");
		my1.display();

	}

}
