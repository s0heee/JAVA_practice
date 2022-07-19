package sec06_컬렉션프레임워크.List.EX06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		//#1. 데이터 추가 시간 비교(LinkedList가 더 빠름)
		List<Integer> aList = new ArrayList<>();
		List<Integer> lList = new LinkedList<>();
		
		long startTime = 0;
		long endTime = 0;
		
		//@1-1 ArrayList 데이터 추가시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			aList.add(0, i);	//0번째 인덱스에 i값을 저장(계속 0번째 인덱스에 저장하니까 한칸씩 이동하여 저장)
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("ArrayList 데이터 추가시간: " + (endTime - startTime) + "ns");
		
		//@1-2 LinkedList 데이터 추가시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			lList.add(0, i);	//0번째 인덱스에 i값을 저장(계속 0번째 인덱스에 저장하니까 한칸씩 이동하여 저장)
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("LinkedList 데이터 추가시간: " + (endTime - startTime) + "ns");
		System.out.println();
		
		
		//#2. 데이터 검색 시간 비교(ArrayList가 더 빠름)
		//@2-1 ArrayList 데이터 검색시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			aList.get(i);	//i번째 인덱스 검색
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("ArrayList 데이터 검색시간: " + (endTime - startTime) + "ns");
		
		//@2-2 LinkedList 데이터 검색시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			lList.get(i);	//i번째 인덱스 검색
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("LinkedList 데이터 검색시간: " + (endTime - startTime) + "ns");
		System.out.println();
		
		
		//#3. 데이터 제거 시간 비교(LinkedList가 더 빠름)
		//@3-1 ArrayList 데이터 제거 시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			aList.remove(0);	//0번째 인덱스를 반복하여 삭제
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("ArrayList 데이터 제거시간: " + (endTime - startTime) + "ns");
		
		//3-2 LinkedList 데이터 제거 시간
		startTime = System.nanoTime();		//상대적인 값
		for(int i=0; i<100000; i++) {
			lList.remove(0);	//0번째 인덱스를 반복하여 삭제
		}//for
		endTime = System.nanoTime();		//상대적인 값
		System.out.println("LinkedList 데이터 제거시간: " + (endTime - startTime) + "ns");
		
	}// main
	
}// end class



























