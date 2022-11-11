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

    private static void displayMenu() {
        // Display menu
        System.out.println("1… Find the value of a number squared (5^2 = 5 x 5)");
        System.out.println("2… Find the value of a number cubed (7^3 = 7 x 7 x 7)");
        System.out.println("3… Find the value of a number, to any power (2^5 = 2 x 2 x 2 x 2 x 2)");
        System.out.println("4… Exit\n");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set variables
        Scanner keyedInput = new Scanner(System.in);
        final String INPUT_PROMPT = ">>> ";
        
        String choice;
        
        int number; // The number that the power is being applied to
        int power;
        int answer;
        
        // Program main loop
        while (true) {
            // Reset numbers
            number = 0;
            power = 0;
            answer = 0;
            
            displayMenu();
        
            // Get mode
            System.out.print(INPUT_PROMPT);
            choice = keyedInput.next();
            
            switch (choice) {
                case "1":
                    power = 2; // Number squared
                    break;
                case "2":
                    power = 3; // Number cubed
                    break;
                case "3":
                    System.out.println("\nEnter a power: ");
                    System.out.print(INPUT_PROMPT);
                    power = keyedInput.nextInt();
                    break;
                case "4":
                    System.out.println("\nThank you for using the program!");
                    return; // Exit program
                default:
                    System.out.println("Please enter an integer in between 1 and 4!"); // Print answer
                    break; // Go through loop again
            }
            
            if (power > 0) { // Ensure that user has selected option 1-3
                // Get number
                System.out.println("\nEnter a number: ");
                System.out.print(INPUT_PROMPT);
                number = keyedInput.nextInt();
                
                answer = number; //Initial value, will be updated
                
                for (int i = 0; i < (power - 1); i++) { // Loop through appropriate amount of times
                    answer *= number;
                }
                
                System.out.println("\n" + number + "^" + power + " = " + answer + ""); // Show answer to user
            }
            
            System.out.println("<>------------------------------------------------<>\n\n");
        }
    }
}
