package sec04_인터페이스.EX07;

interface A {
	
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}// interface

class B implements A {
	
	@Override
	public void abc() {
//		super.abc();	//부모클래스의 abc()메소드 호출(부모클래스는 없으니 오류)
		A.super.abc();	//부모인터페이스의 메소드 호출
		System.out.println("B 클래스의 abc()");
	}
}// class


public class defaultMethod_2 {

	public static void main(String[] args) {
		//#1. 객체생성
		A a = new B();		
		
		//#2. 메소드 호출
		a.abc();	//B클래스에서 abc를 오버라이딩하여 B클래스의 메소드가 호출
	}//main
	
}//end class