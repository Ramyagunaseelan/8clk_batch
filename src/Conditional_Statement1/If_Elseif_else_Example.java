package Conditional_Statement;

public class If_Elseif_else_Example {

	public static void main(String[] args) {
		
		int stuMark = 88;
		
		if(stuMark<50) // 76<50
		{
			System.out.println("Fail");
		}
		
		else if(stuMark == 50)  //76 ==50
		{
			System.out.println("Just Pass");
		}
		
		else if(stuMark>50  && stuMark<60)   //76>50  && 76<60
		{
			System.out.println("Second Class");
		}
		
		else if(stuMark>=60 && stuMark<70) //76>=60  && 76<70
		{
			System.out.println("First Class");
		}
		
		else if(stuMark>=70 && stuMark<80) //76>=70  && 76<80
		{
			System.out.println("Good");
		}
		
		else if(stuMark>=80 && stuMark<90)
		{
			System.out.println("Very Good");
		}
		
		else if(stuMark>=90  && stuMark<=100)
		{
			System.out.println("Excellent");
		}
		
		else
		{
			System.out.println("Invalid mark");
		}
	}

}
