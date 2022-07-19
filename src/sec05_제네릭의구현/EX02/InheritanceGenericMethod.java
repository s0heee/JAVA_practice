package sec05_제네릭의구현.EX02;

class Parents {
	
	<T extends Number> void print(T t) {
		System.out.println(t);
	}
}

class Child extends Parents {
	
}



public class InheritanceGenericMethod {

	public static void main(String[] args) {
//		#1. 부모클래스 제네릭메소드
		Parents p = new Parents();
		p.<Integer>print(100);
		p.print(10);
		
//		#2. 자식클래스 제네릭메소드
		Child c = new Child();
		c.<Double>print(5.8);
		c.print(5.8);
	}//main
	
}// end class
