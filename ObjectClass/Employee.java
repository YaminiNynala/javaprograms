package ObjectClass;

public class Employee
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeCompanyName;
	private int employeeAge; 
	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeCompanyName,
			int employeeAge)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeCompanyName = employeeCompanyName;
		this.employeeAge = employeeAge;
	}
	public String toString()
	{
		return "Employee Name : "+ employeeName+ " ; " +"Employee Company Name"+employeeCompanyName;
	}
	public int hashCode()
	{
		return employeeId;
	}
	public boolean equals(Object o)
	{
		    Employee              e      =  (Employee)     o    ;   //down casting
	//	user def datatype    do cas r v     do cas obj  up r v
		    return this.employeeSalary == e.employeeSalary;
	}
}
