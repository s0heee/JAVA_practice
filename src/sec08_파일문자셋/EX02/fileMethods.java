package sec08_파일문자셋.EX02;

import java.io.File;

public class fileMethods {

	public static void main(String[] args) {
		//#1. 파일객체 생성
		File file = new File("C:/Windows");
		
		//#2. 파일메소드
		System.out.println("절대경로: " + file.getAbsolutePath());
		System.out.println("폴더인가?: " + file.isDirectory());
		System.out.println("파일인가?: " + file.isFile());
		System.out.println("최종경로이름: " + file.getName());	//최종적으로 가리키는 경로 이름(Windows)
		System.out.println("부모경로: " + file.getParent()); // (C:\)
		
		File newfile1 = new File("C:/Users/s0h22/Desktop/temp/abc");
		System.out.println(newfile1.mkdir());
		
		File newfile2 = new File("C:/Users/s0h22/Desktop/temp/bcd/cde");
		System.out.println(newfile2.mkdirs());	//이 경로에 필요한 폴더들 다 생성 mkdir"s"
		
		File[] fnames = file.listFiles();	//file변수(C:/Windows)의 모든 파일들의 이름을 배열에 저장
		for(File f : fnames) {
			System.out.println((f.isDirectory() ? "폴더: " : "파일: ") + f.getName());
		}// for enhanced
		
	}// main
	
}// end class






























