package sec04_인터페이스.EX08;

interface A {
	
	static void abc() {
		System.out.println("A 인터페이스의 정적메소드 acd()");
	}
}//interface


public class StaticMethod {

	public static void main(String[] args) {
		A.abc();
				
	}// main
	
}// end class
