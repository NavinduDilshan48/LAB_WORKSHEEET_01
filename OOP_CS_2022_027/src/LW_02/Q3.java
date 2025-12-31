package LW_02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner numOfRows = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = numOfRows.nextInt();
        for(int i=1;i<=rows;i++){
            for(int k=i;k<=rows;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
