package sec07_람다익스프레션.EX05;

interface A {
	void abc();
}

class B {
	static void bcd() {
		System.out.println("B클래스 bcd()");
	}
}


public class RefOfStaticMethod {

	public static void main(String[] args) {
		//#. 정적 메소드 참조
		//#1. 익명이너클래스 방법
		A a1 = new A() {

			@Override
			public void abc() {
				B.bcd();
			}
		};
		
		//#2. 람다식 방법
		A a2 = () -> B.bcd();
		
		//#3. 정적 메소드 참조
		A a3 = B::bcd;
		
	}// main
	
}// end class




























