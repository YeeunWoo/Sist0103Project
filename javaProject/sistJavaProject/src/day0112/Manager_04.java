package day0112;

public class Manager_04 extends Employee_04{

	String depart;
	
	public Manager_04(String name, int sal, String d) {
		super(name, sal);
		depart = d; // 부서 초기화
	}
	
	@Override
	public String getEmployee() {
		return super.getEmployee()+", " + depart;
	}
}
