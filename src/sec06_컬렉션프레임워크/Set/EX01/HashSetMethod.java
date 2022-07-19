package sec06_컬렉션프레임워크.Set.EX01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {
//		Set: 중복값 제거, HashSet: 중복값제거, index없음
		Set<String> hSet1 = new HashSet<>();
		
		//#1. .add(E element)
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가");
		System.out.println(hSet1);	//[가,나]
		System.out.println();
		
		//#2. .addAll(다른 set객체)
		Set<String> hSet2 = new HashSet<>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);	//[가,나,다]
		System.out.println();
		
		//#3. .remove(Object o)		//HashSet은 순서가 없기 때문에
		hSet2.remove("나");
		System.out.println(hSet2);	//[가,다]
		System.out.println();
		
		//#4. .clear()
		hSet2.clear();				//데이터 삭제
		System.out.println(hSet2);
		System.out.println();
		
		//#5. .isEmpty()
		System.out.println(hSet2.isEmpty());
		System.out.println(hSet1.isEmpty());
		System.out.println();
		
		//#6. contains (Object o)	//(값)이 포함되어있나? (true/false)
		Set<String> hSet3 = new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3.contains("나"));
		System.out.println();
		
		//#7. .size()
		System.out.println(hSet3.size());
		System.out.println();
		
		//#8. iterator();
		Iterator<String> iterator = hSet3.iterator();
		while(iterator.hasNext()) {					//다음 데이터가 있으면 개수가 3개니 3바퀴 돌 것임
			System.out.println(iterator.next());	//다음 데이터로 가라
		}
		System.out.println();
		
		//#9. .toArray()
		Object[] obj = hSet3.toArray();
		System.out.println(Arrays.toString(obj));
		System.out.println();
		
		//#10-1. toArray(T[] t)
		String[] strArr1 = hSet3.toArray(new String[0]);
		System.out.println(Arrays.toString(strArr1));
		
		//#10-2. toArray(T[] t)
		String[] strArr2 = hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArr2));
		
		
	}// main
	
}// end class


























