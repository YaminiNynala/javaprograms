package array;
import java.util.*;
				//WAP TO REMOVE 1ST ELEMENT AND 5TH ELEMENT AND LAST ELEMENT FROM ARRAYLIST
public class Pradeep1 
{

	public static void main(String[] args) 
	{
		ArrayList <Integer> a=new ArrayList();
		a.add(0);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.remove(4);
		a.remove(a.size()-1);
		System.out.println(a);
	}
}