import java.util.Scanner;

/*
   3. Write a program to print the name, salary and date of joining of n 
      employees in a company. Use array of objects.
*/

public class Q3_Employee_info {
    private String name;
    private float salary;
    private String dt_of_join;
    Scanner sc = new Scanner(System.in);

    public Q3_Employee_info() {
        this.name = "unknown";
        this.salary = 0.0f;
        this.dt_of_join = "Not Known";
    }

    public void accept_Employee_info() {
        System.out.print("Name = ");
        this.name = sc.next();
        System.out.print("Salary = ");
        this.salary = sc.nextFloat();
        System.out.print("Date of Joining (format-DD-MM-YYYY) = ");
        this.dt_of_join = sc.next();
    }

    private void display() {
        System.out.printf("%-10s %-10.1f %-18s \n", this.name, this.salary, this.dt_of_join);

    }

    public static void main(String[] args) {

        int n = 2;
        Q3_Employee_info emp[] = new Q3_Employee_info[n];
        for (int i = 0; i < n; i++) {
            emp[i] = new Q3_Employee_info();
            System.out.println("Enter employee information of emp[" + i + "] :: ");
            emp[i].accept_Employee_info();
            System.out.println();
        }

        System.out.println("\n**************************************");
        System.out.printf("%-10s %-10s %-18s\n", "Name", "Salary ", "Date_of_joining");
        System.out.println("**************************************");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        System.out.println("**************************************");
        System.out.println();
    }

}
