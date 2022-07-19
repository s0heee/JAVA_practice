package sec05_쓰레드위한제네릭.EX01;

//#1. Apple 클래스와 Apple클래스를 담을 수 있는 클래스
class Apple{}
class Goods1{ 
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}// Goods1 class

//#2. Pencil 클래스와 Pencil클래스를 담을 수 있는 클래스
class Pencil{}
class Goods2{
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
}// Goods2 class


public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//#1. Goods1을 통해서 Apple 객체 추가 및 가져오기
		Goods1 g1 = new Goods1();
		g1.setApple(new Apple());
		
		Apple a = g1.getApple();
		
		//#2. Goods2을 통해서 Pencil 객체 추가 및 가져오기
		Goods2 g2 = new Goods2();
		g2.setPencil(new Pencil());
		
		Pencil p = g2.getPencil();
		
	}//main
	
}//end class























