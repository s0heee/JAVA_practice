package sec07_람다익스프레션.EX09;

import lombok.ToString;

interface A {
	B abc();
}

@ToString
class B {
	B () {
		System.out.println("첫번째 생성자");
	}
	B(int k){
		System.out.println("두번째 생성자");
	}
}


public class RefOfClassConstructor_1 {

	public static void main(String[] args) {
		
		//클래스 생성자 참조
		//#1. 익명이너클래스
		A a1 = new A () {

			@Override
			public B abc() {
				return new B();
			}
		};
		a1.abc();
		
		//#2. 람다식
		A a2 = () -> new B(1);
		a2.abc();
		
		//#3. 클래스 생성자 참조
		A a3 = B::new;
		a3.abc();
		
	}// main
	
}// end class



























