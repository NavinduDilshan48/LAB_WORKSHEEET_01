package LW_04;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence=input.nextLine();
        System.out.print("Please enter the word do you need to change : ");
        String word=input.nextLine();
        System.out.print("please enter the replacement word : ");
        String replacement=input.nextLine();
        String newSentence = sentence.replace(word,replacement);
        System.out.println("The new sentence is : "+newSentence);
    }
}
