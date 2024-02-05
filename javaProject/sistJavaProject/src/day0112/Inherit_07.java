package day0112;

class School {
	public static final String SCHOOLNAME = "쌍용고등학교";
	private String schoolAddr;
	private int countStu;
	private int countTeacher;
	
	public School() {
		this("강남구 역상도", 120, 10);
	}
	public School(String saddr, int cntstu, int cntteacher) {
		this.schoolAddr=saddr;
		this.countStu = cntstu;
		this.countTeacher = cntteacher;
	}
	public String getSchoolAddr() {
		return schoolAddr;
	}
	public void setSchoolAddr(String schoolAddr) {
		this.schoolAddr = schoolAddr;
	}
	public int getCountStu() {
		return countStu;
	}
	public void setCountStu(int countStu) {
		this.countStu = countStu;
	}
	public int getCountTeacher() {
		return countTeacher;
	}
	public void setCountTeacher(int countTeacher) {
		this.countTeacher = countTeacher;
	}
	public static String getSchoolname() {
		return SCHOOLNAME;
	}
	
	public void writeData() {
		System.out.println("학교 주소: " + this.schoolAddr);
		System.out.println("학생 수: " + this.countStu);
		System.out.println("선생님 수: " + this.countTeacher);
	}
}
// 자식 클래스
class Student extends School { 
	
	private String stuName;
	private int grade;
	
	public Student() {
	
	}
	
	public Student(String sAddr, int cntStu, int cntTea, String stuname, int gra) {
		super(sAddr, cntStu, cntTea);
		this.stuName = stuname;
		this.grade = gra;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void writeData() {
		System.out.println("학교명: " + SCHOOLNAME);
		
		super.writeData();

	}

}

public class Inherit_07{

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.writeData();
		System.out.println();
		
		Student s2 = new Student("영등포구", 300, 35, "김숙", 2);
		s2.writeData();
		
		System.out.println();
		System.out.println("1번 째 학생 학생명과 학년 변경 후 출력");
		s1.setStuName("이영자");
		s1.setGrade(1);
		s1.writeData();

	}

}
