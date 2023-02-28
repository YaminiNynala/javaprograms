package collectionInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ContactDetailsUsingHashMap 
{
	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put(8341892223l, "Yamini");
		hm.put(8977507007l, "Rammu");
		hm.put(9989391332l, "Dad");
		hm.put(9951597718l, "Mom");
		hm.put(1231231234l, "Abcd");
		hm.put(1231235234l, "Abcetd");
		hm.put("xyz", 5435435435l);
		System.out.println("initial: "+hm);
		
		System.out.println("Keys in the form of Set : "+hm.keySet());
		System.out.println("Keys in the form of Collection : "+hm.values());
		
		if(hm.containsKey(8977507007l))
		{
			System.out.println(hm.get(8977507007l));
		}
		if(hm.containsValue("Abcd"))
		{
			hm.remove(1231231234l, "Abcd");
		}
		System.out.println("Updated map : "+hm);
		
		System.out.println("size : "+hm.size());
		
		System.out.println(hm.replace(8341892223l, "Yamini Nynala"));
		System.out.println(hm.replace(8977507007l, "Rammu", "Ramya Nynala"));
		
		System.out.println(hm);
		
		Set s = hm.entrySet();//converted from map to set
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry e = (Map.Entry) i.next();
			if(e.getValue().equals("Dad"))
			{
				e.setValue("Venu Gopal");
			}
			if(e.getKey().equals("xyz"))
			{
				e.setValue(1234567890l);
			}
		}
		System.out.println(hm);	
	}
}
