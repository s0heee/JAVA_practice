package sec05_제네릭메소드.EX02;

class A {
	public <T> void method(T t) {
		System.out.println(t.equals("안녕"));
	}
}// A class


public class AvailableMethodInGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
		
	}//main
	
}// end class
