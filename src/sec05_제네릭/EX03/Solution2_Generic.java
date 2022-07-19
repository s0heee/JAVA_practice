package sec05_제네릭.EX03;

class Apple{}
class Pencil{}

class Goods<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}// Goods class

public class Solution2_Generic {

	public static void main(String[] args) {
		//#1. Goods를 통해서 Apple객체 추가 및 가져오기
		Goods<Apple> g1 = new Goods<>();
		g1.set(new Apple());
		Apple a = g1.get();
		
		//#2. Goods를 통해서 Pencil객체 추가 및 가져오기
		Goods<Pencil> g2 = new Goods<>();
		g2.set(new Pencil());
		Pencil p = g2.get();
		
//		//#3. 강한타입 체크-> 컴파일 오류발생
//		Goods<Apple> g3 = new Goods<>();
//		g3.set(new Apple());
//		Pencil p1 = g3.get();	//컴파일 오류발생
	}//main
	
}// end class
