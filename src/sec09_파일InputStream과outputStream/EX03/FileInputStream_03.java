package sec09_파일InputStream과outputStream.EX03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream_03 {

	public static void main(String[] args) throws IOException {
		//입력파일 생성
		File inFile = new File("src/sec09_파일InputStream과outputStream/EX01/files/fileInputStream2.txt");
		
		//#2. n-byte 단위 읽기(byte[]의 처음 위치에서 부터 읽은 데이터 저장)
		InputStream is2 = new FileInputStream(inFile);
		
		byte[] byteArr1 = new byte[9];	//최대 9개씩 읽을 수 있다는 이야기
		int count1;
		while((count1 = is2.read(byteArr1)) != -1) {
			String str = new String(byteArr1, 0, count1, Charset.forName("UTF-8"));
			System.out.print(str);
			System.out.println(" :count1 = " + count1);
		}// while
		System.out.println("\n");
		
		//#3. n-byte 단위 읽기(length만큼 앞에서부터 읽어와서 byte[] offset위치부터 넣어라)
		InputStream is3 = new FileInputStream(inFile);
		
		byte[] byteArr2 = new byte[9];	//최소 offset + length
		int offset = 3;		//3번째 인덱스부터(4번째자리) 
		int length = 6;		//6개 읽기
		int count2 = is3.read(byteArr2, offset, length);
		String str = new String(byteArr2, offset, count2, Charset.forName("utf-8"));
		System.out.print(str);
		
		is2.close();
		is3.close();
	}// main
	
}// end class





























