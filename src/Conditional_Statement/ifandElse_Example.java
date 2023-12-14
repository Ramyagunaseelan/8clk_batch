package Conditional_Statement;

import java.util.Scanner;

public class ifandElse_Example {

	public static void main(String[] args) 
	{
		System.out.println("Enter the student mark : ");
		
		Scanner sc=new Scanner(System.in);
		
		int stuMark=sc.nextInt();
		
		if(stuMark>=50)
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}

	}

}
