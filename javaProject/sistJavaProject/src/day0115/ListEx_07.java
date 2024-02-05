package day0115;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListEx_07 {

	public static void main(String[] args) {
		/*
		 * 순차적으로 데이터가 들어감
		 * 중복 데이터 허용
		 * 처음 생성 시 일정한 갯수로 생성되는데 
		 * 그 이상의 데이터터를 넣으면 자동으로 공간이 늘어남
		 */
		
		//List<String> list = new Vector<String>();
		Vector<String> list = new Vector<String>();
		// 생성자가 디폴트인 경우 기본 할당 크기 10
		System.out.println("초기 데이터 갯수 " + list.size());
		System.out.println("초기 할당 크기 " + list.capacity());
		
		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");

		System.out.println("초기 데이터 갯수 " + list.size());
		System.out.println("초기 할당 크기 " + list.capacity());
		
		System.out.println("출력방법1)");
		for(int i = 0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("출력방법2)");
		for(String s: list) {
			System.out.print(s +" ");
		}
		System.out.println();
		
		System.out.println("출력방법3)");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+ " ");
		}
		System.out.println();
		
		System.out.println("출력방법4)");
		Object[] ob = list.toArray();
		for(int i = 0; i<ob.length; i++) {
			String s = (String)ob[i];
			System.out.print(s + "");
		}
		
	}

}
