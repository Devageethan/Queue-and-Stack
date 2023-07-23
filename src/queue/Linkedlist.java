package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Linkedlist {
public static void main(String[] args) {
	Queue q= new LinkedList();
	q.add(12);
	q.add(34);
	q.add(22);
	q.add(67);
	q.add(null);
//	q.poll();
//	q.poll();
//	q.poll();
//	q.poll();
	q.poll();
	q.remove();
	System.out.println(q);
	System.out.println(q.peek());
}
}
