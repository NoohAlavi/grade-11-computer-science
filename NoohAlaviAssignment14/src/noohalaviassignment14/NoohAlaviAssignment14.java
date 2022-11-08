/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment14;

import java.util.Scanner;

/**
 *
 * @author s201119359
 */
public class NoohAlaviAssignment14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        final String INPUT_PROMPT = ">>> ";
        String choice;
        int number;
        int power;
        int answer;
        
        while (true) {
            System.out.println("1… Find the value of a number squared (5^2 = 5 x 5)");
            System.out.println("2… Find the value of a number cubed (7^3 = 7 x 7 x 7)");
            System.out.println("3… Find the value of a number, to any power (2^5 = 2 x 2 x 2 x 2 x 2)");
            System.out.println("4… Exit\n");
        
            System.out.print(INPUT_PROMPT);
            choice = keyedInput.nextLine();
        
            switch (choice) {
                case "1":
                    System.out.println("\nEnter a number: ");
                    System.out.print(INPUT_PROMPT);
                    
                    number = keyedInput.nextInt();
                    answer = number * number;
                    
                    System.out.println("\n" + number + " squared is equal to " + answer + ".");
                    break;
                case "2":
                    System.out.println("\nEnter a number: ");
                    System.out.print(INPUT_PROMPT);
                    
                    number = keyedInput.nextInt();
                    answer = number * number * number;
                    
                    System.out.println("\n" + number + " cubed is equal to " + answer + ".");
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println("\nThank you for using the program! :D");
                    return; // Exit program
                default:
                    System.out.println("Please enter a number in between 1 and 4!");
                    break; // Go through loop again
            }
            System.out.println("------------------------------------------------");
        }
    }
}
