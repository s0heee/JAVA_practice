package sec04_인터페이스.EX03;
//접근지정자
interface A {
	
	public abstract void abc();
}// interface

interface B {
	
	void bcd();	//interface는 컴파일러가 자동으로 public 붙여줌
}// interface

class C implements A {
	
	@Override
	public void abc() {
		
	}
}// class

//class D implements B {
//	
//	@Override
//	void bcd() {	//상속받은 부모의 접근자보다 작아질 수 없음
//		
//	}
//}// class


public class inheritanceOfInterface_2 {

	public static void main(String[] args) {
		
	}// main
	
}// end class




















