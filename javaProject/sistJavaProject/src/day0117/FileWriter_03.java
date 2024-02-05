package day0117;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_03 {
	
	public static void fileWrite() {
		
		FileWriter fw = null;
		String fileName = "C:\\sist0103\\file\\test1.txt";
		
		try {
			fw = new FileWriter(fileName); // 파일 새로 생성(같은 이름이 있어도 새로 생성)
			fw.write("좋은 아침~~\n"); // 파일에 내용 추가
			fw.write(new Date().toString() + "\n");
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
	
	public static void fileWrite2() {
		
		FileWriter fw = null;
		String fileName = "C:\\sist0103\\file\\test1.txt";
		
		try {
			fw = new FileWriter(fileName, true); // true -> 추가모드
			fw.write("내 이름은 우예은\n");
			fw.write("--------\n");
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

		fileWrite();
		fileWrite2();
		
	}

}
