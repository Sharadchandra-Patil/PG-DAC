package sunbeam;

import java.util.Scanner;

//class classname
//{  data members , member functions }


// created a class employee
class Employee
{
	private int empid; // DATA MEMBER
	private int salary; // DATA MEMBER 
	Scanner sc=new Scanner(System.in);
	public void accept() // MEMBER FUNCTION
	{
		System.out.println("Enter Emp ID :");
		empid=sc.nextInt();
		System.out.println("Enter Salary : ");
		salary=sc.nextInt();
	}
	public void disp() // MEMBER FUNCTION
	{
		System.out.println("EmpID = "+empid+" Salary ="+salary);
	}
	
}

class Day4_1
{

	public static void main(String[] args) 
	{
		// create object 
		// object /instance
		// used to access the members of class
		//classname objectname = new classname(); 
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		// Employee e1;
		// e1=new Employee(); 
		System.out.println("E1 = "+e1);
		System.out.println("E2 = "+e2);
		
		// when you print object of class it actually calls toString() function
		//E1 = sunbeam.Employee@d7b1517
		//E2 = sunbeam.Employee@23223dd8
		// hashcode()
		//getClass().getName()+"@"+Integer.toHexString(hashCode())
		
		e1.accept(); // accept() is called upon e1 object
		e1.disp(); //disp() is called upon e1 
		e2.accept(); //accept() is called upon e2
		e2.disp(); //disp() is called upon e2
		
	
	}

}

