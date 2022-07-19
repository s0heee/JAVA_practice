package sec02_메소드오버라이딩.EX03;

class A {
	
	void print1() {
		System.out.println("A클래스 print1");
	}
	
	void print2() {
		System.out.println("A클래스 print2");
	}
}// class

class B extends A {
	
	@Override
	void print1() {
		System.out.println("B클래스 print1");
	}
	
	void print2(int a) {	//오버로딩이 된 것임
		System.out.println("B클래스 print2");
	}
}//class


public class MethodOverriding_3 {
	public static void main(String[] args) {
		//#1. A타입선언 = A 생성자
		A a = new A();
		a.print1();
		a.print2();
		System.out.println();
		
		//#2. B타입 선언 = B 생성자
		B b = new B();
		b.print1();
		b.print2();
		b.print2(1);
		System.out.println();
		
		//#3. A타입 선언 = B 생성자
		A ab = new B();
		ab.print1();	//오버라이딩 된 B클래스의 print1나옴
		ab.print2();	//A의 print2가 나옴
		
	}// main
}// end class



























