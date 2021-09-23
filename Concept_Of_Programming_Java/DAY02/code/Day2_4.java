package sunbeam;

// %10d ===> width specifier 
//space of 10 while printing the data on output screen


// %9.2f ===> it sets width of 9 and after decimal 2 digits 


public class Day2_4 {

	public static void main(String[] args) 
	{
		int num=55;
		System.out.printf(" Num = %d",num);
		System.out.printf("\nNum = %20d",num);
		
		float fval=5.4f;
		System.out.printf("\nF Value  = %f",fval);
		System.out.printf("\nF Value  = %.3f",fval);
		System.out.printf("\nF Value  = %9.2f",fval);
		
		System.out.printf("\n PI = %f",Math.PI);
		System.out.printf("\n PI = %.2f",Math.PI);
		
		System.out.printf("\nNum = %-20d fval = %.3f",num,fval);
		// 5 5 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  // -20d
		//  _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ 5 5  // 20d
	}
}





/*
public class Day2_4 {

	public static void main(String[] args) 
	{
		System.out.println('a');
		System.out.println((int)'a');
	}
}

*/