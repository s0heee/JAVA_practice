package sec05_제네릭타입범위제한.EX03;

import lombok.Getter;
import lombok.Setter;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

@Getter
@Setter
class Goods<T> {
	private T t;
	
}

class Test {
	
	void method1(Goods<A> g) {}				//A만가능
	void method2(Goods<?> g) {}				//A,B,C,D,...모든 객체 가능
	void method3(Goods<? extends B> g) {}	//B를 상속받는 모든 객체(B,C,D)
	void method4(Goods<? super B> g) {}		//B의 부모 객체(A,B)
}


public class BoundedTypeOfInoutAgument {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.method1(new Goods<A>());
		
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		t.method2(new Goods<String>());
		
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
		
	}//main
	
}




















