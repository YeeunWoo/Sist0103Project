package spring.day0430.anno2;

import org.springframework.stereotype.Component;

@Component
public class VietnamMango implements Mango {

	@Override
	public void writeMangoName() {
		System.out.println("���� �����ϴ� ��Ʈ�� ����");
	}

}
