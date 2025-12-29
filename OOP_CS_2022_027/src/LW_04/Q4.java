package LW_04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner year =  new Scanner(System.in);
        System.out.println("Enter the year you need to check : ");
        int inputYear = year.nextInt();
        if((inputYear%4 == 0) && !(inputYear%100 == 0)){
            System.out.println("This is a Leap Year");
        }else if((inputYear%4 == 0) && (inputYear%100 == 0) && (inputYear%400 == 0)){
            System.out.println("This is a Leap Year");
        }else{
            System.out.println("This is not a Leap Year");
        }
    }
}
