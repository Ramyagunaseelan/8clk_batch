package Method_Example;

public class Methods_Example4 
{
	
	/*public void add()
	{
		int a=5,b=10,c;
		
		c=a+b;
		
		System.out.println("Add result = "+ c);
	}*/
	
	public void add(int a, int b)
	{
	
		int c=a+b;
		
		System.out.println("Add result = "+ c);
	}

	public static void main(String[] args) 
	{
		Methods_Example4 e4=new Methods_Example4();
		
		e4.add(25, 45);

	}

}
