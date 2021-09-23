/*
  Q4. Take integer inputs from user until he/she presses q ( Ask to press q 
      to quit after every integer input ). Print average and product of all 
      numbers.
*/

import java.util.Scanner;

public class Q4_Average_product_Of_numbers {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, product = 1, count = 0;
        float avg = 0.0f;

        while(true) {
            System.out.print("\nPlease enter number if we want to continue or...\nPress 'q' to exit application...\nNext Number = ");
            String str = sc.next();
            if(str.charAt(0)=='q' || str.charAt(0)=='Q')
                break;
            int num = Integer.valueOf(str);
            count++;
            sum += num;
            avg = sum / count;
            product *= num;

        } 

        System.out.println("\nAverage of all numbers entered = " + avg);
        System.out.println("Product of all numbers entered = " + product);
        System.out.println();
    }

}
