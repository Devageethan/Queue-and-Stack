package stack;

import java.util.Stack;

public class Adding {
public static void main(String[] args) {
	Stack s=new Stack<>();
	s.add(12);
	s.add(33);
	s.add(56);
	s.add("55");
	s.add(true);
	s.push("78");
	s.push(99);
	System.out.println(s);
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s);
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	s.pop();
	// empty stack exception in next line
	s.pop();
	System.out.println(s);
}
}
