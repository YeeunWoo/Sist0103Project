package day0105;

public class SwitchTest_17 {

	public static void main(String[] args) {
		// switch문 예제
		
		int a = 2;
		
		//break가 없을 경우 끝까지 실행!
		switch(a) {
		case 1:
			System.out.println("a is 1");
			break;
		case 2:
			System.out.println("a is 2");
			break;
		case 3:
			System.out.println("a is 3");
			break;
		default:
			System.out.println("a 입력 값 없음");
		}

		char ch = 'C';
		
		switch(ch) {
		case 'A':
			System.out.println("apple");
			break;
		case 'B':
			System.out.println("Banana");
			break;
		default:
			System.out.println("사과 바나나가 아니다!!");
		}
		
		String msg = "Happy";
		// switch 문자열 jdk8부터 가능
		
		switch(msg) {
		  case "Hello":
			System.out.println("msg는 Hello다");
			break;
		  case "Happy":
			System.out.println("msg는 Happy");
			break;
		  case "Hi":
			System.out.println("msg는 Hi");
			break;
		  default:
			System.out.println("인사 안 함 ^^;");
		}
		
		
	}

}
