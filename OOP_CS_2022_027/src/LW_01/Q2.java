package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first name : ");
        String firstName = scan.nextLine();
        System.out.print("Enter your middle name : ");
        String middleName = scan.nextLine();
        System.out.print("Enter your last name : ");
        String lastName = scan.nextLine();
        System.out.println("Your name is : "+lastName+", "+firstName+" "+middleName.charAt(0)+".");
    }
}
