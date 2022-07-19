package sec01_타입캐스팅.EX03;

class A{}
class B extends A {}

public class Typecasting_3 {

	public static void main(String[] args) {
		//#1. instanceof
		A a = new A();
		A ab = new B();
		
		System.out.println(a instanceof A);		//t
		System.out.println(a instanceof B);		//f
		
		System.out.println(ab instanceof A);	//t
		System.out.println(ab instanceof B);	//t
		
		//
		if(a instanceof B) {	//false
			B b = (B)a;
			System.out.println("a를 B로 강제형변환 함");
		} else {
			System.out.println("a를 B로 강제형변환 불가능함");
		}// if-else
		
		if(ab instanceof B) {	//true
			B b = (B)ab;
			System.out.println("ab를 B로 강제형변환 함");
		} else {
			System.out.println("ab를 B로 강제형변환 불가능함");
		}// if-esle
		
		if("안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 타입입니다.");
		}
		
	}//main
	
}//end class
