package spring.di.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");
		
		// MyInfo
		MyInfo my = (MyInfo)context.getBean("my");
		
		System.out.println(my);
		System.out.println(my.toString()); // .toString() 생략 시 자동 호출되는 메서드
		
		// Person
		Person p = (Person)context.getBean("person");
		p.writeData();
	}

}
