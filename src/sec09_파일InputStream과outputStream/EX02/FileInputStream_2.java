package sec09_파일InputStream과outputStream.EX02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_2 {

	public static void main(String[] args) throws IOException {
		//입력파일 생성(입력파일 경로 객체 생성)
		File inFile = new File("src/sec09_파일InputStream과outputStream/EX01/files/fileInputStream1.txt");
		
		//#1. 1-byte 단위 읽기
		InputStream is1 = new FileInputStream(inFile);
		
		int data;
		while((data = is1.read()) !=-1) {	//-1이면 빠져나옴
			System.out.print((char)data);
		}//while
		System.out.println("\n");
		
		//#2. n-byte 단위 읽기(byte[]의 처음 위치에서 부터 읽은 데이터 저장)
		InputStream is2 = new FileInputStream(inFile);
		
		byte[] byteArr1 = new byte[9];	//최대 9개씩 읽을 수 있다는 이야기
		int count1;
		while((count1 = is2.read(byteArr1)) != -1) {
			for(int i=0; i<count1; i++) {
				System.out.print((char)byteArr1[i]);
			}// for
			System.out.println(" : count1 = " + count1);
		}// while
		System.out.println("\n");
		
		//#3. n-byte 단위 읽기(length만큼 앞에서부터 읽어와서 byte[] offset위치부터 넣어라)
		InputStream is3 = new FileInputStream(inFile);
		
		byte[] byteArr2 = new byte[9];	//최소 offset + length
		int offset = 3;		//3번째 인덱스부터(4번째자리) 
		int length = 6;		//6개 읽기
		int count2 = is3.read(byteArr2, offset, length);
	
		for(int i=0; i<offset+count2; i++) {
			System.out.print((char)byteArr2[i]);
		}// for
		
		is1.close();
		is2.close();
		is3.close();
	}// main
	
}// end class































