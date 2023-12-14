package Constructors_Example;

public class Cons_Example2 
{
	
	public Cons_Example2()
	{
		System.out.println("Zero argument constructor");
	}
	
	public Cons_Example2(int a)
	{
		System.out.println("One argument constructor "+ a);
	}
	
	public Cons_Example2(int a, int b)
	{
		System.out.println("Two argument constructor "+ (a+b));
	}
	
	public Cons_Example2(int a, float b)
	{
		System.out.println("Two argument float constructor "+ (a+b));
	}
	
	public Cons_Example2(float a, float b, float c)
	{
		System.out.println("Three argument float constructor "+ (a+b+c));
	}

	public static void main(String[] args) 
	{
		new Cons_Example2(10,25.5f);
		
		new Cons_Example2();
		
		new Cons_Example2(45);
		
		new Cons_Example2(45, 20);
		
		new Cons_Example2(56.5f,45.5f,34.5f);
		
		

	}

}
