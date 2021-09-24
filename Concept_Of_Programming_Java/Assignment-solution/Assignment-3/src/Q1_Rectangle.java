
/*
* Q1-Write a program to print the area of two rectangles having sides (4,5) 
    and (5,8) respectively by creating a class named 'Rectangle' with a 
    method named 'Area' which returns the area and length and breadth 
    passed as parameters to its constructor.
 */

public class Q1_Rectangle {
    @SuppressWarnings("resources")
    private float len;
    private float brd;

    // constructor
    public Q1_Rectangle(float len, float brd) {
        this.len = len;
        this.brd = brd;
    }

    // METHOD TO CALCULATE AREA
    float area() {
        float area = this.len * this.brd;
        return area;
    }

    public static void main(String[] args) {
        Q1_Rectangle r1 = new Q1_Rectangle(4, 5);
        Q1_Rectangle r2 = new Q1_Rectangle(5, 8);
        float area_r1 = r1.area( );
        float area_r2 = r2.area( );
        
        System.out.println("\nArea of Rectangle with two sides (4, 5) = " + area_r1);
        System.out.println("Area of Rectangle with two sides (5, 8) = " + area_r2);
        System.out.println();
    }

}