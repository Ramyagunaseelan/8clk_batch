package Variables_Example;

public class Variables_Example2 
{
	
	public void add()
	{
		int a=5, b=10,c;   //local variable
		
		c=a+b;
		
		System.out.println("Add result = " +c);
	}
	
	public void sub()
	{
		int x=100, y=50, z;
		
		z=x-y;
		
		System.out.println("Sub result = "+ z);
	}

	public static void main(String[] args) 
	{
		
		Variables_Example2 v2=new Variables_Example2();
		
		v2.add();
		
		v2.sub();
	}

}
