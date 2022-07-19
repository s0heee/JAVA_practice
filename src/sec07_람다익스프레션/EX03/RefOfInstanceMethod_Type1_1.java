package sec07_람다익스프레션.EX03;

interface A {
	void abc();
}

class B {
	
	void bcd() {
		System.out.println("B클래스 메소드");
	}
}


//인스턴스 메소드 참조
public class RefOfInstanceMethod_Type1_1 {
	
	public static void main(String[] args) {
		//#1. 인스턴스 메소드 참조 type1 익명이너클래스
		A a1 = new A() {

			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		a1.abc();
		//#2. 람다식
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		a2.abc();
		
		//#3. 인스턴스 참조 Type1의 표현
		B b = new B();
		A a3 = b::bcd;	//b객체의 bcd메소드를 호출해라
		a3.abc();
		
		
	}// maain

}// end class



























