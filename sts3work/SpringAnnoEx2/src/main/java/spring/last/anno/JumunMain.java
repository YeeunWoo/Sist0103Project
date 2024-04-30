package spring.last.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JumunMain {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("annoContext1.xml");
		
		OrderController order = (OrderController)app.getBean("orderController");
		
		order.jumunInsert("ĭ��", 1000, "��ũ");
		order.jumunDelete("2");
		order.jumunSelect("Ȩ����", 1500, "�ʷ�");
		
	}

}
