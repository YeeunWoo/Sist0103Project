package day0111;

class Artist {
	
	// 변수명
	String g_Name;
	String p_Song;
	
	static String agency;
	static int cnt = 0;
	
	// 명시적 생성자
	public Artist(String name, String song) {
		this.g_Name = name;
		this.p_Song = song;
	}
	
	// 출력 메서드 한 번에 만들기
	public void writeData() {
		cnt++;
		System.out.println("**아티스트 정보_"+cnt+"**");
		System.out.println("소속기획사: " + Artist.agency);
		System.out.println("그룹명: " + this.g_Name);
		System.out.println("대표곡: " + this.p_Song);
		System.out.println("---------------------------");
	}
}
public class QuizInstance_06 {

	public static void main(String[] args) {
		
		Artist a1 = new Artist("bts", "버터");
		Artist a2 = new Artist("뉴진스", "어텐션");
	
		Artist.agency = "하이브";
		
		a1.writeData();
	}
}
