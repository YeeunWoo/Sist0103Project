package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWriter_04 {
	
	Scanner sc;
	FileWriter fw;
	static final String FILENAME = "C:\\sist0103\\file\\member.txt";
	
	public FWriter_04() {
		sc = new Scanner(System.in);
	}
	
	public void dataWrite() {
		try {
			fw = new FileWriter(FILENAME, true);
			
			// 키보드로 이름, 주소, 핸드폰번호 입력 후 파일에 저장
			System.out.print("이름 입력: ");
			String name = sc.nextLine();	
			System.out.print("주소 입력: ");
			String addr = sc.nextLine();
			System.out.print("핸드폰번호 입력: ");
			String hp = sc.nextLine();
			
			System.out.println("파일 저장 완료!");
			
			// 파일에 저장
			fw.write("회원명: " + name + "\n");
			fw.write("주소: " + addr + "\n");
			fw.write("핸드폰번호: " + hp + "\n---------------------------\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		FWriter_04 f = new FWriter_04();
		f.dataWrite();
		
	}

}
