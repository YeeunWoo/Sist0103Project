package day0116;

import java.util.Scanner;

class SawonOuter{
	private String sawonName;
	private int gibonPay, familySu, timeSu;
	
	public void process() {
		
		//데이터 입력
		InputInner i = new InputInner();
		i.inputData();
		
		//결과 출력
		SudangInner s = new SudangInner();
		s.writeSawanData();
		
	}
	
	class InputInner{
		
		public void inputData() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("사원명 입력: ");
			sawonName = sc.nextLine();
			System.out.print("기본급 입력: ");
			gibonPay = sc.nextInt();
			System.out.print("초과시간 입력: ");
			timeSu = sc.nextInt();
			System.out.print("가족 수 입력: ");
			familySu = sc.nextInt();
			
		}
		
	}
	
	class SudangInner{
		
		public int getTimeSudang() {
			return timeSu * 300;
		}
		
		public int getFamilySudang() {
			if(familySu<=4) {
				return 200;
			} else {
				return 300;
			}
		}
		
		public int getTax() {
		return (int)(gibonPay*0.03);
		}

		public int getTotalPay() {
			return gibonPay + getFamilySudang() + getTimeSudang()-getTax();
		}
		
		public void writeSawanData() {
			System.out.println("사원명\t기본급\t초과시간\t가족 수\t시간수당\t가족수당\t세금\t총 급여");
			System.out.println(sawonName + "\t" + gibonPay + "\t" + timeSu + "\t" + familySu + "\t" + getTimeSudang() + "\t" + getFamilySudang() + "\t" + getTax() + "\t" + getTotalPay());
		}
		
	}

}

public class QuizInnerClass_10 {

	public static void main(String[] args) {
		
		SawonOuter s = new SawonOuter();
		
		// 방법1: 외부 클래스의 멤버에서 내부 클래스의 멤버를 호출 후 
		//       메인에서는 외부 클래스 생성 후 외부 메서드 호출
		// s.process();
		
		// 방법2: 내부 클래스를 외부클래스를 통해 생성 후 메서드 호출
		SawonOuter.InputInner input = s.new InputInner();
		input.inputData();
		
		SawonOuter.SudangInner output = s.new SudangInner();
		output.writeSawanData();

	}

}
