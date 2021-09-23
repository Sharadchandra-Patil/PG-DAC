/*
   Q4. Write a program to calculate the sum of the first and the second last 
       digit of a 5 digit.
       E.g.- NUMBER : 12345 OUTPUT : 1+4=5
*/

import java.util.Scanner;

public class Q4_Sum_of_Specific_digit {
    public static void main(String[] args) {
        System.out.print("\nEnter five digit number.\nNumber = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 5)
                sum = sum + num % 10;
           
            num = num / 10;
        }
        
        // sum = ((num/10)%10) + ((num/10000)%10);
        
        System.out.printf("\nSum of first and second last digit is ==>\nSum = %d", sum);

        sc.close();
    }

}
