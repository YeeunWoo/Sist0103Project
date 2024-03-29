package day0116;

import java.util.Scanner;

// 강제 예외 발생 throw
class UserException extends Exception {
	
	public UserException(String msg) {
		super(msg); // Exception클래스 생성자를 통해 정식 메세지로 등록
	}
	
}

public class ThrowException_03 {

	public static void process() throws UserException{
		Scanner sc = new Scanner(System.in);
		int age = 0;
		
		//나이가 10~59가 아니면 UserException 강제 발생
		System.out.println("나이를 입력해주세요");
		age = sc.nextInt();
		
		if(age<10||age>=60) {
			throw new UserException("우리 모임의 나이는 10~59세 입니다.");
		} else {
			System.out.println("당신은" + age + "세 이므로 멤버 등록 가능");
		}
	}
	
	public static void main(String[] args) {

		try {
			process();
		} catch (UserException e) {
			System.out.println("오류메세지: " + e.getMessage());
		}
		
		System.out.println("정상종료");

	}

}
