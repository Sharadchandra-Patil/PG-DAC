package sunbeam;

import java.util.Scanner;

class Student
{
	private int id;
	private int rollno;
	private int marks;
	private String name;
	private float per;
	
	Scanner sc=new Scanner(System.in);
	
	Student() // PARAMETERLESS CONSTRUCTOR (USER DEFINED DEFAULT CONSTRUCTOR)
	{
		System.out.println("Inside Parameterless Constructor");
		this.id=1;
		this.rollno=1;
		this.marks=1;
		this.name="DEFAULT";
		this.per=1.1f;
		
	}
	
	

	void disp()
	{
		System.out.println("Student Data :");
		System.out.println("Name : "+this.name+" ID : "+this.id+" Rollno :"+this.rollno);
		System.out.println("Marks: "+this.marks+" Percentage :"+this.per);
	}
	

	@Override
	public String toString() 
	{
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
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
	void accept() //void accept(this) //current object address
	{
		System.out.println("Enter ID :");
		this.id=sc.nextInt();
		System.out.println("Enter Roll no :");
		this.rollno=sc.nextInt();
		System.out.println("Enter Marks:");
		this.marks=sc.nextInt();
		System.out.println("Enter Name:");
		this.name=sc.next();
		System.out.println("Enter Percentage:");
		this.per=sc.nextFloat();
	}
	
	

}



public class Day5_2 
{

	public static void main(String[] args)
	{
		Student st1=new Student();
		Student st2=new Student();
		// partial information
		// Rollno Name Marks 
		
		//System.out.println("Rollno : "+st1.getRollno());
		//System.out.println("Name : "+st1.getName());
		//System.out.println("Marks: "+st1.getMarks());
		
		//System.out.println(st1); // it implicitely calls toString()
		//System.out.println(st1.toString()); // explicit ca;;
		
		
	}
	
}

/*

public class Day5_2 
{

	public static void main(String[] args)
	{
		Student st1=new Student(); 
		st1.disp();
		st1.accept();
		st1.disp();
		
	}
}
*/

/*
public class Day5_2 
{

	public static void main(String[] args)
	{
		Student st1=new Student(); // call to parameterless constructor
		System.out.println("ID of st1 = "+st1.getId());
		st1.setId(50);
		System.out.println("ID of st1 = "+st1.getId());
	}
}
*/



/*

public class Day5_2 
{

	public static void main(String[] args)
	{
		Student st1=new Student();
		//Constructor gets called implicitely whenever we create object
		//we can not call constructor Explicitely
		//st.Student(); //NOT ALLOWED // ERROR 
		
		st1.disp(); // explicit 
		Student st2=new Student();
		st2.disp();
		//Student st3=st1; // ok 
		//st3.disp(); //ok 
		

	}

}
*/

