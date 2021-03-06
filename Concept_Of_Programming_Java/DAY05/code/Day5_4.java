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
	//one or more number of types of constructor
	// Constructor Overloading 
	
	Student() // PARAMETERLESS CONSTRUCTOR (USER DEFINED DEFAULT CONSTRUCTOR)
	{
		//System.out.println("Inside Parameterless Constructor");
		//this.id=1;
		//this.rollno=1;
		//this.marks=1;
		//this.name="DEFAULT";
		//this.per=1.1f;
		
		this(1,1,1,"DEFAULT",1.1f);
		
		
		
		// it will give a call to paramatrized constructor
		// indirectly calling paramatrized contructor
		//from parameterless constructor
		//calling one constr from another
		//CONSTRUCTOR CHAINING 
	}
	
	//new Student(10,20,80,"Abc",80.5f);
	// paramatrized constructor 
	Student(int id,int rollno,int marks,String name,float per)
	{
		
		this.id=id;
		this.rollno=rollno;
		this.marks=marks;
		this.name=name;
		this.per=per;

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
	
	void disp()
	{
		System.out.println("Student Data :");
		System.out.println("Name : "+this.name+" ID : "+this.id+" Rollno :"+this.rollno);
		System.out.println("Marks: "+this.marks+" Percentage :"+this.per);
	}
	

}

public class Day5_4 {

	public static void main(String[] args) 
	{
		Student st1=new Student(); // call to parameterless constructor
		st1.disp();
				

	}

}
