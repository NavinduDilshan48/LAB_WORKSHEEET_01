package LW_02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        int[] input =new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter integer value " + (i+1) + " : ");
            input[i]=values.nextInt();
        }
        int largestValue = 0;
        int secondLargestValue = 0;
        for (int j=0;j<5;j++){
            if(input[j] > largestValue){
                secondLargestValue = largestValue;
                largestValue = input[j];
            }else if(input[j] > secondLargestValue  && input[j] != largestValue){
                    secondLargestValue = input[j];
            }
        }
        System.out.println("The second largest value is : " + secondLargestValue);
    }
}
