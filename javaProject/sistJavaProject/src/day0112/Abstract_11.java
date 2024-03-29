package day0112;

/* 추상클래스
 * 추상클래스는 new로 생성 못 함
 * abstract메서드는 abstract클래스에서만 존재할 수 있다.
 * abstract클래스는 일반메서드 추상메서드 둘 다 포함O
 */

abstract class Fruit {
	
	public static final String MESSAGE = "오늘은 추상클래스 배우는 날...";
	
	// 일반메서드
	public void showTitle() {
		System.out.println("일반메서드 입니다.");
	}
	
	//추상메서드(미완의 메서드, 구현부가 없다)...오버라이딩이 목적
	abstract public void showMessage();
}

class Apple extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Apple_Message");
	}
	
}

class Banana extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Banana_Message");
	}
	
}

class Orange extends Fruit {

	@Override
	public void showMessage() {
		System.out.println(Fruit.MESSAGE);
		System.out.println("Orange_Message");
	}
	
}

public class Abstract_11 {

	public static void main(String[] args) {
		
		// 일반 생성 출력(자식으로 선언, 자식으로 생성)
		Apple apple = new Apple();
		apple.showMessage();
		
		
		// 다형성 출력
		Fruit fruit;
		
		fruit = new Apple();
		fruit.showMessage();
		fruit.showTitle();
		
		// 추상클래스 생성
		Fruit fr = new Fruit() {
			
			@Override
			public void showMessage() {
					
			}
		};

	}

}
