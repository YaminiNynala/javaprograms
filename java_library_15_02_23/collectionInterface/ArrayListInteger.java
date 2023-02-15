package collectionInterface;

import java.util.ArrayList;

public class ArrayListInteger 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList();
		al.add(10);
		al.add(34);
		al.add(67);
		al.add(12);
		al.add(null);
		System.out.println(al);
		al.add(100); //adding the element
		System.out.println(al);
		al.add(3, 27); //Adding at the specified index position
		System.out.println(al);
		al.remove(5); //Removing the element with respect to index
		System.out.println(al); 
		al.remove(new Integer(100)); //Removing the element with respect to object
		System.out.println(al); 
	}
	
}
