package day0116;

public class ExceptionReview_02 {

	public static void process() {
		int[] arr = {1, 3, 9, 7};
		
		for(int i = 0; i<=arr.length;i++) {
			try {
				System.out.println(arr[i]);
			} catch(Exception e) {
				System.out.println("오류 메세지 1: " + e.getMessage());
			}
		}
	}
	
	// throws: 던지다
	// 익셉션 처리를 직접 하지 않고 호출하는 곳으로 해당 익셉션을 던진다
	public static void process2() throws NumberFormatException {
		
		String a = "12a";
		String b = "30";
		int sum = 0;
		
		sum = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println("두 수의 합은" + sum);
		
	}
	
	public static void main(String[] args) {

		process();
		
		try {
			process2();
		} catch (NumberFormatException e ) {
			System.out.println("예외 처리를 메인에서 했어요" + e.getMessage());
		}
		
		System.out.println("정상종료");
	}

}
