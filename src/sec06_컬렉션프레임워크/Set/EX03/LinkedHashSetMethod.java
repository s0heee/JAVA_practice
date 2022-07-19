package sec06_컬렉션프레임워크.Set.EX03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {

	public static void main(String[] args) {
//		Set: 중복값 제거, LinkedHashSet: 중복값제거, index없음(입력순으로 나오긴 함)
		Set<String> linkedSet1 = new LinkedHashSet<>();
		
		//#1. .add(E element)
		linkedSet1.add("가");
		linkedSet1.add("나");
		linkedSet1.add("가");
		System.out.println(linkedSet1);	//[가,나]
		System.out.println();
		
		//#2. .addAll(다른 set객체)
		Set<String> linkedSet2 = new LinkedHashSet<>();
		linkedSet2.add("나");
		linkedSet2.add("다");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2);	//[나,다,가]
		System.out.println();
		
		//#3. .remove(Object o)		//HashSet은 순서가 없기 때문에
		linkedSet2.remove("나");
		System.out.println(linkedSet2);	//[다,가]
		System.out.println();
		
		//#4. .clear()
		linkedSet2.clear();				//데이터 삭제
		System.out.println(linkedSet2);
		System.out.println();
		
		//#5. .isEmpty()
		System.out.println(linkedSet2.isEmpty());
		System.out.println(linkedSet1.isEmpty());
		System.out.println();
		
		//#6. contains (Object o)	//(값)이 포함되어있나? (true/false)
		Set<String> linkedSet3 = new LinkedHashSet<>();
		linkedSet3.add("가");
		linkedSet3.add("나");
		linkedSet3.add("다");
		System.out.println(linkedSet3.contains("나"));
		System.out.println();
		
		//#7. .size()
		System.out.println(linkedSet3.size());
		System.out.println();
		
		//#8. iterator();
		Iterator<String> iterator = linkedSet3.iterator();
		while(iterator.hasNext()) {					//다음 데이터가 있으면 개수가 3개니 3바퀴 돌 것임
			System.out.println(iterator.next());	//다음 데이터로 가라
		}
		System.out.println();
		
		//#9. .toArray()
		Object[] obj = linkedSet3.toArray();
		System.out.println(Arrays.toString(obj));
		System.out.println();
		
		//#10-1. toArray(T[] t)
		String[] strArr1 = linkedSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArr1));
		
		//#10-2. toArray(T[] t)
		String[] strArr2 = linkedSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArr2));
		
		
	}// main
	
}// end class


























