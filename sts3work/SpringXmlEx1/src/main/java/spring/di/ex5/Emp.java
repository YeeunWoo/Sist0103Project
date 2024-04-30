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
		System.out.println("회사명: " + empname);
		System.out.println("회사위치: " + emploc);
		System.out.println("사원명: " + sawon.getSawonname());
		System.out.println("급여: " + sawon.getPay());
		System.out.println("직급: " + sawon.getPosition());
		System.out.println("부서명: " + sawon.getBuseo());
	}
}
