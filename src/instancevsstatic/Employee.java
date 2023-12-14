package instancevsstatic;

public class Employee {
	
	int empid;
	
	String empname;
	
	int salary;
	
	static String compname="TCS";
	
	public Employee(int empid, String empname, int salary)
	{
		this.empid=empid;
		
		this.empname=empname;
		
		this.salary=salary;
		
		
	}
	
	public void printEmpDetails()
	{
		System.out.println("Empid = "+ this.empid);
		
		System.out.println("Emp name = "+ this.empname);
		
		System.out.println("Emp Salary = "+ this.salary);
		
		System.out.println("Emp company name = "+ Employee.compname);
		
		System.out.println("******************************");
	}

	public static void main(String[] args) 
	{
		Employee ram=new Employee(1,"Ram",50000);
		
		ram.printEmpDetails();
		
		Employee lavnya=new Employee(2,"Lavnya",60000);
		
		lavnya.printEmpDetails();
		
		
		Employee ramesh=new Employee(3,"Ramesh",70000);
		
		ramesh.printEmpDetails();
		
		

	}

}
