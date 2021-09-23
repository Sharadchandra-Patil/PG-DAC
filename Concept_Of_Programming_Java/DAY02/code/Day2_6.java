package sunbeam;

import java.util.Scanner;


public class Day2_6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter Your name : ");
		str = sc.next();
		
		System.out.println("Hello  "+str);
		sc.close();
	}

}
// ch = >65 && ch <=90 UPPER CASE
// ch >=97 && ch <=122 Lower case
//ch >=48 && ch <=57 Numeric 


/*
public class Day2_6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter Character Value : ");
		ch=sc.next().charAt(0);
		
		
		if(ch>=65 && ch<=90)
			System.out.println("Upper Case Letter");
		else
			if(ch>=97 && ch<=122)
				System.out.println("Lower Case Letter");
			else
				if(ch>=48 && ch<=57)
				System.out.println("Digit");
				else
					System.out.println("Special Symbol");
				
		
		// Akshita String 
		// charAt(0) A 
		
	}
}


*/




// based on choice
// Menu Driven Program
// Switch case 
// do...while 

//1. Add 2. Sub 3.Mul 4. Div 5. Mod 


/*

public class Day2_6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Enter First Number :");
		int n1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int n2=sc.nextInt();
		do
		{
			System.out.println("Enter Choice: 0.Exit 1. Add 2. Sub 3.Mul 4. Div 5. Mod ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Addition = "+(n1+n2));
			break;
			case 2:
				System.out.println("Sub = "+(n1-n2));
			break;
			case 3:
				System.out.println("Mul = "+(n1*n2));
			break;
			case 4:
				System.out.println("Div = "+(n1/n2));
			break;
			case 5:
				System.out.println("Mod = "+(n1%n2));
			break;
			}
		}while(ch!=0);
		
	}
}


*/
