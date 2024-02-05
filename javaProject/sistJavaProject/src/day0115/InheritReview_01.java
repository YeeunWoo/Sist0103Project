package day0115;

interface InterA{
	public void play();
}

interface InterB{
	public void draw();
}

class InterImple implements InterA, InterB{

	@Override
	public void draw() {
		System.out.println("그림을 그린다");
		
	}

	@Override
	public void play() {
		System.out.println("게임을 한다");
		
	}
	
}
public class InheritReview_01 {

	public static void main(String[] args) {
		
		InterImple a = new InterImple();
		a.draw();
		a.play();
		
		InterA aa = new InterImple();
		aa.play();
		
		InterB bb = new InterImple();
		bb.draw();
	}

}
