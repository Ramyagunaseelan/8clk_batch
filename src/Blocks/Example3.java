package Blocks;

public class Example3 {
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("Static block");
	}
	
	public Example3()
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
		m2();
		
		Example3 e3=new Example3();
		
		e3.m1();

	}

}
