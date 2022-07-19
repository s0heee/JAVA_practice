package sec07_람다익스프레션.EX01;

interface A {
	void abc();
}

class B implements A {

	
	@Override
	public void abc() {
		System.out.println("B클래스 메소드 출력");
	}
	
}


public class OOPvsFP {
	
	public static void main(String[] args) {
		//#1. 객체지향 프로그래밍 문법 1 (case1)
		A a1 = new B();
		a1.abc();
		
		//#2. 객체지향 프로그래밍 문법 1 (case2) 익명구현 객체
		A a2 = new A() {

			@Override
			public void abc() {
				System.out.println("익명구현 객체 메소드");
			}	
		};
		a2.abc();
		
		//#3. 함수적 프로그래밍 문법 (람다식) c(ase3)
		A a3 = () -> {System.out.println("람다식 메소드");};
		a3.abc();
		
	}// main

}// end class





























