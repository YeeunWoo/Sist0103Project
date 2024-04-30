package spring.day0430.anno2;

import org.springframework.stereotype.Component;

@Component
public class VietnamMango implements Mango {

	@Override
	public void writeMangoName() {
		System.out.println("내가 좋아하는 베트남 망고");
	}

}
