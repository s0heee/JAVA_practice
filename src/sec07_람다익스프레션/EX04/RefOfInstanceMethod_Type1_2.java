package sec07_람다익스프레션.EX04;

interface A {
	void abc(int k);
}


public class RefOfInstanceMethod_Type1_2 {

	public static void main(String[] args) {
		//#1. 인스턴스 메소드 참조 type1 익명이너클래스
		A a1 = new A() {

			@Override
			public void abc(int k) {
				System.out.println(k);
			}
		};
		
		//#2. 람다식 줄인 표현
		A a2 = k -> System.out.println(k);
		
		//#3. 인스턴스 참조 Type1의 표현
		A a3 = System.out::println;
				
	}// end class
	
}// end class




























