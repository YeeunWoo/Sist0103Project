package day0115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * HashSet: 순서를 유지하지 않는 데이터 집합(중복 허용X)
 * 구현클래스, 인덱스 없음
 * Set 인터페이스를 구현하려면 HashSet
 * <E> 제네릭: 타입을 명시하면 그 이외 타입을 넣었을 때 오류
 */

public class HashSet_04 {

	public static void main(String[] args) {
		// 컬렉션은 가변적이므로 배열의 고정형을 보완해준다.
		
		Set<String> set1 = new HashSet<String>();
		// set1 안에 String만을 담겠다. Set은 인터페이스 이므로 생성X
		// 그걸 구현한 클래스인 HashSet을 생성
		
		set1.add("사과");
		set1.add("오렌지");
		set1.add("배");
		set1.add("사과"); // 갯수 포함 안 됨
		
		System.out.println("데이터 갯수: " + set1.size());
		
		System.out.println("출력_#1");
		for(String s: set1)
			System.out.println(s);
		
		System.out.println("출력_#2");
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()) { // 데이터가 더 이상 없으면 false
			String s = iter.next();
			System.out.println(s); // 다음으로 이동함과 동시에 데이터 반환
		}	
		
		System.out.println("출력_#3");
		Object[] ob = set1.toArray();
		
		for(int i = 0; i<ob.length; i++) {
			System.out.println(ob[i]);
		}
		
		// 모든 데이터 삭제
		set1.clear();
		
		// 확인
		if(set1.isEmpty())
			System.out.println("Set타입 안에 데이터가 없음");
		else
			System.out.println("Set타입 안에 데이터가 있음");
		
	}

}
