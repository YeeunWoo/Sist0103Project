package day0111;

import java.util.Scanner;

class Emp {
	private String sName;
	private int gPay;
	private int fSu;
	private int tSu;
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getgPay() {
		return gPay;
	}
	public void setgPay(int gPay) {
		this.gPay = gPay;
	}
	public int getfSu() {
		return fSu;
	}
	public void setfSu(int fSu) {
		this.fSu = fSu;
	}
	public int gettSu() {
		return tSu;
	}
	public void settSu(int tSu) {
		this.tSu = tSu;
	}
	
	// 가족 수당
	public int getFamilySudang() {
		int result;
		
		if(fSu>=2) {
			result = 100000;
		} else {
			result = fSu*50000;
		}
		
		return result;
	}
	
	public int getTimeSudang() {
		int result;
		
		if(tSu>=10) {
			result = 300000;
		} else {
			result = tSu*30000;
		}
		
		return result;
	}
	
	public int getTotalPay() {
		int n = gPay + getFamilySudang()+getTimeSudang();
		return n;
	}
	
	// 제목
	public static void showTitle() {
		System.out.println("**쌍용 01월 직원 급여 현황**");
		System.out.println();
		System.out.println("사원명\t기본급\t자녀수\t초과근무시간\t가족수당\t시간수당\t총급여");
		System.out.println("==================================================");
	}
	
}

public class SawonInstanceScanner_14 {
	
	public static void writeEmp(Emp[] emp) {
		// 제목부터 출력
		Emp.showTitle();
		for(Emp e:emp) {
			System.out.println(e.getsName()+"\t"+e.getgPay()+
					"\t"+e.getfSu()+"\t"+e.gettSu()+"\t"+e.getFamilySudang()+
					"\t"+e.getTimeSudang()+"\t"+e.getTotalPay());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inwon;
		Emp[] emp;
		
		System.out.println("입력할 직원수는?");
		inwon=Integer.parseInt(sc.nextLine());
		
		// 배열할당
		emp = new Emp[inwon];
		
		// 인원 수 만큼 데이터 입력
		for(int i = 0;i<inwon;i++) {
			emp[i] = new Emp();
			
			System.out.println("이름: ");
			String name= sc.nextLine();
			System.out.println("기본 급: ");
			int pay= Integer.parseInt(sc.nextLine());
			
		}
		

	}

}
