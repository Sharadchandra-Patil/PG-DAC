package sunbeam;
/*
 *
import java.util.Scanner;

class Employee
{
	private int id; // data member 
	private int salary; // data member 
	Scanner sc=new Scanner(System.in);
	public int getId()  // getter  / inspectors 
	{
		return id;
	}
	public void setId(int id)  //setter / mutators 
	{
		this.id = id;
	}
	public int getSalary() 
	{
		return salary;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	void accept() // facilitator 
	{
		System.out.println("Enter ID ");
		this.id=sc.nextInt();
		System.out.println("Enter Salary ");
		this.salary=sc.nextInt();
	}
	
	void disp()  // facilitator 
	{ 
		System.out.println(" ID "+this.id+" Salary : "+this.salary);
	}
	
	
	void init(int id,int salary)
	{
		//id = 40  
		// saalry = 70000
		//e1.id=id // not allowed 
		//e1.salary = 70000 // not allowed 
		// store id and salary inside current object id and salary
		
		this.id=id;
		this.salary = salary;
	
	}
	
}

public class Day5_1 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		//e1.id=50; // private 
		//e1.salary=60000; //private 
		
		e1.init(40,70000); // id = 40 salary = 70000
		//using init() we are trying to inialize the object
		
		//EXPLICIT CALLING
		//IF WE CALL ANY FUNCTION WITH THE OBJECT NAME 
		//init() function is called explicitely
		//disp() function is called explicitely
		e1.disp();
		
		
		
		
		
	}
}

*/



/*
public class Day5_1 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		
		System.out.println(e1);
		System.out.println(e2);
		e1.accept(); // accept() is called upon e1 object
		//address of e1 object d7b1517 will be stored in this keyword 
		// this holds the address of current object 
		e1.disp(); // disp() called upon e1 object
		//this will hold e1 object address 
		//System.out.println("E1 object ID = "+e1.getId());
		e2.accept(); //accept() is called upon e2
		// this will hold e2 object address
		e2.disp();
		

	}

}

*/
