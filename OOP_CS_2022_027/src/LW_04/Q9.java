package LW_04;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner rows = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int numberOfRows = rows.nextInt();
        for(int i = 1; i <= numberOfRows; i++){
            for(int j = 1; j <= numberOfRows-i; j++){
                System.out.print(" ");
            }
            for(int n=1 ; n<=((2*i)-1) ; n++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
