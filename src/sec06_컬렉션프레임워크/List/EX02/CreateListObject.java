package sec06_컬렉션프레임워크.List.EX02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		
		//#방법1. List 구현클래스(자식)의 생성자를 사용하여 객체 생성
		List<Integer> aList1 = new ArrayList<>();		//저장용량: 디폴트는 (10)	//저장용량 != 데이터사이즈
		List<Integer> aList2 = new ArrayList<>(30);		//(30): 저장용량(데이터의 개수가 아님)
		
		List<Integer> aList3 = new Vector<>();			//저장용량: 디폴트(10)
		List<Integer> aList4 = new Vector<>(30);
		
		List<Integer> aList5 = new LinkedList<>();		//저장용량: 디폴트(10)
//		List<Integer> aList6 = new LinkedList<>(30);	//LinkedList는 저장용량을 따로 지정할 수 없음
				
		
		//#방법2. Arrays 클래스의 정적 메서드 활용하여 생성(단점: 데이터의 크기를 바꿀 수 없다.)ex. 요일을 저장할때 사용
		List<Integer> aList7 = Arrays.asList(1,2,3,4);			//배열은 생성될 때 크기가 정해지고 크기를 바꿀 수 없기 때문
		List<String> aList8 = Arrays.asList("안녕", "반가워");	//따라서 데이터를 추가하거나 삭제할 수 없다.
																//그러나 값을 변경하는 건 가능하다.
		aList7.set(1, 7);		//1번째 인덱스를 7로 바꾸겠다.
		aList8.set(0, "Hello");	//0번째 인덱스를 "Hello"로 바꾸겠다.
		
//		aList7.add(5);		//추가 불가능 
//		aList8.remove(0);	//삭제 불가능
		System.out.println(aList7);
		System.out.println(aList8);
		
		
	}//main
	
}// end class





















