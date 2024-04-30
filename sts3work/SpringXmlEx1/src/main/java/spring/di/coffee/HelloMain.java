package spring.di.coffee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("자바 방식으로 Hello메서드 호출하기");
		
		Hello hello1 = new Hello();
		Hello hello2 = new Hello();
		
		System.out.println(hello1.getMessage());
		
		// 자바에서는 new로 생성할 때마다 새로운 영역에 생성한다.
		System.out.println(hello1 == hello2); // 주소 비교(레퍼런스 비교) false
		
		System.out.println("스프링 방식으로 Hello메서드 호출하기");
		
		// 설정 xml파일 가져오기... 어플리케이션 실행 시에만 필요
		// 웹으로 실행 시 web.xml에 이미 설정 되어 있으므로 필요 없음
		ApplicationContext app1 = new ClassPathXmlApplicationContext("helloContext1.xml");
		
		// 객체 생성
		Hello h1 = (Hello)app1.getBean("hello"); // 방법1
		System.out.println(h1.getMessage());
		
		Hello h2 = app1.getBean("hello", Hello.class); // 방법2
		System.out.println(h2.getMessage());
		
		System.out.println(h1 == h2); // 생성되는 주소가 같다... 스프링에서는 기본이 싱글턴
	}

}
