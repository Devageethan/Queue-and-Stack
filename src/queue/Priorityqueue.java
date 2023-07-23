package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {
public static void main(String[] args) {
	Queue q= new PriorityQueue<>();
	q.add("30");
	q.add("20");
	q.add("10");
	q.add("11");
	//q.add(null);
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
	System.out.println(q.element());
	System.out.println(q.offer("50"));
	System.out.println(q.remove("50"));
	System.out.println(q.size());
}
}
