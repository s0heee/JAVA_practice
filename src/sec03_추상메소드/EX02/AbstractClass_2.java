package sec03_추상메소드.EX02;

//추상클래스의 객체 생성 방법 #2(익명구현객체로 생성)

abstract class A {

	abstract void abc();
}// class

public class AbstractClass_2 {

	public static void main(String[] args) {
		
		//#1. 객체 생성
		A a1 = new A() {
			@Override
			void abc() {
				System.out.println("방법#2. 익명구현객체로 생성");
			}// abc
		};// 객체 생성		
		
		//#2. 메소드 호출
		a1.abc();
		
	}// main
}// end class
