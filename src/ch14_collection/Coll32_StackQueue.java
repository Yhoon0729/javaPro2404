package ch14_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Coll32_StackQueue {
	public static void main(String[] args) {
		String cars[] = {"소나타","그랜저","SM5","K9"};
		Stack<String> stack = new Stack<String>();
		for(String s : cars) { stack.push(s);}
		System.out.println("========================");
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size() 
		+ " ->" +stack);
		System.out.println(stack.peek()+ ": peek");
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size()
		+ " ->" +stack);
		System.out.println(stack.pop()+ ": pop");
		System.out.println("스택에 저장된 객체의 갯수:" + stack.size()
		+ " ->" +stack);
		
		Queue<String> queue = new LinkedList<String>();
		for(String s : cars) queue.offer(s);
		System.out.println("큐에 저장된 객체의 갯수:" 
		+ queue.size()	+ " ->" +queue);
		System.out.println(queue.peek());
		System.out.println("큐에 저장된 객체의 갯수:" 
		+ queue.size()+ " ->" +queue);
		System.out.println(queue.poll());
		System.out.println("큐에 저장된 객체의 갯수:" 
		+ queue.size()+ " ->" +queue);
	}
}