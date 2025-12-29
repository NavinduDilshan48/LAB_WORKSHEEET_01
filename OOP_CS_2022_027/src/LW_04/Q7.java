package LW_04;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        while(number>0){
            int i=1;
            int displaynum = number;
            while(number/10 > 0){
                number = number / 10;
                i++;
            }
            System.out.println(displaynum + " has "+ i + " digits.");
            System.out.print("Please enter a number: ");
            number = input.nextInt();
        }
        System.out.println("Please enter a positive number.");
    }
}
