package LW_04;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner power = new Scanner(System.in);
        System.out.print("Enter a power of 10(eg:-6, 9, 12, etc.) : ");
        int value = power.nextInt();
        String name;
        switch(value){
            case 6:
                name = "Million";
                break;
            case 9:
                name = "Billion";
                break;
            case 12:
                name = "Trillion";
                break;
            case 15:
                name = "Quadrillion";
                break;
            case 18:
                name = "Quintilion";
                break;
            case 21:
                name = "Sextilion";
                break;
            case 30:
                name = "Nonillion";
                break;
            case 100:
                name = "Googol";
                break;
            default:
                name = null;
                break;
        }
        if (name != null) {
            System.out.println("10 to the power of " + value + " is called a " + name + ".");
        } else {
            System.out.println("Sorry, there is no common word for 10 to the power of " + value + ".");
        }
    }
}
