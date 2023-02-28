package collectionInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterviewQuestion_StudentDetails {
public static void main(String[] args) {
	HashMap studentBranch = new HashMap();
	studentBranch.put("S100", "CSE");
	studentBranch.put("S101", "CSE");
	studentBranch.put("S102", "ECE");
	
	HashMap student = new HashMap();
	student.put("S100", "Gopi");
	student.put("S101", "Ram");
	student.put("S102", "Mahesh");
	
	Set s = studentBranch.entrySet();//converted from map to set
	Iterator i = s.iterator();
	
	Set s1 = student.entrySet();
	Iterator i1 = s1.iterator();
	
	System.out.println("SRollNo -------> SName -------> SBranch");
	
	while(i.hasNext())
	{
		Map.Entry e = (Map.Entry) i.next();
		Map.Entry e1 = (Map.Entry) i1.next();
		if(e.getValue().equals("CSE"))
		{
			if(e.getKey().equals(e1.getKey()))
			{
				System.out.println(e1.getKey()+" -------> "+e1.getValue()+" -------> "+e.getValue());
			}
		}
	}

}
}
