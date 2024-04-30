package spring.day0430.anno2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFruit {
	// @Autowired // �������̽��� ������ Ŭ������ �� ���� ���� �ڵ� ������ �Ǵµ� ���� ������ Ŭ������ �� �� �̻��� ��� ���� �߻�
	// ��Ȯ�ϰ� bean�� �̸����� �����Ϸ���...
	@Resource(name = "vietnamMango")
	Mango mg;
	
	public void writeMango() {
		System.out.println("***���� �����ϴ� �����***");
		mg.writeMangoName();
	}
}
