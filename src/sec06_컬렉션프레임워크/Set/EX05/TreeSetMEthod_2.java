package sec06_컬렉션프레임워크.Set.EX05;

import java.util.Comparator;
import java.util.TreeSet;

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
		
}// MyClass


public class TreeSetMEthod_2 {

	public static void main(String[] args) {
		
		//#1. Integer 크기 비교
		TreeSet<Integer> treeset1 = new TreeSet<>();
		Integer intVal1 = new Integer(20);
		Integer intVal2 = new Integer(10);
		treeset1.add(intVal1);
		treeset1.add(intVal2);
		System.out.println(treeset1);	//오름차순으로 출력
		System.out.println();
		
		//#2. String 크기 비교
		TreeSet<String> treeset2 = new TreeSet<>();
		String str1 = "다라";
		String str2 = "가라";
		treeset2.add(str1);
		treeset2.add(str2);
		System.out.println(treeset2);	//오름차순으로 출력
		System.out.println();
		
//		//#3. MyClass 객체 크기 비교(MyClass 객체 크기 비교는 못하여 treeset.add를 할 수 없다)
//		TreeSet<MyClass> treeset3 = new TreeSet<>();
//		MyClass myC1 = new MyClass(2, 5);
//		MyClass myC2 = new MyClass(3, 3);
//		treeset3.add(myC1);	//ClassCastException 예외 발생
//		treeset3.add(myC2);	//ClassCastException 예외 발생
//		System.out.println(treeset3);
		
		//#4. MyCompareableClass 객체 크기 비교(MyCompareableClass 객체 크기 비교가능 implemet, 메소드 오버라이딩)
		TreeSet<MyCompareableClass> treeset4 = new TreeSet<>();
		MyCompareableClass myC1 = new MyCompareableClass(2, 5);
		MyCompareableClass myC2 = new MyCompareableClass(3, 3);
		treeset4.add(myC1);
		treeset4.add(myC2);
		
		for(MyCompareableClass mcc : treeset4) {
			System.out.println(mcc.data1 + "," + mcc.data2);
		}//for
		System.out.println(treeset4);
		System.out.println();
		
		//#5. MyClass 객체 크기 비교(생성자 argument에 비교기준 제공)
		TreeSet<MyClass> treeset5 = new TreeSet<>(new Comparator<MyClass>() {

			@Override
			public int compare(MyClass o1, MyClass o2) {
				
				if(o1.data1 < o2.data1) {
					return -1;		//this가 작다
				} else if(o1.data1 == o2.data1){
					return 0;		//this랑 같다
				} else {
					return 1;		//this가 크다
				}// if-elseif-else
				
			}// compare()
		});	//익명구현객체로 생성
		
		MyClass myClass1 = new MyClass(2,5);
		MyClass myClass2 = new MyClass(3,3);
		treeset5.add(myClass1);
		treeset5.add(myClass2);
		for(MyClass mc : treeset5) {
			System.out.println(mc.data1);
		}// for
		System.out.println(treeset5);
		
		
	}//main
	
}// end class





























