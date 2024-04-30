package spring.di.ex5;

public class Emp {
	SawonInfo sawon;
	String empname;
	String emploc;
	
	public Emp(String empname) {
		this.empname = empname;
	}

	public SawonInfo getSawon() {
		return sawon;
	}

	public void setSawon(SawonInfo sawon) {
		this.sawon = sawon;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmploc() {
		return emploc;
	}

	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	
	public void writeEmp() {
		System.out.println("ȸ���: " + empname);
		System.out.println("ȸ����ġ: " + emploc);
		System.out.println("�����: " + sawon.getSawonname());
		System.out.println("�޿�: " + sawon.getPay());
		System.out.println("����: " + sawon.getPosition());
		System.out.println("�μ���: " + sawon.getBuseo());
	}
}
