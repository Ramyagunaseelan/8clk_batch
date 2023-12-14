package Conditional_Statement;

public class Switch_Case_Example {

	public static void main(String[] args) 
	{
		String browser="safari";
		
		switch(browser)
		{
		
		case "chrome" :
			
			System.out.println("Open chrome browser");
			break;
			
		case "firefox" :
			
			System.out.println("Open firefox browser");
			break;
			
		case "opera":
			
			System.out.println("Open opera browser");
			break;
			
		case "ie":
			
			System.out.println("Open ie browser");
			break;
			
		case "edge" :
			
			System.out.println("Open edge browser");
			break;
			
		default:
			
			System.out.println("Given browser name is wrong");
		
		}

	}

}
