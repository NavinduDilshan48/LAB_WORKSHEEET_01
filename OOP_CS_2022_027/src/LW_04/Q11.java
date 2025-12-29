package LW_04;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int random = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess the number (between 1-100) : ");
        int number = input.nextInt();
        while(number != random){
            if(number > random){
                System.out.println("Your guess is higher than the answer");
            }else if(number < random){
                System.out.println("Your guess is lower than the answer");
            }else{
                System.out.println("Your guess is not in the required range");
            }
            System.out.println("Please guess the number : ");
            number = input.nextInt();
        }
        System.out.println("You guessed the number. " + random + " is the correct answer.");
    }
}
