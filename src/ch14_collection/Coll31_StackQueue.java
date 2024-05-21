package ch14_collection;
import java.util.*;
/*
 * Stack -> in:push  out:pop
 * Queue -> in:offer  out:poll
 */
class Coll31_StackQueue {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>(); 
		Queue<String> q = new LinkedList<String>();	 
		// Queue인터페이스의 구현체인 LinkedList를 사용
		st.push("0");		st.push("1");		st.push("2");
		q.offer("0");		q.offer("1");		q.offer("2");
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());		}	}
}