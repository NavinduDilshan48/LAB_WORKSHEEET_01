package LW_04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter integer value " + (i+1) + " :");
            numbers[i] = input.nextInt();
        }
        if( numbers[0]<= numbers[1]){
            if( numbers[0]<= numbers[2]){
                System.out.println("The smallest number is "+ numbers[0]);
            }else{
                System.out.println("The smallest number is "+ numbers[2]);
            }
        }else{
            if( numbers[1]<= numbers[2]){
                System.out.println("The smallest number is "+ numbers[1]);
            }else{
                System.out.println("The smallest number is "+ numbers[2]);
            }
        }
    }
}
