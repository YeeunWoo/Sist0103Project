package spring.di.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex4Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext4.xml");
		
		Student stu = (Student)context.getBean("stu");
		
		Sungjuk sj = (Sungjuk)context.getBean("sj");
		sj.writeSungjuk();

	}

}
