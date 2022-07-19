package sec09_파일InputStream과outputStream.EX01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStram_1 {

	public static void main(String[] args) throws IOException {
		//입력파일 생성(입력파일 경로 객체 생성)
		File inFile = new File("src/sec09_파일InputStream과outputStream/EX01/files/fileInputStream1.txt");
		
		//InputStream객체 생성
		InputStream is = new FileInputStream(inFile);
		
		int data;
		while((data = is.read()) !=-1) {	//-1이면 빠져나옴
			System.out.println("읽은 데이터: " + (char)data + ", 남은바이트수: " + is.available());
		}//while
		
		//InputStream 자원 반납
		is.close();
		
	}// main
	
}// end class
