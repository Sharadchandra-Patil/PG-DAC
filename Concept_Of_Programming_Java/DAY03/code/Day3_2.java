package sunbeam;


// UNBOXING 
//String to int ===> parseInt() 
// Integer to int ==> intValue() 

//String to float ==> parseFloat()
// Float to float ==> floatValue()


public class Day3_2
{
	public static void main(String args[])
	{
		Integer i = new Integer("55"); // non primitive
		// i as a object of Integer Class 
		int num=65; // primitive 
		int result;
		// non primitive to primitive (UNBOXING)
		result = num + i.intValue();
		System.out.println("Result ="+result);
		
		
		
		
		
	}
}


/*
public class Day3_2
{
	public static void main(String args[])
	{
		
		String str=args[0]; // Command line argument
		// It will come in String format 
		
		int num=35; // primitive 
		
		// non primitive to primitive (unboxing)
		// wrapper classes 
	
		int result = Integer.parseInt(str)+num;
		
		System.out.println("Result ="+result);
			
		
	}
}


*/

/*
public class Day3_2
{
	public static void main(String args[])
	{
		String str="55"; // string object  (non primitive)
		String name ="Akshita"; //string object (non primitive)
		
		int num=35; // primitive 
		
		int result = Integer.parseInt(str)+num;
		
		System.out.println("Result ="+result);
			
		
	}
}


*/