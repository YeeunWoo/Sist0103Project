package day0111;

class Member2 {
	private String name;
	private String mbti;
	private int age;
	
	public Member2(String n, String m, int a) {
		this.name = n;
		this.mbti = m;
		this.age = a;
	}
	
	public void writeMember() {
		System.out.println(name+"\t"+mbti+"\t" + age + "세");
	
	}
	
}

public class QuizArrObTest_12 {

	public static void main(String[] args) {
		
		/*Member2 m1 = new Member2("이효리", "ENTP", 26);
		Member2 m2 = new Member2("이상순", "ISFJ", 33);
		Member2 m3 = new Member2("이영자", "ENFJ", 28);*/
		
		Member2[] m = {
				new Member2("이효리", "ENTP", 26),
				new Member2("이상순", "ISFJ", 33),
				new Member2("이영자", "ENFJ", 28)
		};
		
		System.out.println("이름\tMBTI\t나이");
		
		/*m1.writeMember();
		m2.writeMember();
		m3.writeMember();*/
		
		for(Member2 member:m) {
			member.writeMember();
		}
	}

}
