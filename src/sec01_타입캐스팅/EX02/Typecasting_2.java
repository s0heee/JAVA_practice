package sec01_타입캐스팅.EX02;

class A {
	int m=3;
	
	void abc() {
		System.out.println("A 메소드");
	}//abc()
	
}// A class

class B extends A {
	int n = 4;
	
	void bcd() {
		System.out.println("B 메소드");
	}// bcd()
	
}// B class


public class Typecasting_2 {
	public static void main (String[] args) {
		//#1. A 타입 A 생성자
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();
		
		//#2. B 타입 B 생성자
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();
		
		//#3. A타입 B 생성자
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();
		
		
	}//main
	
}// end class
