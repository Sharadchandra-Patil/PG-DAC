import java.util.Scanner;

/*
  Q3. 
    A school has following rules for grading system:
    a. Below 25 - F
    b. 25 to 45 - E
    c. 45 to 50 - D
    d. 50 to 60 - C
    e. 60 to 80 - B
    f. Above 80 - A
    Ask user to enter marks and print the corresponding grade.

*/

public class Q3_Grading_System {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter marks obtained in subject.\nSubject Mark = ");
        int s = sc.nextInt();

        if (s < 25) {
            System.out.println(
                    "Sorry dear..\nYou have not crossed passing line...\nDon't loose hope.Work hard next time..");
            System.out.println("** Your subject grade = F **");
        } else if (s >= 25 && s < 45)
            System.out.println("** Your subject grade = E **");
        else if (s >= 45 && s < 50)
            System.out.println("** Your subject grade = D **");
        else if (s >= 50 && s < 60)
            System.out.println("** Your subject grade = C **");
        else if (s >= 60 && s < 80)
            System.out.println("** Your subject grade = B **");
        else if (s >= 80 && s < 100)
            System.out.println("** Your subject grade = A **");

    }

}
