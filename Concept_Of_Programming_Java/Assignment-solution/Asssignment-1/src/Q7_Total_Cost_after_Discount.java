/*
Q7.   A shop will give discount of 10% if the cost of purchased quantity is 
     more than 1000.Ask user for quantity and suppose, one unit will cost 
     100. Calculate and print total cost for user.
*/



import java.util.Scanner;

public class Q7_Total_Cost_after_Discount {
    public static void main(String[] args) {
        System.out.println("\n\n                    ** Billing **\n\nIn our shop each comodity costs 100 and if you purchase over Rs.1000 you will get 10% discount.... ");
        System.out.print("\nPlease tell number of commodities you have purchased...\nUnits purchased = ");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();

        int cost = units*100;
        int dis_cost = cost - (cost*10/100);

        if(cost > 1000){
            System.out.print("\nYou have availed 10% discount....Congratlations..\nTotal cost = Rs. "+ cost + "\nDiscounted cost = Rs. " + dis_cost);
            System.out.println("\nYour total discount = Rs. "+ (cost - dis_cost));        
        }
        else
            System.out.println("\nYour total cost = Rs. "+ cost);

        System.out.println("\n...Have a nice day sir....\n\n");    
        sc.close();
    }
    
}
