package spring.di.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1Main {

	public static void main(String[] args) {

		System.out.println("1. 자바 방식 생성 후 호출");
		
		MessageInter m1 = new Message1();
		m1.sayHello("우예은");
		
		MessageInter m2 = new Message2();
		m1.sayHello("신오옥");
		
		System.out.println("2. 스프링 방식 생성 후 호출");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		
		MessageInter m3 = (Message1)context.getBean("msgBean1"); // 방법1
		m3.sayHello("우주홍");
		
		MessageInter m4 = context.getBean("msgBean2", Message2.class); // 방법2
		m4.sayHello("우현식");
	}

}
