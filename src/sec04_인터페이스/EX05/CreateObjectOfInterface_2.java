package sec04_인터페이스.EX05;

//#방법2. 익명구현객체로 생성
interface A {
	
	public static final int a = 3;
	
	public abstract void abc();
}// interface 


public class CreateObjectOfInterface_2 {

	public static void main(String[] args) {
		//#1. 객체생성
		A a = new A() {
			
			@Override
			public void abc() {
				System.out.println("방법#2. 익명구현객체로 생성");
			}// abc()
		};
		
		//#2. 메소드 호출
		a.abc();
	}// main
	
}// end class
