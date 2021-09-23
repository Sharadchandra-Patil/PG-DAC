package sunbeam;

public class Day3_3 
{

	public static void main(String[] args)
	{
		int num1=40; // PRIMITIVE 
		float fval=50.5f;
		double d=60.5;
		// PRIMITIVE TO NON PRIMITIVE BOXING
		// valueOf()
		String s1=String.valueOf(num1); // NON PRIMITIVE 
		String s2=String.valueOf(fval);
		String s3=String.valueOf(d);
		
		Integer i1 = new Integer(300); // NON PRIMITIVE 
		Float f1 = new Float(40.5f);
		Double d1=new Double(70.8);
		
		String str1=i1.toString(); // NON PRIMITIVE 
		String str2=f1.toString();
		String str3=d1.toString();
		
		
		
		
	}
	
}



/*
// primitive to non primitive
// Boxing
public class Day3_3 {

	public static void main(String[] args)
	{
		int num=50; // primitive
		String str=Integer.toString(num); //BOXING 
		//String str=num; // int to String is not allowed 
		
		System.out.println("Num "+num+" Str "+str);
		
		
	}

}
*/