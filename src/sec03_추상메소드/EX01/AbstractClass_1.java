package sec03_추상메소드.EX01;

//추상클래스의 객체 생성 방법 #1(자식클래스 생성 + 자식클래스 생성자를 가지고 객체 생성)

abstract class A {
	
	abstract void abc();
}// class

class B extends A {
	
	@Override
	void abc() {
		System.out.println("방법#1. 자식클래스 생성 및 추상메소드 구현");
	}
}// class

public class AbstractClass_1 {
	
	public static void main(String[] args) {
		//#1. 객체 생성
//		A a1 = new A();		//추상메소드는 객체 생성 불가능
		A a2 = new B();		//구현클래스로 생성해야 함
		
		//#2. 메소드 호출
		a2.abc();
		
	}// main

}// end class
