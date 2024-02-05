package day0110;

class Info{
	
	private String stuName;
	private int stuAge;
	
	
	/*
	 * setter 메서드
	 * 1. 데이터를 수정할 목적 - set변수명
	 * 2. 저장용도이므로 결과값 return값이 없다.
	 * 3. 리턴값이 없으므로 void라고 지정해야 한다.
	 * public void setName(String name) {
	*/
	
	public void setName(String name) {
		stuName = name; // 이름이 다를 경우엔 this 생략 가능
	}
	
	public void setAge(int stuAge) {
		this.stuAge = stuAge;
	}
	
	/*
	 * getter 메소드
	 * 1. 데이터를 조회할 목적_get변수명
	 * 2. 데이터를 얻는 목적이므로 인자값이 없다
	 * 3. 실행결과값을 돌려주므로 'return결과값' 으로 지정
	 */
	
	public String getName() {
		return stuName;
	}
	
	public int getAge() {
		return stuAge;
	}
}

public class WorkerMethod_12 {

	public static void main(String[] args) {
		
		Info in1 = new Info();
		
		// 인스턴스 변수에 private이 붙으면 변수 접근이 안됨(생성을 하더라도)
		// in1.stuName = "홍길동";
		// in1.stuAge = 33;
		
		// setter메서드 이용해서 값 수정
		in1.setName("최민영");
		in1.setAge(22);
		
		// getter메서드 이용해서 값 얻기
		String name = in1.getName();
		int age = in1.getAge();
		
		System.out.println(name+", " + age);
		
	}

}
