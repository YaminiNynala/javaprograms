package collectionInterface;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class PriorityQueueInteger 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.offer(27);
		pq.add(21);
		pq.offer(14);
		pq.add(12);
		pq.add(22);
		pq.offer(2);
		System.out.println(pq.peek());//retrieves the head element
		System.out.println(pq.poll());//retrieves and removes the head element
		pq.clear();
		System.out.println(pq.poll());//if there are no elements in the queue it gives null values
		try 
		{
			System.out.println(pq.remove());//if there are no elements in the queue it throws an exception
		}
		catch (NoSuchElementException nsee)
		{
			System.out.println("There is no other element in the queue");
		}
		System.out.println(pq);
	}
}
