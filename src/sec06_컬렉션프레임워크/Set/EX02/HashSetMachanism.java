package sec06_컬렉션프레임워크.Set.EX02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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



public class HashSetMachanism {

	public static void main(String[] args) {
		
		//#1. equals와 hashCode를 오버라이딩 하지 않은 경우
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);		//변수주소 같으니? (false)
		System.out.println(a1.equals(a2));	//값이 같으니? (false) equals를 오버라이딩하지 않았기 때문
		
		System.out.println(a1.hashCode() + "," + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println(hashSet1.size());	//2개(다른객체이기때문에 중복이 아님)
		System.out.println();
		
		
		//#2. equals를 오버라이딩 한 경우
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);		//변수주소 같으니? (false)
		System.out.println(b1.equals(b2));	//값이 같으니? (true)	equals를 오버라이딩했기 때문
		
		System.out.println(b1.hashCode() + "," + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size());	//2개(다른객체이기때문에 중복이 아님)
		System.out.println();
		
		
		//#3. equals와 hashCode를 오버라이딩 한 경우
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);		//변수주소 같으니? (false)
		System.out.println(c1.equals(c2));	//값이 같으니? (true)	equals를 오버라이딩했기 때문
				
		System.out.println(c1.hashCode() + "," + c2.hashCode());	//hascode를 오버라이딩했기 때문 같음
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size());	//1개(값이 같고, 해쉬코드가 같아서 중복이라 생각함)
		System.out.println();
		
		
	}//main
	
}// end class






















