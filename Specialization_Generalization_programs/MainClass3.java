class WildAnimals 
{
	public void roam() 
	{
		System.out.println("Animals are roaming");
	}
	public void hunt() 
	{
		System.out.println("Animals are hunting");
	}
	public void eat() 
	{
		System.out.println("Animals are eating");
	}
}

class Lion extends WildAnimals
{
	public void roam() 
	{
		System.out.println("*****Lion*****");
		System.out.println("Animals are roaming");
	}
} 

class Tiger extends WildAnimals
{
	public void roam() 
	{
		System.out.println("*****Tiger*****");
		System.out.println("Animals are roaming");
	}

} 

class Cheetah extends WildAnimals
{
	public void roam() 
	{
		System.out.println("*****Cheetah*****");
		System.out.println("Animals are roaming");
	}

} 

class MainClass3 
{
	public void display(WildAnimals w)
	{
		w.roam();
		w.hunt();
		w.eat();
	}
	public static void main(String[] args) 
	{
		MainClass3 m1 = new MainClass3();
		m1.display(new Lion());
		m1.display(new Tiger());
		m1.display(new Cheetah());
	}
}
/*
	public static void main(String[] args) 
	{
		MainClass3 m1 = new MainClass3();
		Lion l1 = new Lion();
		l1.name1("*****lion*****");
		m1.display(new Lion());
		Tiger t1 = new Tiger();
	    t1.name2("*****Tiger*****");
		m1.display(new Tiger());
		Cheetah c1 = new Cheetah();
		c1.name3("*****Cheetah*****");
		m1.display(new Cheetah());
	}
*/
