package spring.day0430.anno2;

import org.springframework.stereotype.Component;

@Component("tMango")
public class ThaiMango implements Mango {

	@Override
	public void writeMangoName() {
		System.out.println("내가 좋아하는 태국 망고");
	}

}
