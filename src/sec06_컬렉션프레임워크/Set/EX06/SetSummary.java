package sec06_컬렉션프레임워크.Set.EX06;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSummary {

	public static void main(String[] args) {
		
		//#1. HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		System.out.println(hashSet);	//값의 순서가 마구잡이로 출력
		
		//#2. LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("나");
		linkedHashSet.add("가");
		System.out.println(linkedHashSet);	//값의 순서가 입력순서대로 출력
		
		//#3. TreeSet
		Set<String> treeset = new TreeSet<>();
		treeset.add("다");
		treeset.add("마");
		treeset.add("나");
		treeset.add("가");
		System.out.println(treeset);	//값의 순서가 오름차순으로 출력(그래서 크기비교가 되야 함)
		
	}// main
	
}// end class




























