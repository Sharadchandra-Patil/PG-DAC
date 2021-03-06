package sunbeam;

import java.util.Scanner;



class Employee
{
	private int id;
	private String name;
	private int salary;
	Scanner sc=new Scanner(System.in);
	Employee() // parameterless constructor 
	{
		this.id=1;
		this.name="DEFAULT";
		this.salary=1;
		// this(1,"DEFAULT",1); //constructor chaining 
	}
	Employee(int id, String name, int salary)  // paramatrized Constructor
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	void accept()
	{
		System.out.println("Enter ID ");
		this.id=sc.nextInt();
		System.out.println("Enter Name ");
		this.name=sc.next();
		System.out.println("Enter Salary ");
		this.salary=sc.nextInt();
		
	}
	
	void disp()
	{
		System.out.println("ID  "+this.id+" Name : "+this.name+" Salary "+this.salary);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

	
	
}


public class Day5_5 
{

	public static void main(String[] args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		// Array of objects 
		Employee e[]=new Employee[4];  //array of objects
		
		for(i=0;i<4;i++)
		{
			e[i]=new Employee(); // to allocate memory to heap
		}
		
		for(i=0;i<4;i++)
		{
			System.out.println("Enter Names :");
			
			//e[i].name=sc.next(); // PRIVATE 
			String str=sc.next();
			e[i].setName(str);
		}
	}
}


/*


public class Day5_5 
{

	public static void main(String[] args)
	{
		// Array of objects 
		Employee e[]=new Employee[4]; //to create reference 
		// four reference of type Employee 
		int i;
		//to avoid NullPointerException
		// intialize it using new keyword
		
		for(i=0;i<4;i++)
		{
			e[i]=new Employee(); // to allocate memory to heap
		}
		for(i=0;i<4;i++)
		{
			e[i].accept();
		}
		
	//for(i=0;i<4;i++)
		//{
			//e[i].disp(); //call to disp() 
			//System.out.println(e[i]); // toString()
		//}	
		
		for(i=0;i<4;i++)
		{
			System.out.println("ID = "+e[i].getId());
		}
		
		e[0].setSalary(60000);
		
		for(i=0;i<4;i++)
		{
			System.out.println("Salary = "+e[i].getSalary());
		}
		
		
	}
}


*/




/*
public class Day5_5 {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.disp();
		
		Employee e2=new Employee(20,"Akshita",50000);
		e2.disp();
		
		Employee e3=new Employee();
		e3.accept();
		e3.disp();
	}

}

*/
