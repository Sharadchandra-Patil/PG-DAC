package sunbeam;

import java.util.Scanner;


class Student
{
	private int id;
	private int rollno;
	private char grade;
	private String name;
	private float per;
	@Override
	public String toString() {
		return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
	
	
	
	
}

public class Day4_3
{

	public static void main(String[] args) 
	{
	}
	
}



/*
class Employee
{
	private int id;
	private int salary;
	private String name;
	private char grade;
	private int number;
	Scanner sc=new Scanner(System.in);
	
	//getter
	int getID()
	{
		return id;
	}
	int getNumber()
	{
		return number;
	}
	int getSalary() 
	{
		return salary;
	}
	
	String getName()
	{
		return name;
	}
	char getGrade()
	{
		return grade;
	}
	void accept()
	{
		System.out.println("Enter ID :");
		id=sc.nextInt();
		System.out.println("Enter Salary:");
		salary=sc.nextInt();
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Grade :");
		grade=sc.next().charAt(0);
		System.out.println("Enter Number :");
		number=sc.nextInt();
		
	}
	void disp()
	{
		System.out.println("ID ="+id);
		System.out.println("Salary ="+salary);
		System.out.println("Name  ="+name);
		System.out.println("Grade ="+grade);
		System.out.println("Number ="+number);
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	void setSalary(int salary)
	{
		this.salary=salary;
	}
	

	
	void setId(int id)
	{
		this.id=id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	void setGrade(char grade)
	{
		this.grade=grade;
	}
	
	void setNumber(int number)
	{
		this.number=number;
	}
	
}

public class Day4_3
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		//System.out.println(e1); //call to toString()
		e1.accept();
		//e1.disp();
		System.out.println("ID ="+e1.getID());
		System.out.println("Before Salary="+e1.getSalary());
		
		e1.setSalary(80000); //e1 calling object / current object 
		// e1 is current object 
		// store address of current object (this)
		System.out.println("After Salary="+e1.getSalary());
	}
}
	

*/

/*
public class Day4_3
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		
		e1.accept();
		System.out.println("Information about Object : "+e1);
		// e1 object while printing it gives a call to , toString()
		
		e1.disp();
	
		System.out.println("Id = "+e1.getID()+" Number = "+e1.getNumber());
	}

}
*/