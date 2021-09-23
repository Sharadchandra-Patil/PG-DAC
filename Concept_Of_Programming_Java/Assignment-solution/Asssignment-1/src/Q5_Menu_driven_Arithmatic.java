/*
Q5. Write a program to perform arithmetic operations, by accepting 
  numbers from user and the choice from user. Write a menu driven 
  program to perform operations
*/


import java.util.Scanner;

public class Q5_Menu_driven_Arithmatic {
    public static void main(String[] args) {
        {
            int no1, no2, ans, choice;
            Scanner sc = new Scanner(System.in);

            do {
                System.out.print("\nEnter Num1  :: ");
                no1 = sc.nextInt();

                System.out.print("\nEnter Num2  :: ");
                no2 = sc.nextInt();

                System.out.println("\n 1. Add \n 2. Minus \n 3. Div \n 4. Multiply ..");
                System.out.print("\n Enter your Choice :: ");
                choice = sc.nextInt();

                ans = 0;

                switch (choice) {
                    case 1: // add
                        ans = no1 + no2;
                        break;
                    case 2: // minus
                        ans = no1 - no2;
                        break;
                    case 3: // div
                        ans = no1 / no2;
                        break;
                    case 4: // multiply
                        ans = no1 * no2;
                        break;
                }
                System.out.printf("\nAns=%d", ans);

                System.out.print("\nEnter 1 to continue or 0 to exit :: ");
                choice = sc.nextInt();

            } while (choice != 0);

            sc.close();

        }

    }
}
