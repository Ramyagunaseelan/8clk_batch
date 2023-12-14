package Blocks;

public class Example4 {
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("Static block");
		
		m2();
		
		Example4 e3=new Example4();
		
		e3.m1();

	}
	
	public Example4()
	{
		System.out.println("Constructor");
	}
	
	public void m1()
	{
		System.out.println("Instance Method");
	}
	
	public static void m2()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) 
	{
		
	}

}
