/*
    Q5. Create a class Vehicle. The class should have two fields-no_of_seats 
        and no_of_wheels. Create facilitator function to display number of 
        seats and number of wheels. Create two objects and initialize the 
        fields using constructor.

*/
public class Q5_Vehicle {
    private int no_of_seats;
    private int no_of_wheels;

    public Q5_Vehicle(int no_of_seats, int no_of_wheels) {
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    @Override
    public String toString() {
        return "Vehicle::[no_of_seats=" + no_of_seats + ", no_of_wheels=" + no_of_wheels + "]";
    }

    public static void main(String[] args) {
        Q5_Vehicle Bolero = new Q5_Vehicle(6, 4);
        Q5_Vehicle Ahoka_truck = new Q5_Vehicle(2, 6);

        System.out.println("Bolero-" + Bolero);
        System.out.println("Ashoka_Truck-" + Ahoka_truck);
        System.out.println();
    }

}
