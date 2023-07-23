package queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PBQ {
public static void main(String[] args) {
	PriorityBlockingQueue q=new PriorityBlockingQueue<>();
	q.add(111);
	q.add(20);
	q.add(33);
	q.poll();
	q.poll();
	q.poll();
	System.out.println(q.peek());
}
}
