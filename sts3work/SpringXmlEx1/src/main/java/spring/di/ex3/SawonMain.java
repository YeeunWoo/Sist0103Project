package spring.di.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SawonMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");
		
		SawonData data = (SawonData)context.getBean("data");
		
		System.out.println(data);
		
		Sawon sawon = (Sawon)context.getBean("sawon");
		sawon.writeData();
		
		Sawon sawon2 = context.getBean("sawon2", Sawon.class);
		sawon2.writeData();
	}

}
