package collectionInterface;

import java.util.ArrayList;

public class ArrayListRaw 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(new Yamini("Yamini Nynala",22,"Hyderabad","Developer",50000.27,8341892223l,"Deloitte"));
		al.add(new Pradeep("Pradeep Prathipati",24,"Hyderabad","Developer",50000.27,8341892223l,"Deloitte"));
		
		System.out.print("Yamini's Detail : ");
		Yamini y = (Yamini)al.get(0);//downcating
		System.out.println(y.salary);
		
		System.out.print("Pradeep's Detail : ");
		Pradeep p = (Pradeep)al.get(1);//downcating
		System.out.println(p.age);
	}
}
class Yamini
{
	public String employeeName;
	public int age;
	public String jobLocation;
	public String jobRole;
	public double salary;
	public long mobileNumber;
	public String companyName;
	public Yamini(String employeeName, int age, String jobLocation, String jobRole, double salary, long mobileNumber,
			String companyName)
	{
		this.employeeName = employeeName;
		this.age = age;
		this.jobLocation = jobLocation;
		this.jobRole = jobRole;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.companyName = companyName;
	}
}

class Pradeep
{
	public String employeeName;
	public int age;
	public String jobLocation;
	public String jobRole;
	public double salary;
	public long mobileNumber;
	public String companyName;
	public Pradeep(String employeeName, int age, String jobLocation, String jobRole, double salary, long mobileNumber,
			String companyName)
	{
		this.employeeName = employeeName;
		this.age = age;
		this.jobLocation = jobLocation;
		this.jobRole = jobRole;
		this.salary = salary;
		this.mobileNumber = mobileNumber;
		this.companyName = companyName;
	}
}
