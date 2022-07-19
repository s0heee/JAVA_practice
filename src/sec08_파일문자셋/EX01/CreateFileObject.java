package sec08_파일문자셋.EX01;

import java.io.File;
import java.io.IOException;

public class CreateFileObject {

	public static void main(String[] args) {
		
		//#1-1. 바탕화면에 temp폴더 생성(없는 경우)
		File tempDir = new File("C:/Users/s0h22/Desktop/temp");
		
		if(!tempDir.exists()) {	////그 위치에 이 파일이 존재하지 않는다면
			tempDir.mkdir();	//그 폴더를 만들어라			
		}// if
		
		System.out.println(tempDir.exists());	//그 위치에 이 파일이 있는지 확인(t/f)
		
		//#1-2 temp폴더 안에 파일을 생성
		File newFile = new File("C:/Users/s0h22/Desktop/temp/newFile.txt");
		if(!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}//try-catch
		}// if
		
		//#2. 파일 구분자
		File newFile2 = new File("C:\\Users\\s0h22\\Desktop\\temp\\newFile.txt");
		File newFile3 = new File("C:/Users/s0h22/Desktop/temp/newFile.txt");
		
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//#3-1 절대경로
		File newFile4 = new File("C:/abc/newFile.txt");
		File newFile5 = new File("C:/abc/bcd/newFile.txt");
		System.out.println(newFile4.getAbsolutePath());
		System.out.println(newFile5.getAbsolutePath());
		
		//3-2 상대경로
		//현재위치
		System.out.println(System.getProperty("user.dir"));	//현재작업폴더 위치
		File newFile6 = new File("newFile1.txt");
		File newFile7 = new File("bcd/newFile1.txt");
		System.out.println(newFile6.getAbsolutePath());
		System.out.println(newFile7.getAbsolutePath());
		
		
	}// main
	
}// end class



























