package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Collectors;

public class Dqeue {
public static void main(String[] args) {
	Deque d=new ArrayDeque<>();
	Stack s=new Stack<>();
	s.add(10);
	s.add(20);
	s.add(30);
	d.add(10);
	d.push("20");
	d.push(30);
//	d.remove();
//	d.remove();
//	d.remove();
	System.out.println(s);
	System.out.println(d);
	s.pop();
	d.poll();
	System.out.println(s.stream().collect(Collectors.toList()));
	System.out.println(s.get(0));
	System.out.println(d.stream().collect(Collectors.toList()));
	System.out.println(d.getFirst());
}
}
