package sec07_람다익스프레션.EX07;

interface A {
	int abc(String str);
}


public class RefOfInstanceMethod_Type2_2 {

	public static void main(String[] args) {
		//# 인스턴스 메소드 참조 type2
		//#1. 익명이너클래스
		A a1 = new A() {

			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		//#2. 람다식
		A a2 = s -> s.length();
		
		//#3. 인스턴스 메소드 참조 type2
		A a3 = String::length;
		
	}// main
	
}// end class
