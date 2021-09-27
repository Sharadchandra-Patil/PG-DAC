
/*
    Q2_Employee. Create a class Employee having name and id as fields. Declare static variable with data type string as name of company assign name as “Sunbeam” for all objects. Declare a two-parameter constructor with parameters named n and i. Declare an instance method display and print the output on the console. Create the first object of the class and pass the two arguments with type string and int. all the display method using reference variable e. Similarly create one more object with different name and id and call display method.
*/

public class Q2_Employee {
    public static String company_name = "Sunbeam";
    private String emp_name;
    private int emp_id;

    public Q2_Employee(String emp_name, int emp_id) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
    }

    public void display() {
        System.out.println("[Employee name = " + this.emp_name + "  Employee ID = " + this.emp_id + "  Company name = "
                + Q2_Employee.company_name + "]");
    }

    public static void main(String[] args) {
        Q2_Employee e1 = new Q2_Employee("sharad", 100);
        e1.display();

        Q2_Employee e2 = new Q2_Employee("Anita", 101);
        e2.display();

    }

}
