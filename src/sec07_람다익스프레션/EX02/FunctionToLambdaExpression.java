package sec07_람다익스프레션.EX02;

interface A { //입력x 리턴x
	void method1();
}

interface B { //입력o 리턴x
	void method2(int a);
}

interface C { //입력x 리턴o
	int method3();
}

interface D { //입력o 리턴o
	double method4(int a, double b);
}


public class FunctionToLambdaExpression {

	public static void main(String[] args) {
		//인터페이스의 함수 구현 --> 람다식
		//#1. 입력x 리턴x
		//@1-1 익명이너클래스 방식
		A a1 = new A() {

			@Override
			public void method1() {
				System.out.println("입력x 출력x 익명이너클래스");
			}
		};
		a1.method1();
		//@1-2 람다식 방식
		A a2 = () -> System.out.println("입력x 출력x 람다식 \n");
		a2.method1();
		
		//2. 입력o 리턴x
		//@2-1 익명이너클래스 방식
		B b1 = new B() {

			@Override
			public void method2(int a) {
				System.out.println("입력o 출력x 익명이너클래스");
			}
		};
		b1.method2(0);
		//@2-2 람다식 방식
		B b2 = a -> System.out.println("입력o 출력x 람다식 \n");
		b2.method2(0);
		
		//3. 입력x 리턴o
		//@3-1 익명이너클래스 방식
		C c1 = new C() {

			@Override
			public int method3() {
				return 1;
			}
		};
		System.out.println(c1.method3());
		//@3-2 람다식 방식
//		C c2 = () -> {return 2;};
		C c2 = () -> 2;
		System.out.println(c2.method3() + "\n");
		
		//4. 입력o 리턴o
		//@4-1 익명이너클래스 방식
		D d1 = new D() {

			@Override
			public double method4(int a, double b) {
				return a+b;
			}
		};
		System.out.println(d1.method4(1, 1.0));
		//@4-2 람다식 방식
//		D d2 = (a, b) -> {return a+b;};
		D d2 = (a, b) -> a+b;
		System.out.println(d2.method4(2, 2.0));
		
		
	}// main
	
}// end class




























