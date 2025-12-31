package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:");
        StringBuilder sb = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            sb.append(word.toLowerCase());
        }

        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        input.close();
    }
}

