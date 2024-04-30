package spring.day0430.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex2Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("annoContext1.xml");
		
		//Mango mg = (VietnamMango)app.getBean("vietnamMango");
		//mg.writeMangoName();
		
		MyFruit mf = (MyFruit)app.getBean("myFruit");
		mf.writeMango();
	}

}
