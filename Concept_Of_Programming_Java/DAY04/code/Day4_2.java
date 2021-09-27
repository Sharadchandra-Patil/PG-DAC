package sunbeam;

import java.util.Scanner;

class Employee
{
	private int empid; // DATA MEMBER
	private int salary; // DATA MEMBER 
	private String name;// DATA MEMBER 
	Scanner sc=new Scanner(System.in);
	public void accept() // MEMBER FUNCTION
	{
		System.out.println("Enter Emp ID :");
		empid=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary=sc.nextInt();
		System.out.println("Enter Name : ");
		name=sc.next();
		
	}
	public void disp() // MEMBER FUNCTION
	{
		System.out.println("EmpID = "+empid+" Salary ="+salary+" Name = "+name);
	}
	
}


public class Day4_2 {

	public static void main(String[] args)
	{
		//Employee e;
		//e=new Employee(); 
		//System.out.println("E object Info : "+e);
		//Employee e=new Employee(); // Valid 
		
		//Employee e=null; 
		//System.out.println("E object Info : "+e);
		// e is a null reference variable 
		// NULL OBJECT 
		//e=new Employee(); //redefining of e object 
		
		//e.disp();
		//System.out.println("Accepting the data for e object");
		//e.accept();
		//e.disp();
		
		//Employee e; 
		//System.out.println("E object Info : "+e); //Error
	}

}
