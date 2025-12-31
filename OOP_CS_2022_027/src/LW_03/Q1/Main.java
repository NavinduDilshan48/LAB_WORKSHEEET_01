package LW_03.Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();

        Temperature temp = new Temperature(c);

        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());

        input.close();
    }
}

