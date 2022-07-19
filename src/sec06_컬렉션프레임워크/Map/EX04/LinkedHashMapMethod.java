package sec06_컬렉션프레임워크.Map.EX04;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		//Map: key는 중복 불가능, value는 중복 가능
		//LinkedHashMap: key입력순서대로 출력이 됨
		Map<Integer, String> hLink1 = new LinkedHashMap<>();
		
		//#1. put(K key, V value)
		hLink1.put(2, "나다라");
		hLink1.put(1, "가나다");
		hLink1.put(3, "다라마");
		System.out.println("#1." + hLink1);
		
		//#2. putAll(다른 맵 객체)
		Map<Integer, String> hLink2 = new LinkedHashMap<>();
		hLink2.putAll(hLink1);
		System.out.println("#2." + hLink2);
		
		//#3. replace(K key, V value): 키의 값을 변경(해당키가 있을 경우에만 실행)
		hLink2.replace(1, "가가가");	//키가 1인 값을 "가가가"로 변경
		hLink2.replace(4, "라라라");	//키가 4가 없어서 실행 안됨 
		System.out.println("#3." + hLink2);
		
		//#4. replace(K key, V oldValue, V newValue): 키와 값이 모두 일치할 때 newValue로 변경
		hLink2.replace(1, "가가가", "나나나");	//키가1이고 값이 "가가가"인 것을 값을 "나나나"로 변경
		hLink2.replace(2, "다다다", "라라라");	//키와 값이 같이 일치하는 것이 없기 때문에 실행 안됨
		System.out.println("#4." + hLink2);
		
		//#5. V get(Object key)		//키로 값을 가져오기
		System.out.println(hLink2.get(1));	//키가 1이것 값 가져오기
		System.out.println(hLink2.get(2));
		System.out.println(hLink2.get(3));
		
		//#6. containsKey(Object key)	//이 키가 있는지
		System.out.println(hLink2.containsKey(1));	//있으니 true
		System.out.println(hLink2.containsKey(5));	//없으니 false
		
		//#7. containsValue(Object value)	//이 값이 있는지
		System.out.println(hLink2.containsValue("나나나"));	//있으니 true
		System.out.println(hLink2.containsValue("다다다"));	//없으니 false
		
		//#8. Set<K> keySet();	//키값만 가져와서 set객체로 만든다는 이야기
		Set<Integer> keySet = hLink2.keySet();
		System.out.println("#8." + keySet);
		
		//#9. Set<Map.Entry<K,V>> entrySet();	//키와 값을 한번에 가져와서 set객체로 만든다는 이야기
		Set<Map.Entry<Integer, String>> entrySet = hLink2.entrySet();
		System.out.println("#9." + entrySet);
		
		//#10. size()
		System.out.println("#10." + hLink2.size());
		
		//#11. remove(Object key)	//키로 entry 삭제
		hLink2.remove(1);
		hLink2.remove(4);	//4번키가 없으니까 실행 안됨
		System.out.println("#11." + hLink2);
		
		//#12. remove(Object key, Object Value)	//키와 값이 일치하는 entry 삭제
		hLink2.remove(2, "나다라");
		hLink2.remove(3, "다다다");	//3번키는 있지만 다다다를 갖는 값이 없으므로 실행 안됨
		System.out.println("#12." + hLink2);
		
		//#13. clear()
		hLink2.clear();
		System.out.println("#13." + hLink2);
		
	}//main
	
}// end class



























