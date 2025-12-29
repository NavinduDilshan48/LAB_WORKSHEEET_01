package LW_04;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word or a phrase : ");
        String str = input.nextLine();
        String reversedText = "";
        String originalText = str.toLowerCase().replace(" ","");
        for(int i = originalText.length()-1;i>=0;i--){
            reversedText+=originalText.charAt(i);
        }
        if(originalText.equals(reversedText)){
            System.out.println("This is a palindrome.");
        }else{
            System.out.println("This is not a palindrome.");
        }

    }
}
