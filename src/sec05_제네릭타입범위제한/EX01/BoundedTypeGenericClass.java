package sec05_제네릭타입범위제한.EX01;

import lombok.Getter;
import lombok.Setter;

class A {}
class B extends A{}
class C extends B{}

@Getter
@Setter
class D <T extends B> {
	private T t;
	
}


public class BoundedTypeGenericClass {

	public static void main(String[] args) {
//		D<A> d1 = new D<>();	//B를 상속받는 객체만 들어오기때문에 B,C만 가능
		D<B> d2 = new D<>();
		D<C> d3 = new D<>();
		D d4 = new D();		//extends B이므로 최상위로 B클래스부터 올 수 있음
		
		d2.setT(new B());
		d2.setT(new C());
		
//		d3.setT(new B());	//불가능: C타입 들어갈 수 있음
		d3.setT(new C());
		
		d4.setT(new B());
		d4.setT(new C());
		
	}//main
	
}//class
