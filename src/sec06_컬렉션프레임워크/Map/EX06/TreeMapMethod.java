package sec06_컬렉션프레임워크.Map.EX06;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

import lombok.ToString;

class MyClass {
	int data1;
	int data2;
	
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
		
}// MyClass

class MyCompareableClass implements Comparable<MyCompareableClass>{
	int data1;
	int data2;
	
	
	public MyCompareableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}


	@Override
	public int compareTo(MyCompareableClass o) {	//크기비교의 기준을 여기서 설정(음수(-1), 0, 양수(1))
		if(this.data1<o.data1) {
			return -1;		//this가 작다
		} else if(this.data1 == o.data1){
			return 0;		//this랑 같다
		} else {
			return 1;		//this가 크다
		}// if-elseif-else
	}// compareTo()
	
	@Override
	public String toString() {
		return ("data1: " + data1 + ", " + "data2: " + data2);
	}
		
}// MyClass


public class TreeMapMethod {

	public static void main(String[] args) {
		
		//#1. Integer 크기 비교
		TreeMap<Integer, String> treemap1 = new TreeMap<>();
		Integer intVal1 = new Integer(20);
		Integer intVal2 = new Integer(10);
		treemap1.put(intVal1, "가나다");
		treemap1.put(intVal2, "나다라");
		System.out.println(treemap1);	//오름차순으로 출력 (10,20)
		System.out.println();
		
		//#2. String 크기 비교
		TreeMap<String, Integer> treemap2 = new TreeMap<>();
		String str1 = "다라";
		String str2 = "가라";
		treemap2.put(str1, 1);
		treemap2.put(str2, 2);
		System.out.println(treemap2);	//오름차순으로 출력 (가라, 다라)
		System.out.println();
		
//		//#3. MyClass 객체 크기 비교(MyClass 객체 크기 비교는 못하여 treeset.add를 할 수 없다)
//		TreeMap<MyClass, String> treemap3 = new TreeMap<>();
//		MyClass myC1 = new MyClass(2, 5);
//		MyClass myC2 = new MyClass(3, 3);
//		treemap3.put(myC1, "가나다");	//ClassCastException 예외 발생
//		treemap3.put(myC2, "나다라");	//ClassCastException 예외 발생
//		System.out.println(treemap3);
		
		//#4. MyCompareableClass 객체 크기 비교(MyCompareableClass 객체 크기 비교가능 implemet, 메소드 오버라이딩)
		TreeMap<MyCompareableClass, String> treemap4 = new TreeMap<>();
		MyCompareableClass myC1 = new MyCompareableClass(2, 5);
		MyCompareableClass myC2 = new MyCompareableClass(3, 3);
		treemap4.put(myC1, "가나다");
		treemap4.put(myC2, "나다라");
		
		System.out.println(treemap4);
		System.out.println();
		
		//#5. MyClass 객체 크기 비교(생성자 argument에 비교기준 제공)
		TreeMap<MyClass, String> treemap5 = new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1 < o2.data2) return -1;
				else if (o1.data1 == o2.data2) return 0;
				else return 1;
			}// compare
			
		});// 익명구현객체 생성으로 TreeMap 생성
		
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treemap5.put(myClass1, "가나다");
		treemap5.put(myClass2, "나다라");
		
		System.out.println(treemap5);
		
		
	}//main
	
}// end class





























