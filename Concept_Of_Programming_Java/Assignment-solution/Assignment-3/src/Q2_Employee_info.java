/*
    Q2. Write a program that would print the information (name, year of 
        joining, salary, address) of three employees by creating a class named 
        'Employee'. The output should be as follows:
        Name Year of joining Address
        EMP1 2000 Pune
        EMP2 2002 Pune
        EMP3 2008 Mumbai

*/
public class Q2_Employee_info {

    private String name;
    private int year;
    private String address;
    
    public Q2_Employee_info(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    private void display() {
        System.out.printf("%-6s %-16s %-8s \n",this.name, this.year, this.address);

    }
    public static void main(String[] args) {
        Q2_Employee_info emp1 = new Q2_Employee_info("EMP1", 2000, "Pune");
        Q2_Employee_info emp2 = new Q2_Employee_info("EMP2", 2002, "Pune");
        Q2_Employee_info emp3 = new Q2_Employee_info("EMP3", 2008, "Mumbai");

        System.out.printf("\n%-6s %-16s %-8s\n","Name","Year Of Joining", "Address");
        emp1.display();
        emp2.display();
        emp3.display();
        System.out.println();
    }

}
