package sec06_컬렉션프레임워크.Map.EX07;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSummary {

	public static void main(String[] args) {
		
		//#1. HashMap: 입력 순서 상관없이 마구잡이로 출력
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap);
		
		//#2. HashTable: 입력 순서 상관없이 마구잡이도 출력
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable);		

		//#3. LinkedHashMap: 입력 순서와 출력순서가 같음
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		System.out.println(linkedHashMap);
		
		//#4. TreeMap: 입력 순서상관없이 키를 기준으로 오름차순으로 출력
		Map<String, Integer> treemap = new TreeMap<>();
		treemap.put("다", 30);
		treemap.put("마", 40);
		treemap.put("나", 50);
		treemap.put("가", 60); 
		System.out.println(treemap);		
		
	}// main
	
}// end class



























