package sec02_메소드오버라이딩.EX01;

class A{
	
	void print() {
		System.out.println("A클래스 print 메소드");
	}
	
}// class

class B extends A{
	
	@Override
	void print() {
		System.out.println("B클래스 print 메소드");
	}
	
}//class


public class MethodOverriding_1 {
	
	public static void main(String[] args) {
		//#1. A타입 A 생성자
		A a = new A();
		a.print();
		
		//#2. B타입 B생성자
		B b = new B();
		b.print();
		
		//#3. A타입 B생성자
		A ab = new B();
		ab.print();	//생성자 기준으로 나옴
	}//main
	
}//end class
