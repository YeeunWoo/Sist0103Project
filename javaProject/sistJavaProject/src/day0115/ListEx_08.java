package day0115;

import java.util.List;
import java.util.Vector;

public class ListEx_08 {

	public static void write(String title, List<String> list) {
		System.out.println(title);
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i + ": " + list.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Vector, ArrayList_순차, 중복데이터
		 * 메서드
		 * get(index)_리스트 내의 지정된 위치값 요소를 돌려준다.
		 * toArray()_리스트 내의 모든 요소를 순서대로 포함하고 배열에 넣어준다.(반환형: Object[])
		 * isEmpty()_Vector가 비었는지 아닌지(반환형: boolean)
		 */

		String[] data = {"햄버거", "피자", "파스타"};
		
		// 배열의 데이터를 리스트에 넣기
		
		List<String> list = new Vector<String>();
		
		for(String s: data)
			list.add(s);
		
		write("초기배열데이터", list);
		
		System.out.println("1번 인덱스 삭제");
		list.remove(1);
		write("삭제 후 결과", list);
		
		System.out.println("리코타 샐러드 추가");
		list.add("리코타 샐러드");
		write("추가 후 데이터", list);
		
		System.out.println("1번 인덱스 파스타를 스파게티로 변경");
		list.set(1, "스파게티");
		write("수정 후 데이터", list);
		
		System.out.println("전체 삭제");
		list.clear();
		System.out.println("삭제 후 사이즈: " + list.size());
	}

}
