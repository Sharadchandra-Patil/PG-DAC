
/* 
  Print the area and circumference of a circle, given its radius.
*/

import java.util.Scanner;

public class Q2_Circumference_of_Circle {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("\nEnter the radius of circle.\nRadius = ");
          float rad = sc.nextFloat();
          
          System.out.printf("\nArea of circle = %.3f",(Math.PI*rad*rad));
          System.out.printf("\nCircumference of circle = %.3f \n\n",(2*Math.PI*rad));
          
          sc.close();
          
          
      }
    
}
