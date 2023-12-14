package Constructors_Example;

public class Cons_Example3 
{
	
	public Cons_Example3()
	{
		this(10);
		System.out.println("Zero argument constructor");
	}
	
	public Cons_Example3(int a)
	{
		this(25.5f,56.5f,35.f);
		System.out.println("One argument constructor "+ a);
	}
	
	public Cons_Example3(int a, int b)
	{
		System.out.println("Two argument constructor "+ (a+b));
	}
	
	public Cons_Example3(int a, float b)
	{
		this();
		System.out.println("Two argument float constructor "+ (a+b));
	}
	
	public Cons_Example3(float a, float b, float c)
	{
		this(25,25);
		System.out.println("Three argument float constructor "+ (a+b+c));
	}

	public static void main(String[] args) 
	{
		new Cons_Example3(10,25.5f);
		
	
		
		
		
		

	}

}
