package LW_04;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = number.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println( num+ "*" + i + " = " + (num*i) );
        }
    }
}
