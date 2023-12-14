package Method_Example;

public class Method_Example1 
{
	public void m1()  //instance
	{
		System.out.println("M1 instance method");
	}
	
	public static void m2()
	{
		System.out.println("M2 static Method");
	}

	public static void main(String[] args) 
	{
		
		m2();
		
		Method_Example1 mobj=new Method_Example1();
		
		mobj.m1();
	}

}

//static method --> static method --> direct

//instance method --> static method --> Object

//static method --> instance method --> direct

//instance method --> instance method --> direct
