package spring.di.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex5Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext5.xml");
		
		SawonInfo sawon = (SawonInfo)context.getBean("sawon");
		
		Emp emp = (Emp)context.getBean("emp");
		emp.writeEmp();
	}

}
