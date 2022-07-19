package sec06_컬렉션프레임워크.StackAndQueue.EX02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	
	public static void main(String[] args) {
		//Queue: 선입선출
		//데이터가 없을때 예외처리 유무
		
		//<1>. 예외처리기능이 미포함 메소드 한 세트(데이터가 없을때 꺼내거나 쳐다볼 때 NoSuchElementException오류)
		Queue<Integer> queue1 = new LinkedList<>();
//		System.out.println(queue1.element());	//NoSuchElementException 데이터가 없으니 오류 발생
		//#1. add(E item)
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		
		//#2. element()	//선출 될 데이터를 그냥 쳐다봄
		System.out.println(queue1.peek());	//3
		System.out.println();
		
		//#3. remove()	//꺼낼 데이터 출력(선출)
		System.out.println(queue1.remove());	//3
		System.out.println(queue1.remove());	//4
		System.out.println(queue1.remove());	//5
//		System.out.println(queue1.remove());	//데이터가 다 나와 없으니 NoSuchElementException 예외발생
		System.out.println();		
		
		//<2>. 예외처리기능이 포함 메소드 둘 세트(데이터가 없어도 꺼내거나 쳐다볼때 NoSuchElementException 예외를 null로 처리해줌)
		Queue<Integer> queue2 = new LinkedList<>();
		//#1. offer(E item)
		queue2.offer(3);
		queue2.offer(4);
		queue2.offer(5);
		
		//#2. peek();	//선출 될 데이터를 그냥 쳐다봄
		System.out.println(queue2.peek());	//3
		System.out.println();
		
		//#3. poll()	//꺼낼 데이터 출력(선출)
		System.out.println(queue2.poll());	//3
		System.out.println(queue2.poll());	//4
		System.out.println(queue2.poll());	//5
		System.out.println(queue2.poll());	//데이터가 없을때 null이라 처리해줌
		
	}// main
	
}// end class



























