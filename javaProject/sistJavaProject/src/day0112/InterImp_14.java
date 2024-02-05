package day0112;

interface InterA {
	public void singasong();
	public void draw();
}

interface InterB extends InterA{
	public void playgame();
	public void write();
}

class Imple implements InterB{
	
	@Override
	public void singasong() {
		System.out.println("노래 부르기");
		
	}

	@Override
	public void draw() {
		System.out.println("그림 그리기");
		
	}

	@Override
	public void playgame() {
		System.out.println("게임하기");
		
	}

	@Override
	public void write() {
		System.out.println("글 쓰기");
		
	}

}

public class InterImp_14 {

	public static void main(String[] args) {
		
		// 하위 클래스 생성
		Imple im = new Imple();		
		im.singasong();
		im.playgame();
		
		// 다형성 생성
		InterB inb = new Imple();
		inb.draw();
		inb.playgame();

	}

}
