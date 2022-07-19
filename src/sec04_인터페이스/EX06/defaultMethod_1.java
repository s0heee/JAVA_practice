package sec04_인터페이스.EX06;

interface A {
	
	public abstract void abc();		//2020년 생성
	
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	}		//2030년 생성
	
}//interface

class B implements A {		//2020년 생성
	
	@Override
	public void abc() {
		System.out.println("B클래스의 abc()");
	}
}// class

class C implements A {
	
	@Override
	public void abc() {
		System.out.println("C클래스의 abc()");
	}
	
	@Override
	public void bcd() {
		System.out.println("C클래스의 bcd()");
	}
	
}// class


public class defaultMethod_1 {
	
	public static void main(String[] args) {
		A a1 = new B();
		a1.abc();
		a1.bcd();
		System.out.println();
		
		A a2 = new C();
		a2.abc();
		a2.bcd();
	}// main

}// end class
