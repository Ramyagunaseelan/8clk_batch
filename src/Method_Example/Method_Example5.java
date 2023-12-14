package Method_Example;

//Method Overloading :

//Same method name different parameters

public class Method_Example5 
{
	
	
	public void add()
	{
		System.out.println("No Parameter");
	}
	
	public void add(int a)
	{
		System.out.println("One argument add method "+ a);
	}
	
	public void add(float a, float b)
	{
		System.out.println("Two argument add method "+ (a+b));
	}
	
	public void add(float a)
	{
		System.out.println("One argument float add method "+ a);
	}
	
	public void add(int a, double b, float c)
	{
		System.out.println("Three argument add method "+(a+b+c));
	}

	public static void main(String[] args) 
	{
		Method_Example5 e5=new Method_Example5();
		
		e5.add(105,45.5,35.5f);
		
		e5.add();
		
		e5.add(10);
		
		e5.add(25, 25);
		
		e5.add(35.5f);

	}

}
