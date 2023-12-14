package Constructors_Example;

public class Cons_Example1 
{
	public Cons_Example1()  //Constructor
	{
		System.out.println("This is constructor");
	}
	
	
	public void Example1()  //instance
	{
		System.out.println("instance method");
	}
	
	
	public static void main(String[] args) 
	{
		
		Cons_Example1 c1=new Cons_Example1();
		
		c1.Example1();
	}

}
