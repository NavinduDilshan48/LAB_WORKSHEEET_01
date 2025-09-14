package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter the length in centimeters : ");
        Scanner scan = new Scanner(System.in);
        double lengthInCm = scan.nextDouble();
        float inch = (float)(lengthInCm/2.54);
        int feet = (int)(inch/12);
        inch -= feet*12;
        System.out.printf("The cm value to feet and inches is : %d feets and %.2f inches",feet,inch);
    }
}

