package Method_Example;

public class Return_Type_Example1 
{
	
	public int add(int a, int b)
	{
		int c=a+b;
		
		return c;
	}
	
	public double sub(int a, double b, float c)
	{
		double d=(a+b)-c;
		
		return d;
	}
	
	public void mul(int a, int b)
	{
		int c=a*b;
		
		System.out.println(c);
	}
	
	public int div(int a, int b)
	{
		int c=a/b;
		
		return c;
		
	}
	
	
	public static void main(String[] args) 
	{
		
		Return_Type_Example1 rt=new Return_Type_Example1();
		
		int res=rt.add(25, 25);
		
		System.out.println("Add result = "+ res);
		
		double res1=rt.sub(10, 20.5, 45.5f);
		
		System.out.println("Sub result = "+res1);
		
		rt.mul(res, 5);
		
		int res2=rt.div(25, 5);
		
		System.out.println("Div result = "+ res2);
	}

}
