package Method_Example;

public class Parameter_Example1 
{
	
	public void add(float a, int b, double c)
	{
		double res=a+b+c;
		
		System.out.println("Add result = "+ res);
	}
	
	public void sub(float a, double b)
	{
		double res=b-a;
		
		System.out.println("Sub result = "+ res);
	}
	
	public void mul(int a, float b, double c, float d)
	{
		double res=a*b*c*d;
		
		System.out.println("Mul result = "+ res);
	}
	
	public void div(int a, double b)
	{
		double res=a/b;
		
		System.out.println("Div result = "+ res);
	}

	public static void main(String[] args) 
	{
		Parameter_Example1 p1=new Parameter_Example1();
		
		p1.add(25.5f,10, 25.5);
		
		p1.sub(25, 40);
		
		p1.mul(5, 5.5f, 7.5, 6.5f);
		
		p1.div(10, 2.5);

	}

}
