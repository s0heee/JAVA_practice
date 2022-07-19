package sec06_컬렉션프레임워크.List.EX03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		//Integer만 저장하는 ArrayList생성
		List<Integer> iArr = new ArrayList<>();
		
		//#1. .add(E element)	//인덱스를 지정안해주면 제일 뒤에 저장
		iArr.add(3);
		iArr.add(4);
		iArr.add(5);
		System.out.println(iArr);	//=System.out.println(iArr.toString(iArr));
		System.out.println();
		
		//#2. .add(int index, E element)
		iArr.add(1,6);	//1번째에 6을 추가
		System.out.println(iArr);
		System.out.println();
		
		//#3. .addAll(또 다른 리스트 객체 추가)
		List<Integer> iArr2 = new ArrayList<>();
		iArr2.add(1);
		iArr2.add(2);
		System.out.println(iArr2);
		
		iArr2.addAll(iArr);			//iArr리스트의 데이터를 모두 제일 뒤에 저장
		System.out.println(iArr2);
		System.out.println();
		
		//#4. .addAll(int index, E element)
		List<Integer> iArr3 = new ArrayList<>();
		iArr3.add(1);
		iArr3.add(2);
		iArr3.addAll(1, iArr3);		//iArr3 1번째 인덱스에 iArr3 데이터를 모두 저장
		System.out.println(iArr3);
		System.out.println();
		
		//#5 .set(int index E element);
		iArr3.set(1, 5);	//1번째 인덱스를 5로 변경
		System.out.println(iArr3);
		iArr3.set(3, 6);
		System.out.println(iArr3);
//		iArr3.set(5, 7);			//iArr3는 데이터 개수가 3까지 있는데, 변경 불가능. 추가를 해야함
//		System.out.println(iArr3);
		System.out.println();
		
		//#6 .remove(int index)		//인덱스번호로 데이터 삭제
		iArr3.remove(1);	//1번째 인덱스 삭제
		System.out.println(iArr3);
		System.out.println();
		
		//#7. .remove(Object o)
		iArr3.remove(new Integer(2));	//2라는 데이터 삭제
		System.out.println(iArr3);
		System.out.println();
		
		//#8. .clear();		//데이터를 한번에 삭제
		iArr3.clear();
		System.out.println(iArr3);
		System.out.println();
		
		//#9. .isEmpty();	//데이터가 비어있니? (true/false)
		System.out.println(iArr3.isEmpty());
		System.out.println(iArr.isEmpty());
		System.out.println();
		
		//#10. .size();		//데이터개수
		System.out.println(iArr3.size());
		iArr3.add(1);
		iArr3.add(2);
		iArr3.add(3);
		System.out.println(iArr3);
		System.out.println(iArr3.size());
		System.out.println();
		
		//#11. .get(int index)	//데이터 가져오기
		System.out.println("0번째 데이터: "+ iArr3.get(0));		//0번째 인덱스 데이터 가져오기
		System.out.println("1번째 데이터: "+ iArr3.get(1));
		System.out.println("2번째 데이터: "+ iArr3.get(2));
		for(int i =0; i<iArr3.size(); i++) {
			System.out.println(i + "번째: " + iArr3.get(i));
		}//for
		System.out.println();
		
		//#12. .toArray();		//List -> Array로 변경	//객체(object)타입으로 들어감
		Object[] obj = iArr3.toArray();
		System.out.println(Arrays.toString(obj));
		System.out.println();
		
		//#13-1. toArray(T[] t);	//List -> T타입 Array로 변경
		Integer[] num = iArr3.toArray(new Integer[10]);		//10개원소를 갖는 배열로 변경
		System.out.println(Arrays.toString(num));
		System.out.println();
		//#13-2 .toArray(T[] t);
		Integer[] num1 = iArr3.toArray(new Integer[0]);		//0으로 해주면 iArr.size()만큼의 원소를 갖는 배열로 변경
		System.out.println(Arrays.toString(num1));			//우리가 배열 사이즈를 굳이 지정 안하고 [0]을 넣어주는 일이 많음

	}// end class
	
}// end class



























