package sunbeam;


// primitive type conversion 
// typecasting
// narrowing and widening concept 

public class day3_1
{

	public static void main(String[] args) 
	{
		int num;
		float fval;
		double d;
		double result;
		int res;
		num=Integer.parseInt(args[0]);
		fval=Float.parseFloat(args[1]);
		d=Double.parseDouble(args[2]);
		
		System.out.println("Num "+num);
		System.out.println("Fval "+fval);
		System.out.println("D  "+d);
		
		result = num+fval+d; // allowed 
		// int + float + double
		// resultant data double 
		
		
		//res = num+fval+d; // not allowed 
		res = (int)(num+fval+d); // allowed Narrowing 
		System.out.println("Result  "+result+" Res "+res);
		
	}
}

/*
public class day3_1
{

	public static void main(String[] args) 
	{
		double num1=60;
		int val;
		val=(int) num1; // double to int // Narrowing
		// typecasting is must
		System.out.println("Num1 = "+num1+" Val = "+val);
	}
}
*/
/*
public class day3_1
{

	public static void main(String[] args) 
	{
		int num= 50;
		double n1;
		//n1=num; // int to double (widening)
		// explicit type casting is optional  
		
		n1=(double)num;//widening
		// explicit typecasting 
		System.out.println("Num = "+num+" N1 ="+n1);

	}

}
*/
