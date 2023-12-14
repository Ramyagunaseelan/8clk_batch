package Basics;

public class Fifthpgm 
{
	public void add()  //instance
	{
		System.out.println("Add result ="+(5+5));
	}
	
	public static void sub()  //static
	{
		System.out.println("Sub result ="+(10-7));
	}
	
	public void mul()
	{
		System.out.println("Mul result ="+ (5*4));
	}

	public static void div()
	{
		System.out.println("Div result ="+ (50/5));
	}
	
	public static void main(String[] args) 
	{
		div();
		
		new Fifthpgm();  //name less Object
		
		Fifthpgm ff=new Fifthpgm(); //named Object
		
		ff.mul();
	}
}

//static method --> static method --> direct

//instance method ---> static method --> using Object
