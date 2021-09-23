package sunbeam;

public class Day2_3 {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		int num3;
		int res;
		//num1=args[0]; //args[0] will hold some string
		//error : can not convert string to int 
		//num2=args[1];  //args[1] will hold some String 
		//error : can not convert string to int 
		
		//have to convert String to int
		// parseInt();
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		num3=Integer.parseInt(args[2]);
		res = num1+num2+num3;
		
		System.out.println("Num1 Value = "+num1);
		System.out.println("Num2 Value = "+num2);
		System.out.println("Num3 Value = "+num3);
		System.out.println("Result = "+res);
		
		//static int parseInt(String s);
		
		
		
		
	}

}
