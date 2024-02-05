package day0112;

class Car { 
	
	private String carCompany; // 제조 회사
	private String carkind; // 종류
	
	// 디폴트 생성자
	public Car() {
		
	}
	
	// 명시적 생성자
	public Car(String company, String kind) {
		this.carCompany = company;
		this.carkind = kind;
	}
	
	public String getCarCompany() {
		return carCompany;
	}

	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	public String getCarkind() {
		return carkind;
	}

	public void setCarkind(String carkind) {
		this.carkind = carkind;
	}

	public void writeCar() {
		System.out.println("회사명: " + carCompany);
		System.out.println("종류: " + carkind);
	}
	
}

class MyCar extends Car{
	public MyCar(String company, String kind, String name, String color, int price) {
		super(company, kind);
		this.carName = name;
		this.carColor = color;
		this.carPrice = price;
	}
	private String carName;
	private String carColor;
	private int carPrice;
	

	@Override
	public void writeCar() {
		super.writeCar();
		System.out.println("자동차명: " + carName);
		System.out.println("색상: " + carColor);
		System.out.println("가격: " + carPrice + "원");
	}
}

public class Inherit_08 {

	public static void main(String[] args) {
		
		MyCar m1 = new MyCar("현대", "전기차", "아이오닉5","블랙", 35000000);

		m1.writeCar();
		
		Car c2 = new Car();
		c2.writeCar();

	}

}
