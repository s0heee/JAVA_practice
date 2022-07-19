package sec05_제네릭타입범위제한.EX02;

class A {
	public <T extends String> void method1(T t) {
		System.out.println(t.charAt(0));
	}
}// class

interface Myinterface{
	public abstract void print();
}

class B {	//Myinterface를 구현한 클래스만 올 수 있다.
	public <T extends Myinterface> void method1(T t) {
		t.print();
	}
}


public class BoundedTypeGenericMethod {

	public static void main(String[] args) {
		A a = new A();
		a.<String>method1("안녕");
		
		B b = new B();
		b.method1(new Myinterface() {
			@Override
			public void print() {
				System.out.println("print() 구현");
			}
		});
		
	}//main
	
}// end class
