package sec04_인터페이스.EX01;

interface A {
	//상수필드만 갖음
	public static final int a = 3;
	
	//추상메소드
	public abstract void abc();
	
}// interface

interface B {
	//생략시 컴파일러가 자동으로 public static final을 붙임
	int b = 3;
	
	//생략시 컴파일러가 자동으로 public abstract을 붙임
	void bcd();
}// interface


public class interfaceCharacteristics {

	public static void main(String[] args) {
		//#1. static 자동추가 체크
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. final 자동추가 체크
//		A.a = 1;	//final로 선언되어 변경 오류
//		B.b = 2;	//final로 선언되어 변경 오류
		
	}// main
	
}// end class

























