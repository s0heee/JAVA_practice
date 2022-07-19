package sec01_타입캐스팅.EX01;
// 클래스의 상속관계

class A{}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
	
	public static void main(String[] args) {
		//#1. 업캐스팅 (자동형변환)
		A ac = new C();	//C->A 업캐스팅
		B bc = new C();	//C->B 업캐스팅
		
		B bb = new B();
		A a = bb;	//B->A 업캐스팅
		
		//#2-1 다운캐스팅(강제형변환): 불가능한 경우(실행시 예외 발생)
		A aa = new A();
//		B b = (B)aa;	//A->B 다운캐스팅: 문법적 오류는 안나지만 실행시 컴파일 오류
//		C c = (C)aa;	//A->C 다운캐스팅 ''
		
		//#2-2 다운캐스팅(강제형변환): 가능한 경우
		A ab = new B();
		B b = (B)ab;	//A->B 다운캐스팅(강제형변환)
//		C c = (C)ab;	//A->C 다운캐스팅 불가능함. A는 B로까지만 만들었기 때문에 B까지만 다운캐스팅 가능
		
		B bd = new D();
		D d = (D)bd;	//B->D 다운캐스팅(강제형변환)
		
		A ad = new D();
		B b1 = (B)ad;	//A->B 다운캐스팅(강제형변환)
		D d1 = (D)ad;	//A->D 다운캐스팅(강제형변환)
		
	}//main

}//end class
