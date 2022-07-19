package sec07_람다익스프레션.EX06;

interface A {
	void abc(B b, int k);
}

class B {
	void bcd(int k) {
		System.out.println(k);
	}
}


public class RefOfInstanceMethod_Type2_1 {

	public static void main(String[] args) {
		//#인스턴스 메소드 참조 type2
		//#1. 익명이너클래스
		A a1 = new A() {

			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		//#2. 람다식
		A a2 = (b, k) -> b.bcd(k);
		
		//#3. 인스턴스 메소드 참조 Type2
		A a3 = B::bcd;
				
	}// main
	
}// end class





























