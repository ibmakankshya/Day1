package AdvancedDataStructure;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("Despacito");
		q.add("Closer");
		q.add("OLD Town road");
		System.out.println(q.toArray());//queue to array
		System.out.println(q);
	}
}
