package sec09_파일InputStream과outputStream.EX05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class FileOutputStream_02 {

	public static void main(String[] args) throws IOException {
		
		File outFile = new File("src/sec09_파일InputStream과outputStream/EX01/files/fileOutputStream2.txt");
		
		//#2. n-byte 단위 쓰기(byte[]의 처음부터 끝까지 데이터를 쓰기)
		OutputStream os2 = new FileOutputStream(outFile, true);
		byte[] byteArr1 = "안녕하세요!".getBytes(Charset.forName("utf-8"));
		
		os2.write(byteArr1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		
		//#3. n-byte 단위 쓰기(byte[]의 offset부터 length개의 byte데이터를 쓰기)
		OutputStream os3 = new FileOutputStream(outFile, true);
		byte[] byteArr2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		
		os3.write(byteArr2, 6, 6);
		os3.write('\n');
		
		os3.flush();
		os3.close();
		
	}//main
	
}// end class
