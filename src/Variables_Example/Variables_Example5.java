package Variables_Example;

public class Variables_Example5 
{
	int a=10;     //i
	
	static int b=20;
	
	public void add()
	{
		int a=30, b=40;
		
		System.out.println(a);   //30
		
		System.out.println(b);   //40
		
		System.out.println(this.a);
		
		//System.out.println(this.b);
		
		System.out.println(Variables_Example5.b);
		
	}
	
	
	public static void sub()
	{
		int a=45, b=55;
		
		System.out.println(a);  //45
		
		System.out.println(b);  //55
		
		Variables_Example5 v5=new Variables_Example5();
		
		System.out.println(v5.a); //10
		
		System.out.println(Variables_Example5.b);
	}

	public static void main(String[] args) 
	{
		
		Variables_Example5 v5=new Variables_Example5();
		
		v5.add();
		
		System.out.println("=================");
		
		sub();
	}

}


//instance variables -- instance method --> direct, this

//instance variable -- static method --> object

//static variable -- instance method --> direct , this , class name

//static variable -- static method --> direct , class name
