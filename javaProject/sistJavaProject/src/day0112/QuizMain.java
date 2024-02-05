package day0112;

import java.util.Scanner;

class Quiz {
	private String name;
	private int java;
	private int oracle;
	private int html;
	
	
	public Quiz(String n, int j, int o, int h) {
		this.name = n;
		this.java = j;
		this.oracle = o;
		this.html = h;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getOracle() {
		return oracle;
	}


	public void setOracle(int oracle) {
		this.oracle = oracle;
	}


	public int getHtml() {
		return html;
	}


	public void setHtml(int html) {
		this.html = html;
	}


	public int getTotal() {
		int result = java + oracle + html; 
		return result;
	}
	
	public double getAverage() {
		double result = getTotal()/3;
		return result;
	}
	
	public void getPyungga() {
		
		if(getAverage()>=90.0) {
			System.out.println("장학생");
		} else if(getAverage()>=80.0)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
	}
	
}

public class QuizMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int inwon;
		int java;
		int oracle;
		int html;
		
		while(true) {
			System.out.print("이름: ");
			name = sc.nextLine();
			System.out.print("JAVA: ");
			java = sc.nextInt();
			System.out.print("ORACLE: ");
			oracle = sc.nextInt();
			System.out.print("HTML: ");
			html = sc.nextInt();
			
			Quiz q = new Quiz(name, java, oracle, html);
			System.out.print(name+"\t"+java+"\t"+oracle+"\t"+html+"\t");
			q.getTotal();
			q.getAverage();
			q.getPyungga();
		}
		
		//Quiz q = new Quiz("우예은", 100, 50, 90);
		//q.getPyungga();
		

	}

}
