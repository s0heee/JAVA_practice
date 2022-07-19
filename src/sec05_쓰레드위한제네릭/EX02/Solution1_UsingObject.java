package sec05_쓰레드위한제네릭.EX02;


//#1. Apple, Pencil 클래스를 모두 저장하고 꺼낼 수 있는 클래스
class Apple{}
class Pencil{}

class Goods{
	private Object obj = new Object();

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}// Goods class


public class Solution1_UsingObject {

	public static void main(String[] args) {
		//#1. Goods를 통해서 Apple객체 추가 및 가져오기
		Goods g1 = new Goods();
		g1.setObj(new Apple());
		
		Apple a = (Apple)g1.getObj();
		
		//#2. Goods를 통해서 Pencil객체 추가 및 가져오기
		Goods g2 = new Goods();
		g2.setObj(new Pencil());
		
		Pencil p = (Pencil)g2.getObj();
		
//		//#3. 잘못된 캐스팅(약한 타입체크)
//		Goods g3 = new Goods();
//		g3.setObj(new Apple());
//		
//		Pencil p2 = (Pencil)g3.getObj();	//실행예외(runtime error: classCastException)
	}//main
	
}//end class























