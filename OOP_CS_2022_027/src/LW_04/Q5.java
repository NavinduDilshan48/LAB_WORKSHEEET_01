package LW_04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("----------------MyJava Lo-Fat Burgers-------------------");
        System.out.printf("%20s %25s %25s\n", "Entree", "Side Dish", "Drink");
        System.out.printf("%-20s $%-8.2f %-20s $%-8.2f %-20s $%-8.2f\n", "Tofu burger", 3.49, "Rice Cracker", 0.79, "Cafe Mocha", 1.99);
        System.out.printf("%-20s $%-8.2f %-20s $%-8.2f %-20s $%-8.2f\n", "Cajun Chicken", 4.59, "No-Salt Fries", 0.69, "Cafe Latte", 1.90);
        System.out.printf("%-20s $%-8.2f %-20s $%-8.2f %-20s $%-8.2f\n", "Buffalo Wings", 3.99, "Zucchini", 1.09, "Espresso", 2.49);
        System.out.printf("%-20s $%-8.2f %-20s $%-8.2f %-20s $%-8.2f\n", "Rainbow Fillet", 2.99, "Brown Rice", 0.59, "Oolong Tea", 0.99);

        System.out.println("----------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of your entree choice(1-4): ");
        int entreeChoice = input.nextInt();
        System.out.print("Please enter the number of your side dish choice(1-4): ");
        int sideDishChoice = input.nextInt();
        System.out.print("Please enter the number of your drink choice(1-4): ");
        int drinkChoice = input.nextInt();
        System.out.println("----------------------------------------------------\n");
        String entreeOrder;
        String sideDishOrder;
        String drinkOrder;
        switch (entreeChoice) {
            case 1:entreeOrder = "Tofu burger";
                break;
            case 2:entreeOrder = "Cajun Chicken";
                break;
            case 3:entreeOrder = "Buffalo Wings";
                break;
            case 4:entreeOrder = "Rainbow Fillet";
                break;
            default: entreeOrder = "Unknown Entree";
                break;
        }
        switch (sideDishChoice) {
            case 1:sideDishOrder = " Rice Cracker";
                break;
            case 2:sideDishOrder = "No-Salt Fries";
                break;
            case 3:sideDishOrder = " Zucchini";
                break;
            case 4:sideDishOrder = " Brown Rice";
                break;
            default: sideDishOrder = "Unknown Entree";
                break;
        }
        switch (drinkChoice) {
            case 1:drinkOrder = " Cafe Mocha";
                break;
            case 2:drinkOrder = "Cafe Latte";
                break;
            case 3:drinkOrder = " Espresso";
                break;
            case 4:drinkOrder = "Oolong Tea";
                break;
            default: drinkOrder = "Unknown Entree";
                break;
        }
        if(entreeOrder == "Unknown Entree" || sideDishOrder == "Unknown Entree" || drinkOrder == "Unknown Entree"){
            System.out.println("Invalid choice. Please try again.");
        }else{
            System.out.println(entreeOrder+","+sideDishOrder+" and "+drinkOrder+" are ordered by you.");
        }
    }
}
