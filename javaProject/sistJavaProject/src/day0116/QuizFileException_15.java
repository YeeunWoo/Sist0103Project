package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizFileException_15 {
	
	public static void fruitShop(){
		
		String fileName = "C:\\sist0103\\file\\fruitShop.txt";
		BufferedReader br = null; // 메소드에서는 자동 초기화 안 되기 때문에 null 붙이기
		FileReader fr = null;
		int cnt=0, su, dan, total;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			System.out.println("**과일입고목록**");
			System.out.println("번호\t과일명\t수량\t단가\t총금액");
			System.out.println("---------------------------------------");
			
			while(true) {
				String data = br.readLine();
				
				if(data==null)
					break;
				
				cnt++;	
				
				//String[] s = data.split(",");
				//su = Integer.parseInt(s[1]);
				//dan = Integer.parseInt(s[2]);
				//total = su * dan;
				
				//System.out.println(cnt+"\t"+s[0]+"\t"+su+"\t" +dan+"\t" + total + "원");
				
				StringTokenizer st = new StringTokenizer(data,",");
				String fruitName = st.nextToken();
				su = Integer.parseInt(st.nextToken());
				dan = Integer.parseInt(st.nextToken());
				total = su * dan;

				System.out.println(cnt + "\t" + fruitName + "\t" + su + "\t" + dan + "\t" + total + "원");
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		fruitShop();
		
	}

}
