package sec07_람다익스프레션.EX08;

interface A {
	int[] abc(int len);
}

public class RefOfArrayConstructor {

	public static void main(String[] args) {
		
		//# 배열의 생성자 참조
		//#1. 익명이너클래스
		A a1 = new A() {

			@Override
			public int[] abc(int len) {
				return new int[len];
			}
		};
		int[] arr1 = a1.abc(3);
		System.out.println(arr1.length);
		
		//#2. 람다식
		A a2 = len -> new int[len];
		int[] arr2 = a2.abc(5);
		System.out.println(arr2.length);
		
		//#3. 배열의 생성자 참조
		A a3 = int[]::new;
		int[] arr3 = a3.abc(7);
		System.out.println(arr3.length);
		
		
	}// main
	
}// end class