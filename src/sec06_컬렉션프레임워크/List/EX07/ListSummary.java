package sec06_컬렉션프레임워크.List.EX07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {

	public static void main(String[] args) {
		
		//1. ArrayList
		List<String> arrList = new ArrayList<>();
		arrList.add("다");
		arrList.add("마");
		arrList.add("나");
		arrList.add("가");
		System.out.println(arrList);	//[다, 마, 나, 가]
		System.out.println();
		
		//2. Vector(모든 메소드가 동기화가 되어 멀티쓰레드에 안전하다)
		List<String> vector = new Vector<>();
		vector.add("다");
		vector.add("마");
		vector.add("나");
		vector.add("가");
		System.out.println(vector);		//[다, 마, 나, 가]	
		System.out.println();
		
		//3. Linkedlist
		List<String> lList = new LinkedList<>();
		lList.add("다");
		lList.add("마");
		lList.add("나");
		lList.add("가");
		System.out.println(lList);		//[다, 마, 나, 가]	
		
	}// main
	
}// end class





























