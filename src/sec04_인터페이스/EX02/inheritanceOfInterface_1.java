package sec04_인터페이스.EX02;

interface A {}
interface B {}

//#1. 단일 인터페이스상속
class C implements A {}

//#2. 다중 인터페이스 상속
class D implements A, B {}

//#3. 클랙스와 인터페이스를 한번에 상속(extends와 implements는 순서를 바꿀 수 없다.)
class E extends D implements A,B {}


public class inheritanceOfInterface_1 {

}// end class
