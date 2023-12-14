package Variables_Example;

public class Variables_Example3 
{
	int a=1;  //instance
	
	static int b=2; //static
	
	public void add()
	{
		int c;
		
		c=a+b;
		
		System.out.println(c);
	}
	
	public static void sub()
	{
		int c;
		
		Variables_Example3 v3=new Variables_Example3();
		
		c=b-v3.a;
		
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Variables_Example3 v3=new Variables_Example3();
		
		v3.add();
		
		System.out.println("================");

		sub();
	}

}
