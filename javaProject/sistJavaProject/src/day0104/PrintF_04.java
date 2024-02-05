package day0104;

import java.util.Calendar;

public class PrintF_04 {

	public static void main(String[] args) {
		
		/*Calendar cal = Calendar.getInstance();
		
		System.out.println("지금은 "+ cal.get(cal.YEAR)+"년도 입니다." );
		System.out.println("지금은 "+ (cal.get(cal.MONTH)+1)+"월 입니다." );
		System.out.println("지금은 "+ cal.get(cal.DATE)+"일 입니다." );
		System.out.println("지금은 "+ cal.get(cal.DAY_OF_MONTH)+"일 입니다." );
		System.out.println("지금은 "+ cal.get(cal.HOUR_OF_DAY)+"시"+ cal.get(cal.MINUTE)+ "분 입니다." );

		int age = cal.get(cal.YEAR)-2001;
		System.out.println(age);*/
		
		Calendar calendar = Calendar.getInstance();
		
		String name = args[0];
		
		int curYear=calendar.get(calendar.YEAR);
		int myYear=Integer.parseInt(args[1]);
		int myAge=curYear-myYear;
		
		System.out.println("이름: "+name);
		System.out.println("태어난 년도: "+myYear+"년생");
		System.out.println("나이: "+myAge);

		
	}

}
