package sec06_컬렉션프레임워크.Map.EX05;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod_1 {

	public static void main(String[] args) {
		//Map<Integer, String>으로 선언 X
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		//데이터 넣기
		for(int i=20; i>0; i-=2) {
			treeMap.put(i, i+"번째 데이터");
		}
		System.out.println(treeMap);
		
		//데이터 읽기
		//#1. firstKey()
		System.out.println(treeMap.firstKey());	//2
		//#2. firstEntry()
		System.out.println(treeMap.firstEntry());	//2, 2번째 데이터
		
		//#3. lastKey()
		System.out.println(treeMap.lastKey());	//20	
		//#4. lastEntry()
		System.out.println(treeMap.lastEntry());	//20, 20번째 데이터
		
		//#5. lowerKey()
		System.out.println(treeMap.lowerKey(10));	//8: 10보다 작은거(포함X)
		//#6. lowerEntry
		System.out.println(treeMap.lowerEntry(10));	//8, 8번째 데이터
		
		//#7. higherKey()
		System.out.println(treeMap.higherKey(10));	//12: 10보다 큰거(포함X)
		//#8. higherEntry
		System.out.println(treeMap.higherEntry(10));	//12, 12번째 데이터
		
		//데이터 꺼내기
		//#9. pollFirstEntry()	//첫번째꺼 키랑 값을 꺼내기
		System.out.println(treeMap.pollFirstEntry());	//2, 2번째 데이터
		System.out.println(treeMap);
		
		//#10. pollLastEntry()	//마지막꺼 키랑 값 꺼내기
		System.out.println(treeMap.pollLastEntry());	//20, 20번째 데이터
		System.out.println(treeMap);
		
		//#11. SortedMap<k,V> headMap(K toKey)	//앞에 키만(toKey는 포함x)
		SortedMap<Integer,String> sMap = treeMap.headMap(8);
		System.out.println(sMap);	//2,4,6
		
		//#12. NavigableMAp<K,V> headMap(K toKey, boolean)	//앞에 키만(toKey는 포함x But! true하면 8포함!)
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);
		System.out.println(nMap);
		
		//#13. SortedMap<k,V> tailMap(K toKey)	//뒤에 키만(toKey는 포함o)
		SortedMap<Integer,String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);	//14, 16, 18, 20
		
		//#14. NavigableMAp<K,V> tailMap(K toKey, boolean)	//앞에 키만(toKey는 포함o But! false하면 14포함x)
		NavigableMap<Integer, String> nMap2 = treeMap.tailMap(14, false);
		System.out.println(nMap2);
		
		//#15. SortedMap<k,V> subMap(K fromKey, K toKey)	//시작은 포함 끝은 포함x
		SortedMap<Integer,String> sMap3 = treeMap.subMap(6, 10);	//6,8
		System.out.println(sMap3);
		
		//#16. SortedMap<k,V> subMap(K fromKey, K toKey)	//false: 포함x, true: 포함o
		SortedMap<Integer,String> sMap4 = treeMap.subMap(6, false, 10, true);	//8,10
		System.out.println(sMap4);
		
		//#17. NavigableSet<K> desendingKeySet()	//키만 뽑아서 Set으로 내림차순으로 넣기
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		
		//#18. NavigableMAp<K, V> desendingKeyMap()	//키와 값을 뽑아서 Set으로 내림차순으로 넣기
		NavigableMap<Integer, String> nMap3 = treeMap.descendingMap();
		System.out.println(nMap3);
		
	}//main
	
}// end class



























