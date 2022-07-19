package sec05_제네릭.EX01;

class MyClass<T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}// MyClass<T>


public class SingleGenericArgument {

	public static void main(String[] args) {
		
		MyClass<String> mc1 = new MyClass<>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		MyClass<Integer> mc2 = new MyClass<>();
		mc2.set(100);
		System.out.println(mc2.get());
		
//		MyClass<Integer> mc3 = new MyClass<>();
//		mc3.set("안녕");	//강한타입체크
				
	}//main
	
}// end class
