package day0112;

import day0112_1.Sawon_05;

public class My extends Sawon_05{
	
	int age;
	
	public My(String name, String buseo, int age) {
		this.name = name;
		this.buseo = buseo;
		this.age = age;
	}
	
	public void writeMy() {
		System.out.println("사원명: " + this.name);
		System.out.println("부서: " + this.buseo);
		System.out.println("나이: " + this.age);
	}

}
