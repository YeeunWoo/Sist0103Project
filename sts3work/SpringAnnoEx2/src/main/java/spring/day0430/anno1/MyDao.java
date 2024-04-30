package spring.day0430.anno1;

import org.springframework.stereotype.Component;

@Component // 자동으로 빈에 등록(id가 클래스명으로 자동 등록_첫글자만 소문자 -> myDao가 아이디)
public class MyDao implements DaoInter {

	@Override
	public void insertData(String str) {
		System.out.println(str + "_데이터 db에 추가 성공!");
	}

	@Override
	public void deleteData(String num) {		
		System.out.println(num + "_데이터 삭제 성공!");
	}

}
