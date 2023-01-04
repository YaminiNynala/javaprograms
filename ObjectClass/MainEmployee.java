package ObjectClass;

public class MainEmployee {

	public static void main(String[] args) 
	{
		Employee e = new Employee(100, "Yamini", 80000.00, "Infosys", 23);
		Employee e1 = new Employee(110, "Pradeep", 70000.00, "Infosys", 24);
		System.out.println(e.toString());
		System.out.println(e1);
		System.out.println("comparision: "+e.equals(e1));
		System.out.println("Yamini emp id: "+e.hashCode());
		System.out.println("Ramya emp id: "+e1.hashCode());
	}

}
