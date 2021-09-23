
/*
  Q3- Write a program which prints "ONE", "TWO",... , "NINE", "OTHER" if 
   the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a 
   "nested-if" statement; (b) a "switch-case-default" statement.
*/

import java.util.Scanner;

public class Q3_Number_To_Word {

    public static void sol_if_else(int num) {
        String str;
        if (num == 1)
            str = "ONE";
        else if (num == 2)
            str = "";
        else if (num == 3)
            str = "THREE";
        else if (num == 4)
            str = "FOUR";
        else if (num == 5)
            str = "FIVE";
        else if (num == 6)
            str = "SIX";
        else if (num == 7)
            str = "SEVEN";
        else if (num == 8)
            str = "EIGHT";
        else if (num == 9)
            str = "NINE";
        else
            str = "OTHER";

        System.out.println("\nYour enterd number is::");
        System.out.println(" " + str);
        System.out.println();
    }

    public static void sol_switch_case(int num){
        String str;
        switch (num) {
            case 1:
                str = "ONE";
                break;
            case 2:
                str = "TWO";
                break;
            case 3:
                str = "THREE";
                break;
            case 4:
                str = "FOUR";
                break;
            case 5:
                str = "FIVE";
                break;
            case 6:
                str = "SIX";
                break;
            case 7:
                str = "SEVEN";
                break;
            case 8:
                str = "EIGHT";
                break;
            case 9:
                str = "NINE";
                break;
            default:
                str = "OTHER";

        }
        System.out.println("\nYour enterd number is::");
        System.out.println(" " + str);
        System.out.println();

    }

    public static void main(String[] args) {
        int num;
        System.out.print("\nPlease enter number.\n Number = ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.print(
                "\nEnter choice ==> \n  1::Solution with nested if else.\n  2::Solution with switch case.\nChoice = ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                sol_if_else(num);
                break;

            case 2:
                sol_switch_case(num);
          

        }
        sc.close();
    }

}
