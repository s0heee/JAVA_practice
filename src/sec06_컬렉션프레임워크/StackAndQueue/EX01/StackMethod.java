package sec06_컬렉션프레임워크.StackAndQueue.EX01;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		//Stack: 후입 선출
		Stack<Integer> stack = new Stack<>();
		
		//#1. E push(E element)
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
				
		//#2. E peek();	//제일 마지막에 들어온 데이터를 쳐다봄
		System.out.println(stack.peek()); //7
		System.out.println(stack.size()); //4
		System.out.println();
		
		//#3. E search(Object o)	//몇번째에 있는지(제일 위가 1, 나오는 순서는 제일 위꺼기 때문)
		System.out.println(stack.search(7));	//1
		System.out.println(stack.search(2));	//4
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(5));	//3
		System.out.println(stack.search(9));	//없는건 -1출력
		System.out.println();
		
		//#4. E pop(); //제일 마지막에 들어온 데이터를 꺼냄
		System.out.println(stack.pop());	//7
		System.out.println(stack.pop());	//3
		System.out.println(stack.pop());	//5
		System.out.println(stack.pop());	//2
		System.out.println(stack.size());	//0
		System.out.println();
		
		//#5. E empty();	//데이터가 있냐 없냐?(true, false)
		System.out.println(stack.empty());	//비어있으니 true
		stack.push(1);
		System.out.println(stack.empty());	//있으니 false
		
	}// main
	
}// end class




























