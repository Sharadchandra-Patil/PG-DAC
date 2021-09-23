/*
   Q5. Accept 20 integer inputs from user and print the following:
       number of positive numbers , number of negative numbers
       number of odd numbers , number of even numbers
       number of 0s
*/

import java.util.Scanner;

public class Q5_Number_Seggregation {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int even_ct = 0, odd_ct = 0, positive_ct = 0, negative_ct = 0, zeros_ct = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Number[" + i + "] = ");
            arr[i] = sc.nextInt();

            if (arr[i] < 0)
                negative_ct++;
            else if (arr[i] == 0)
                zeros_ct++;
            else if (arr[i] > 0)
                positive_ct++;
            else if (arr[i] % 2 == 0)
                even_ct++;
            else if (arr[i] % 2 != 0)
                odd_ct++;
        }
        System.out.println("\nTotal negative numbers in given list =  " + negative_ct);
        System.out.println("Total zero numbers in given list =  " + zeros_ct);
        System.out.println("Total positive numbers in given list =  " + positive_ct);
        System.out.println("Total even numbers in given list =  " + even_ct);
        System.out.println("Total odd numbers in given list =  " + odd_ct);
        System.out.println();
    }

}
