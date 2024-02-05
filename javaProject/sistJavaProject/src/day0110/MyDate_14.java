package day0110;

class MyDate{
	private int year;
	private int month;
	private int day;

	// 디폴트 생성자
	public MyDate() {

	}

	// 명시적 생성자_ 생성과 동시에 초기화 가능
	public MyDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	// setter
	public void setYear(int y) {
		year = y;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setDay(int d) {
		day = d;
	}

	// getter
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
}

public class MyDate_14 {

	public static void main(String[] args) {

		MyDate m1 = new MyDate(2024, 01, 10);
		
		int year = m1.getYear();
		int month = m1.getMonth();
		int day = m1.getDay();
		
		System.out.printf("%d-%d-%d\n", year, month, day);
		
		MyDate m2 = new MyDate();
		m2.setYear(2022);
		m2.setMonth(6);
		m2.setDay(3);
		
		int y = m2.getYear();
		int m = m2.getMonth();
		int d = m2.getDay();
		System.out.printf("%d년 %d월 %d일", y, m, d);

	}

}
