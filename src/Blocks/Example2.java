package Blocks;

public class Example2 {
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("Static block");
	}
	
	public void m1()
	{
		System.out.println("Instance method");
	}
	
	public static void m2()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) 
	{
		
		new Example2().m1();
		
		new Example2();
	}

}
