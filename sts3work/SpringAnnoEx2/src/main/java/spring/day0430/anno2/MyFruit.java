package spring.day0430.anno2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFruit {
	// @Autowired // 인터페이스를 구현한 클래스가 한 개일 경우는 자동 주입이 되는데 만약 구현한 클래스가 두 개 이상일 경우 문제 발생
	// 정확하게 bean의 이름으로 주입하려면...
	@Resource(name = "vietnamMango")
	Mango mg;
	
	public void writeMango() {
		System.out.println("***내가 좋아하는 망고는***");
		mg.writeMangoName();
	}
}
