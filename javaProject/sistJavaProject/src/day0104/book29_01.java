package day0104;

public class book29_01 {

	public static void main(String[] args) {
		
	/*int java = Integer.parseInt(args[0]);
	int jsp = Integer.parseInt(args[1]);
	int spring= Integer.parseInt(args[2]);
	
	int tot=java+jsp+spring;
	int count = 3;
	
	double avg1 = tot/count;
	double avg2 = (double)tot/count;
	
	System.out.println(avg1);
	System.out.printf("총점은 %d 평균은 %.2f",tot,avg1);
	*/

		
		
	String name = args[0];
	String city = args[1];
	int age = Integer.parseInt(args[2]);
	int java = Integer.parseInt(args[3]);
	int oracle = Integer.parseInt(args[4]);
	int tot = java + oracle;
	
	System.out.printf("학생명: %s 님\n", name);
	System.out.printf("지역: %s \n", city);
	System.out.printf("나이: %d세\n", age);
	
	System.out.printf("%s 님의 자바 점수는 %d점 오라클 점수는 %d점 총 %d점 입니다.",name, java, oracle, tot);
	
	
	
	
	
	
	
	
	}

}
