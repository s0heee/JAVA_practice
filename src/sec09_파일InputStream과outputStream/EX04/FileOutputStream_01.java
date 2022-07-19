package sec09_파일InputStream과outputStream.EX04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStream_01 {
	
	public static void main(String[] args) throws IOException {
		
		File outFile = new File("src/sec09_파일InputStream과outputStream/EX01/files/fileOutputStream1.txt");
		
		//#1. 1-byte 단위 쓰기
		OutputStream os1 = new FileOutputStream(outFile);
		
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.write('\r');	//13 엔터(생략가능)
		os1.write('\n');	//10 엔터
		
		os1.flush();
		os1.close();
		
		
		//#2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터를 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArr1 = "Hello!".getBytes();
		
		os2.write(byteArr1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		
		//#3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte데이터를 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArr2 = "Better the last smile than the first laughter".getBytes();
		
		os3.write(byteArr2, 7, 8);
		os3.write('\n');
		
		os3.flush();
		os3.close();
		
	}//main
	
}// end class






























