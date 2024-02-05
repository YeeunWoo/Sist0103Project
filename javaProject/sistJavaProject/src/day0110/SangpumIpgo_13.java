package day0110;

class Ipgo{
	
	private String sangName;
	private int price;
	
	// set 메서드
	public void setSangName(String name) {
		sangName = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// get 메서드
	public String getSangName() {
		return sangName;
	}
	
	public int getPrice() {
		return price;
	}
}

public class SangpumIpgo_13 {

	public static void main(String[] args) {
		
		Ipgo i1 = new Ipgo();
		Ipgo i2 = new Ipgo();
		
		i1.setSangName("사과");
		i1.setPrice(2500);
		i2.setSangName("포도");
		i2.setPrice(5500);
		
		String name2 = i2.getSangName();
		int price2 = i2.getPrice();
		String name1 = i1.getSangName();
		int price1 = i1.getPrice();
		
		System.out.println(name1+", " + price1);
		System.out.println(name2+", " + price2);

	}

}
