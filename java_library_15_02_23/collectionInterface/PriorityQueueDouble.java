package collectionInterface;

import java.util.PriorityQueue;

public class PriorityQueueDouble 
{
	public static void main(String[] args) 
	{
		PriorityQueue pq = new PriorityQueue();
		pq.offer(27.5);
		pq.offer(45.6);
		pq.offer(23.1);
		pq.offer(21.7);
		pq.offer(-45.2);
		pq.offer(-87.9);
		pq.offer(-34.8);
		pq.remove();
		pq.remove(45.6);
		System.out.println(pq);
	}
}
