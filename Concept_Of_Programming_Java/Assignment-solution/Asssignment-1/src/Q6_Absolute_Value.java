/*
Q6. Write a program to print absolute value of a number entered by user. 
   E.g.-
   INPUT: 1 OUTPUT: 1
   INPUT: -1 OUTPUT: 1
*/



import java.util.Scanner;

public class Q6_Absolute_Value {
    public static void main(String args[])  
    {  
        System.out.print("\n\nPlease enter any integer value to find its absolute value \nNumber = ");  
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        System.out.println("Absolute value of number = " + Math.abs(x)); 
        System.out.println();
        
        sc.close();
    }  
}  
    

