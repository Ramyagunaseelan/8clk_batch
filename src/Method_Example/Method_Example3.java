package Method_Example;

public class Method_Example3 
{
	
	public void add()
	{
		System.out.println("add instance method");
		
		mul();  //i-i-d
	} 
	
	public static void sub()
	{
		System.out.println("Sub static method");
		
		div();  //s-s-d
	}

	public void mul()
	{
		sub();  //s-i-d
		
		System.out.println("Mul instance method");
		
		
	}
	
	public static void div()
	{
		System.out.println("Div static method");
	}
	
	public static void main(String[] args) 
	{
		
		new Method_Example3().add();  //i-s-o
		
	}

}
