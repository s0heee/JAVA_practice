package sec04_인터페이스.EX04;

//#방법1. 자식클래스생성자로 객체 생성
interface A {
	
	public static final int a = 3;
	
	abstract void abc();
}// interface 

class B implements A {
	
	@Override
	public void abc() {
		System.out.println("방법#1. 자식클래스생성자로 객체 생성");
		
	}// abc()
}// class


public class CreateObjectOfInterface_1 {
	
	public static void main(String[] args) {
//		#1. 객체생성
//		A a1 = new A();	불가능
		A a2 = new B();
		
		//#2. 메소드호출
		a2.abc();
	}// main
	
}// end class




















