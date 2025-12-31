package LW_02;

import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer value : ");
        int input = scanner.nextInt();
        int count = 0;
        while(input>0){
            count++;
            while(input/10>0){
                input/=10;
                count++;
            }
            System.out.println("The length of the number is " + count);
            System.out.println("Enter any integer value : ");
            input = scanner.nextInt();
            count = 0;
        }
    }
}
