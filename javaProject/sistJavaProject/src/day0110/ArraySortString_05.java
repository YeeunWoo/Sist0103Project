package day0110;

public class ArraySortString_05 {

	public static void main(String[] args) {
		
		String[] data = {"이승민", "홍수아", "김민선", "강호동", "전지현", "송혜교", "이효리"};
		
		System.out.println("** 정렬 전 출력 **");
		for(String str: data) {
			System.out.print(str+" ");
		}

		System.out.println();
		System.out.println("** 오름차순 출력 **");
		
		// System.out.println("a".compareTo("b"));
		// 같으면 0, i>j 양수, i<j 음수
		
		for(int i = 0; i<data.length-1; i++) {
			for(int j = i+1; j<data.length; j++) {
				if(data[i].compareTo(data[j])>0) {
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for(String str: data) {
			System.out.print(str+" ");
		}

	}

}
