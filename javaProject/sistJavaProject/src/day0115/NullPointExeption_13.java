package day0115;

import java.sql.Date;

public class NullPointExeption_13 {

	Date date; 
	public void write() {
		int y, m, d;
		try {
			y = date.getYear()-1900;
			m = date.getMonth()+1;
			d = date.getDate();
			System.out.println(y + m + d);
		} catch (NullPointerException e) {
			
		
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
