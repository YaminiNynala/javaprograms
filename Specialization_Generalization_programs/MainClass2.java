class Student
{
	public String name;
	public int age;
	public String place;
	public Student(String name, int age, String place)
	{
		this.name=name;
		this.age=age;
		this.place=place;
	}
	public void study()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(place);
		System.out.println("Study well");
	}
	public void Exam()
	{
		System.out.println("perform well in the exam");
		System.out.println("------------------------------------");
	}
}
class MainClass2 
{
	public void display(Student s)
	{
		s.study();
		s.Exam();
	}
	public static void main(String[] args) 
	{
		MainClass2 m1 = new MainClass2();
		m1.display(new Student("yamini",23,"Ongole"));
		m1.display(new Student("Rammu",21,"Ongole"));
	}
}
