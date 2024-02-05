package day0117;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * 사원, 기본급, 가족 수, 초과 근무 시간
 * 가족수 * 30000
 * 초과 근무 시간 8 20000
 */

public class FileReadSawon_02 {

	public static void fileReadSawon() {
		String fileName = "C:\\sist0103\\file\\sawon.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		int num = 1;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("\t\t\t\t[사원급여]");
			
			System.out.println("번호\t사원명\t기본급\t가족수\t초과근무시간\t가족수당\t시간수당\t총급여합계");
			System.out.println("---------------------------------------------------------");
			
			while(true ){
				String s = br. readLine();
				
				if (s == null)
					break;
				
				StringTokenizer st = new StringTokenizer(s,",");
				String name = st.nextToken();
				int gibon = Integer.parseInt(st.nextToken().trim());
				int famsu = Integer.parseInt(st.nextToken().trim());
				int timesu = Integer.parseInt(st.nextToken().trim());
				
				int famsudang = famsu * 30000;
				int timesudang = timesu*20000;
				int totalPay = gibon + famsudang + timesudang;
				
				System.out.println(num++ +"\t" +name + "\t" + gibon+"원\t" + famsu 
						+ "\t" + timesu + famsudang + "\t" + timesudang + "\t" + totalPay);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		fileReadSawon();
		
	}

}
