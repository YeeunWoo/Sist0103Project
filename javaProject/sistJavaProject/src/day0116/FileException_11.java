package day0116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// BufferReader: 버퍼를 사용해서 파일 읽기
// FileReadr: 경로에 있는 파일 로드. 반드시 Exception() 발생

public class FileException_11 {

	public static void read() {
		
		String fileName= "C:\\sist0103\\file\\memo.txt";
		BufferedReader br =null;
		FileReader fr = null;
		
		//읽기 위해서 파일열기
		try {
			fr = new FileReader(fileName);
			System.out.println("파일을 열었음");
			br = new BufferedReader(fr);
			
			// 여러 줄을 읽어야 하므로 while
			while(true) {
				
				String s =br.readLine();
				
				// 마지막 줄 일 경우 null값을 읽는다. 
				if(s==null)
					break;
				
				System.out.println(s);
				
			}
			
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("파일이 없어요: " + e.getMessage());
		} catch (IOException e) {
			
		} finally {
			try {
				br.close(); // 생성한 반대순으로 닫아줌
				fr.close();
				
				System.out.println("파일에 대한 자원을 모두 닫았음");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {

		read();
		
		System.out.println("정상종료");
	}

}
