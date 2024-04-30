package spring.di.ex5;

import java.util.List;

public class SawonInfo {
	private String sawonname;
	private List<String> buseo;
	private int pay;
	private String position;
	
	public SawonInfo(String name, String position) {
		this.sawonname = name;
		this.position = position;
	}

	public String getSawonname() {
		return sawonname;
	}

	public void setSawonname(String sawonname) {
		this.sawonname = sawonname;
	}

	public List<String> getBuseo() {
		return buseo;
	}

	public void setBuseo(List<String> buseo) {
		this.buseo = buseo;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
