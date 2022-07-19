package sec06_컬렉션프레임워크.List.EX01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayVsList {

	public static void main(String[] args) {
		//#1. 배열 생성: 데이터 개수가 정해져있음
		String[] sArr = {"가", "나", "다", "라", "마", "바"};
		
		sArr[2] = null;
		sArr[5] = null;
		System.out.println(sArr.length);
		System.out.println(Arrays.toString(sArr));
		System.out.println();
		
		//#2. List: 데이터 개수 가변
		List<String> aList = new ArrayList<>();
		System.out.println(aList.size());		//데이터의 개수 구하기
		
		aList.add("가");						//.add() 데이터 넣기
		aList.add("나");
		aList.add("다");
		aList.add("라");
		aList.add("마");
		aList.add("바");
		System.out.println(aList.size());		//데이터 넣은 후 개수 구하기
		
		aList.remove("다");						//.remove() 데이터 삭제
		aList.remove("바");
		System.out.println(aList.size());		//데이터 삭제 후 개수 구하기
		
		System.out.println(aList);				//aList에 있는 데이터 출력
	}//main
	
}//end class
