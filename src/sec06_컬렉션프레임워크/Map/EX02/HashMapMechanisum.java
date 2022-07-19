package sec06_컬렉션프레임워크.Map.EX02;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A {
	int data;

	public A(int data) {
		this.data = data;
	}
}// A class

class B {
	int data;

	public B(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			this.data = ((B)obj).data;
			return true;
		}
		return false;
	}
	
}//B class

class C {
	int data;

	public C(int data) {
		this.data = data;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(data);	//data의 주소
	}
	
}//C class



public class HashMapMechanisum {

	public static void main(String[] args) {
		
		//#1. equals와 hashCode를 오버라이딩 하지 않은 경우
		Map<A, String> hashMap1 = new HashMap<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);		//변수주소 같으니? (false)
		System.out.println(a1.equals(a2));	//값이 같으니? (false) equals를 오버라이딩하지 않았기 때문
		
		System.out.println(a1.hashCode() + "," + a2.hashCode());
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		System.out.println(hashMap1.size());	//2개(다른객체이기때문에 중복이 아님)
		System.out.println();
		
		
		//#2. equals를 오버라이딩 한 경우
		Map<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);		//변수주소 같으니? (false)
		System.out.println(b1.equals(b2));	//값이 같으니? (true)	equals를 오버라이딩했기 때문
		
		System.out.println(b1.hashCode() + "," + b2.hashCode());
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, " 두번째");
		System.out.println(hashMap2.size());	//2개(다른객체이기때문에 중복이 아님)
		System.out.println();
		
		
		//#3. equals와 hashCode를 오버라이딩 한 경우
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);		//변수주소 같으니? (false)
		System.out.println(c1.equals(c2));	//값이 같으니? (true)	equals를 오버라이딩했기 때문
				
		System.out.println(c1.hashCode() + "," + c2.hashCode());	//hascode를 오버라이딩했기 때문 같음
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		System.out.println(hashMap3.size());	//1개(값이 같고, 해쉬코드가 같아서 중복이라 생각함)
		System.out.println(hashMap3);
		
		
	}//main
	
}// end class






















