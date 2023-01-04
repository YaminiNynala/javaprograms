class Employee
{
	public int id;
	public String name;
	public int salary;
    public Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void details()
	{
		System.out.println("Name of the Employee: "+name);
		System.out.println("Id of the Employee: "+id);
		System.out.println("Salary of the Employee: "+salary);
	}
}
class Developer extends Employee
{
	public String language;
	public Developer(int id,String name,int salary,String language)
	{
		super(id,name,salary);
		this.language=language;
	}
	public void ddisplay()
	{
		System.out.println("*****Employee Info*****");
		details();
		System.out.println("Language is : "+language);
	}
}
class TestEngg extends Employee
{
	public String testingRole;
	public TestEngg(int id,String name,int salary,String testingRole)
	{
		super(id,name,salary);
		this.testingRole=testingRole;
	}
	public void tdisplay()
	{
		System.out.println("*****Employee Info*****");
		details();
		System.out.println("Testing Role is : "+testingRole);
	}
}
class  Assignment
{
	public static void main(String[] args) 
	{
		Developer d1 = new Developer(1,"yamini",24,"Java");
		d1.ddisplay();
		TestEngg t1 = new TestEngg(2,"Ganesh",24,"Automation");
		t1.tdisplay();
	}
}
