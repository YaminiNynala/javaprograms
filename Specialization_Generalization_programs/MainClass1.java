class MainClass1 
{
	public static void main(String[] args) 
	{
		MainClass1 m1=new MainClass1();
		m1.display(new Student("p"));
		m1.display(new Student("asf"));
		m1.display(new Student("yyg"));
	}
	public void display(Student s1)
	{
		s1.study();
		s1.takeExam();
		s1.seeResult();
	}
}