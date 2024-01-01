package profileCreator;
import java.util.Scanner;

public class Pc1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Marjella's Profile Creator\nWould like to continue?\nType y for( yes) or n for (no)");
        String introUi = s.next();

        if( introUi == "n") {
            System.out.println("Thank you for using Marjella's profile creator");
            s.close();
        } 

        //

        System.out.println("Name:");
        String userName = s.next();

        System.out.println("Last Name:");
        String userLastName = s.next();

        System.out.println("Email:");
        String userEmail = s.next();

        System.out.println("Phone Number:");
        long userNumber = s.nextLong();

        
        //

        System.out.println("Enter any key to continue");
        String uiI = s.next();

        //

        System.out.println( "\n" + userName + "'s profile" + "\n"+ "Name: " + userName + "\n" + "Last Name: " + userLastName + "\n" + "Email: " + userEmail + "\n" + "Number: " + userNumber);

        s.close();
    }
}