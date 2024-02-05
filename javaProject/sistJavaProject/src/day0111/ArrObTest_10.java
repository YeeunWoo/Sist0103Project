package day0111;

class Student {
	private String stuName;
	private String hp;
	private int score;
	
	// 생성자 3개 짜리
	public Student(String name, String hp, int score) {
		this.stuName = name;
		this.hp = hp;
		this.score = score;
	}
	
	// 출력 메서드
	public void writeData() {
		System.out.println("이름: " + stuName);
		System.out.println("전화번호 : " + hp);
		System.out.println("점수: " + score);
	}
}

public class ArrObTest_10 {

	public static void main(String[] args) {
		
		/*Student[] stu = new Student[3];

		stu[0] = new Student("이민호", "010-111-2222", 88);
		stu[1] = new Student("이영자", "010-2222-3333", 77);
		stu[2] = new Student("김민정", "010-1122-3432", 98);*/
		
		// 생성과 동시에 초기화
		Student[] stu = {
				 new Student("이민호", "010-111-2222", 88),
				 new Student("이영자", "010-2222-3333", 77),
				 new Student("김민정", "010-1122-3432", 98)
		};
		
		// 배열 출력(방법1)
		for(int i = 0; i<stu.length; i++) {
			Student s = stu[i];
			s.writeData();
			// stu[i].writeDAte();
			System.out.println("-------------------");
		}
		
		// 배열 출력(방법2)
		for(Student s: stu) {
			s.writeData();
			System.out.println("-------------------");
		}

	}

}
