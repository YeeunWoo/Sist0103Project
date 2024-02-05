package day0116;

abstract class AbEx{
	abstract public void dataAdd();
	abstract public void dataList();
}

public class Anonymous_08 {

	AbEx ab1 = new AbEx() {
		
		@Override
		public void dataList() {
			System.out.println("데이터 출력");
		}
		
		@Override
		public void dataAdd() {
			System.out.println("데이터 추가");
			
		}
	};
	
	public static void main(String[] args) {
		
		Anonymous_08 anony = new Anonymous_08();
		anony.ab1.dataAdd();
		anony.ab1.dataList();
		
	}

}
