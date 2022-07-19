package sec02_메소드오버라이딩.EX02;

class Animal{
	
	void cry() {
		
	}
}// class

class Bird extends Animal{
	
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}// class

class Dog extends Animal{
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}//class

class Cat extends Animal{
	
	@Override
	void cry() {
		System.out.println("야옹");
	}
}//class

public class MethodOverriding_2 {
	
	public static void main(String[] args) {
		//#1. 각각의 타입으로 선언 + 각각의 타입으로 생성
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println();
		
		//#2. Animal 타입으로 선언 + 자식 타입으로 생성
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println();
		
		//#3. 배열로 관리
		Animal[] animals = {ab, ac, ad};
		for(Animal a : animals) {
			a.cry();
		}// for
		
		
	}//main
	
}// end class


























