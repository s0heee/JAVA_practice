package sec05_제네릭의구현.EX01;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Parent<T> {
	T t;
}

class Child1<T> extends Parent<T>{
	
}

@Getter
@Setter
class Child2<T, V> extends Parent<T>{
	V v;
}


public class InheritanceGenericClass {

	public static void main(String[] args) {
		//#1. 부모제네릭클래스
		Parent<String> p = new Parent<>();
		p.setT("부모제네릭클래스");
		System.out.println(p.getT());
		
		//#2. 자식클래스1
		Child1<String> c1 = new Child1<>();
		c1.setT("자식1제네릭클래스");
		System.out.println(c1.getT());
		
		//#3. 자식클래스2
		Child2<String, Integer> c2 = new Child2<>();
		c2.setT("자식2제네릭클래스");
		c2.setV(100);
		System.out.println(c2.getT() + "\t" + c2.getV());
				
	}//main
	
}// end class




















