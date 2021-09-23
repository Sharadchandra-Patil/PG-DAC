import java.util.Scanner;

/*
  2. Display sum of the odd numbers and the even numbers from a lower 
     bound to an upper bound.
*/
public class Q2_Sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter lower bound number.\nLower Bound = ");
        int first = sc.nextInt();
        System.out.print("\nPlease enter upper bound number.\nUpper Bound = ");
        int last = sc.nextInt();

        int sum_odd = 0, sum_even = 0;

        while (first <= last) {
            if (first % 2 == 0)
                sum_even += first;
            else
                sum_odd += first;

            first++;
        }

        System.out.println("\nSum of even numbers from lower to upper bound = " + sum_even);
        System.out.println("\nSum of odd numbers from lower to upper bound = " + sum_odd);
        System.out.println();
        sc.close();

    }

}
