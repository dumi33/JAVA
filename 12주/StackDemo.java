package sec12;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("ü��");
		stk.push("�ٳ���");
		stk.push("����");
		System.out.print(stk.peek()+"\n");
		for(String Str : stk) {
			System.out.print(Str + " ");
		}
		Stack<Integer> s2 = new Stack<>();
		s2.add(10);
		s2.add(1000);
		s2.add(1,100);
		System.out.print(s2.pop()+ " ");
		System.out.print(s2.pop()+ " ");
		System.out.print(s2.pop() + " ");
	}

}
