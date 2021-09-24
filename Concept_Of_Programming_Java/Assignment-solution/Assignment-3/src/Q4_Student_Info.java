import java.util.Scanner;

/*
    Q4. Create a class 'Student' with three data members which are name, age 
        and address. The constructor of the class assigns default values name 
        as "unknown", age as '0' and address as "not available". It has two 
        members with the same name 'setInfo'. First method has two 
        parameters for name and age and assigns the same whereas the 
        second method takes has three parameters which are assigned to 
        name, age and address respectively. Print the name, age and address 
        of 10 students.
*/

public class Q4_Student_Info {
    private String name;
    private int age;
    private String address;
    Scanner sc = new Scanner(System.in);

    public Q4_Student_Info() {
        this.name = "unknown";
        this.age = 0;
        this.address = "Not Available";
    }

    public void set_info(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void set_info(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private void display() {
        System.out.printf("%-10s %-5d %-10s \n", this.name, this.age, this.address);

    }

    public static void main(String[] args) {

        int n = 10;
        Q4_Student_Info student[] = new Q4_Student_Info[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Q4_Student_Info();
        }

        student[0].set_info("Sharad", 34, "Sangli");
        student[2].set_info("Smita", 30, "Kolhapur");
        student[3].set_info("Ganesh", 24, "Mumbai");
        student[4].set_info("Dada", 14);
        student[6].set_info("Anita", 24, "Sangli");


        System.out.println("\n*******************************");
        System.out.printf("%-10s %-5s %-10s\n", "Name", "Age ", "Address");
        System.out.println("*******************************");

        for (int i = 0; i < n; i++) {
            student[i].display();
        }

        System.out.println("******************************");
        System.out.println();
    }

}
