package Variables_Example;

public class Variables_Example6 
{
	int a=10; //i
	
	static int b=20; //s
	
	
	public void add()
	{
		int c=30, d=40;  //local v
		
		System.out.println(d);
		
		System.out.println(c);
		
		System.out.println(b);  //s-i-d
		
		System.out.println(a); //i-i-d
	}
	
	
	public static void sub()
	{
		int e=50, f=60;
		
		System.out.println(f);
		
		System.out.println(e);
		
		System.out.println(b);
		
		Variables_Example6 v4=new Variables_Example6();
		
		System.out.println(v4.a);
		
		
	}

	public static void main(String[] args) 
	{
		
		Variables_Example6 v4=new Variables_Example6();
		
		v4.add();
		
		System.out.println("==================");
		
		sub();
	}

}
