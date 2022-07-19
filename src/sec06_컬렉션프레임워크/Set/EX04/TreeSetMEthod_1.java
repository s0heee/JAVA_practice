package sec06_컬렉션프레임워크.Set.EX04;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMEthod_1 {

	public static void main(String[] args) {
		//Set<Integer>으로 선언X
		//treeset: 중복값x, 인덱스번호x (값은 오름차순으로 있음)
		TreeSet<Integer> treeset = new TreeSet<>();
		for(int i = 50; i>0; i-=2) {	//50부터 거꾸로 2씩 감소하여 넣기
			treeset.add(i);
		}//for
		System.out.println(treeset);	//입력을 거꾸로 집어넣어도 오름차순으로 나옴
		
		//읽기
		//#1. first()
		System.out.println(treeset.first());
		
		//#2. last()
		System.out.println(treeset.last());
		
		//#3. lower(E element)	e<
		System.out.println(treeset.lower(26));
		
		//#4. higher(E element)	e>
		System.out.println(treeset.higher(26));	
		
		//#5. floor(E element)	//자기 자신 포함 e<=
		System.out.println(treeset.floor(25));
		System.out.println(treeset.floor(26));
		
		//#6. ceiling(E element)	//자기 자신 포함	e>=
		System.out.println(treeset.ceiling(25));
		System.out.println(treeset.ceiling(26));
		System.out.println();
		
		//꺼내기
		//#7. .pollFirst()
		int treesetSize = treeset.size();
		System.out.println(treesetSize);
		for(int i=0; i<treesetSize; i++) {
			System.out.print(treeset.pollFirst() + " ");	//첫번째 데이터를 순회하여 꺼냄(2,4,...,48,50)
		}// for
		System.out.println("\n" + treeset.size());		//0
		System.out.println();
		
		//#8. pollLast()
		//데이터넣기
		for(int i = 50; i>0; i-=2) {	//50부터 거꾸로 2씩 감소하여 넣기 그러나 값은 오름차순으로 있음
			treeset.add(i);
		}//for
		
		treesetSize = treeset.size();
		System.out.println(treesetSize);	//25
		for(int i=0; i<treesetSize; i++) {
			System.out.print(treeset.pollLast() + " ");	//마지막 데이터를 순회하여 꺼냄(50,48,...,4,2)
		}// for
		System.out.println("\n" + treeset.size());	//0
		System.out.println();
		
		//#9. SortedeSet<E> headset(E element)	//앞쪽 부분을 가져옴
		//데이터넣기
		for(int i = 50; i>0; i-=2) {	//50부터 거꾸로 2씩 감소하여 넣기 그러나 값은 오름차순으로 있음
			treeset.add(i);
		}//for
		SortedSet<Integer> sSet = treeset.headSet(20);	//20의 앞에부분 (20>)
		System.out.println(sSet);						//2,4,...,16,18
		
		//#10. NavigableSet<E> headset(E element, bollean)		//앞쪽 부분을 가져옴
		NavigableSet<Integer> nSet = treeset.headSet(20 ,true);	//20의 앞에부분 포함하여(20>=)
		System.out.println(nSet);								//2,4,...,18,20
		nSet = treeset.headSet(20 ,false);				//20의 앞에부분(20>)
		System.out.println(nSet);						//2,4,...,16,18
		System.out.println();
		
		//#11. SortedeSet<E> tailSet(E element)
		sSet = treeset.tailSet(20);	//20의 뒤에 부분 포함하여(20<=)
		System.out.println(sSet);	//20,22,...,50
		
		//#12. NavigableSet<E> tailSet(E element, bollean)
		nSet = treeset.tailSet(20, false);	//20의 뒤에 부분 (20<)
		System.out.println(nSet);			//22,24,...,50
		System.out.println();
		
		//#13. SortedeSet<E> subSet(E element)
		sSet = treeset.subSet(10, 20);	//10,12,...,18
		System.out.println(sSet);
		
		//#14. NavigableSet<E> subSet(E element, bollean)
		nSet = treeset.subSet(10, true, 20, false);	//10,12,...,18
		System.out.println(nSet);
		nSet = treeset.subSet(10, false, 20, true);	//12,...,20
		System.out.println(nSet);
		System.out.println();
		
		//#15. NavigableSet<E> descendingSet(E element, bollean)
		System.out.println(treeset);			//값은 디폴트인 오른차순으로 출력
		System.out.println(treeset.descendingSet());	//값을 내림차순으로 출력
		
	}// main
	
}// end class



























