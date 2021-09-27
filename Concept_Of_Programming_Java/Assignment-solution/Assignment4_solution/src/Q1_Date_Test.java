
/*
  1. Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int). Provide a constructor that initializes the three instance variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. Provide a method displayDate that displays the month, day and year separated by forward slashes (/).Write a test application named DateTest that demonstrates class Date’s capabilities.
 */
class Date {
  private int month;
  private int day;
  private int year;

  public Date() {
    this(12, 8, 1947);
  }

  public Date(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void displayDate(){
    System.out.println("Date is "+ this.day +"/" + this.month +"/" + this.year);
  }

}

public class Q1_Date_Test{
  public static void main(String[] args) {
    Date d1 = new Date();
    d1.displayDate();

    Date d2 =new Date(9, 23, 2021);
    d2.displayDate();

    d1.setDay(12);
    int dt = d1.getDay();
    System.out.println("d1.day = "+dt);
    d1.setMonth(7);
    d1.setYear(1987);
    d1.displayDate();

    d2.setYear(2020);
    d2.displayDate();
  }
}