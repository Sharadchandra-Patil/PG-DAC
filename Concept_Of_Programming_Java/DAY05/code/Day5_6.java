package sunbeam;



class Test
{
	void sum(int a,int b) // non static 
	{
		System.out.println("Addition = "+(a+b));
	}
	
	
	static void sub(int n1,int n2) // static
	{
		System.out.println("Subtraction = "+(n1-n2));
	}
}


class Day5_6
{
	public static void main(String[] args)  // static 
	{
		//sum(50,50); // NOT ALLOWED 
		Test tobj=new Test();
		tobj.sum(50, 50); //calling function on instance
		//sub(90,30); // NO
		//Test.sum(50,20);//NO 
		tobj.sub(90,30);//VALID
		Test.sub(70,20); // VALID 
		
	
	}
}


// NON STATIC MEMBER FUNCTIONS ARE CALLED AS INSTANCE METHODS
// THEY ARE DESIGNED TO BE CALLED UPON OBJECT

// STATIC MEMBER FUCNTIONS ARE CALLED AS CLASS LEVEL METHODS
// THEY ARE DESIGNED TO BE CALLED UPON CLASSNAME



//Requirement , We donot want to create instance of class 
// without creating instance of class , we wish to call sum() 

/*
public class Day5_6
{
	public static void sum(int a,int b) //  static function
	{
		System.out.println("Addition = "+(a+b));
	}
	
	public void sub(int n1,int n2) //non static member function
	{
		System.out.println("Subtraction = "+(n1-n2));
	}
	public static void main(String[] args)  // static 
	{
		sum(50,40); // VALID  
		Day5_6.sum(90,70); // VALID 
		//sub(50,10); //NOT VALID (non static )
		Day5_6 d1=new Day5_6();
		d1.sub(50,10); //VALID 
		

	}

}

*/





/*
//Rule :
// if we declare any member function as static then
// we can give a call to that member function 
//without creating object of the class(i.e. with the help of classname)

class Demo
{
	//Function overloading 
	static void sum(int a,int b) //  static member function
	{
		System.out.println("Addition = "+(a+b));
	}
	
	static void sum(int n1,int n2,int n3) //static member function
	{
		System.out.println("Addition of three numbers = "+(n1+n2+n3));
	}
}

public class Day5_6
{
	
	public static void main(String[] args)  // static 
	{
		Demo dobj=new Demo();
		dobj.sum(50,30); // non static member functions are called with the help of object name
		dobj.sum(40,50,60);
		
		
		Demo.sum(300, 200);
		Demo.sum(300,400,500);

	}

}

*/




/*
//Rule : static functions can give a call to static function directly within same class
public class Day5_6
{
	public static void sum(int a,int b) //  static function
	{
		System.out.println("Addition = "+(a+b));
	}
	public static void main(String[] args)  // static 
	{
		sum(50,30);

	}

}

*/



/*
public class Day5_6
{
	void sum(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	public static void main(String[] args) 
	{
		Day5_6 dob=new Day5_6();
		dob.sum(50,30);

	}

}


*/