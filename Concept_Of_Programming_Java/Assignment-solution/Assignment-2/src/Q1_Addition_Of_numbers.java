import java.util.Scanner;


/*
   Q1. Program to display addition of numbers from a lower bound to an 
       upper bound using a while-loop.
*/

public class Q1_Addition_Of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter lower bound number.\nLower Bound = ");
        int first = sc.nextInt();
        System.out.print("\nPlease enter upper bound number.\nUpper Bound = ");
        int last = sc.nextInt();

        int sum = 0;

        while (first <= last) {
            sum += first;
            first++;
        }

        System.out.println("\nSum of numbers from lower to upper bound = " + sum);
        System.out.println();
        sc.close();

    }

}