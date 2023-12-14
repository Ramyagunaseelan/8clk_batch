package Method_Example;

public class Method_Example2 
{
	
	public void add()
	{
		System.out.println("add instance method");
	}
	
	public static void sub()
	{
		System.out.println("Sub static method");
	}

	public void mul()
	{
		System.out.println("Mul instance method");
	}
	
	public static void div()
	{
		System.out.println("Div static method");
	}
	
	public static void main(String[] args) 
	{
		
		Method_Example2 mobj=new Method_Example2();
		
		mobj.add();
		
		mobj.mul();
		
		sub();
		
		div();
		
		
	}

}
