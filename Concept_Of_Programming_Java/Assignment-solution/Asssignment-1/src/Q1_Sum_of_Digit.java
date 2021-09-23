

import java.util.Scanner;

/**
 * Q1 - Write a Java program that reads an integer between 0 and 1000 and adds
 * all the digits in the integer.
 */
public class Q1_Sum_of_Digit {

    public static void digit_sum(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        System.out.println("\n** Sum of digit is = " + sum);

    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("\nPlease enter number from 0 to 1000 to calculate sum of digit.\nNumber = ");
            int number = sc.nextInt();

            if (number < 0 || number > 1000) {
                System.out.println("Number is not in range of 0 to 1000.");
            } else {
                digit_sum(number);
            }

            System.out.print("\nThank you for using console application. Please press ==> \n  0 :: Exit  \n  1 :: Calculate Digit sum of number\nChoice = ");
            choice = sc.nextInt();
            
        } while (choice != 0);
       
        sc.close();
    }
}