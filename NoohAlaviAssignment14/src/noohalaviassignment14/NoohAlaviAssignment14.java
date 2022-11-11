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
        // Set variables
        Scanner keyedInput = new Scanner(System.in);
        final String INPUT_PROMPT = ">>> ";
        
        String choice;
        
        int number;
        int power;
        int answer;
        
        // Program main loop
        while (true) {
            // Display menu
            System.out.println("1… Find the value of a number squared (5^2 = 5 x 5)");
            System.out.println("2… Find the value of a number cubed (7^3 = 7 x 7 x 7)");
            System.out.println("3… Find the value of a number, to any power (2^5 = 2 x 2 x 2 x 2 x 2)");
            System.out.println("4… Exit\n");
        
            // Get mode
            System.out.print(INPUT_PROMPT);
            choice = keyedInput.next();
        
            switch (choice) {
                case "1":
                    System.out.println("\nEnter a number: ");
                    System.out.print(INPUT_PROMPT);
                    
                    number = keyedInput.nextInt();
                    answer = number * number; // square number
                    
                    System.out.println("\n" + number + "^2 = " + answer); // print answer
                    break;
                case "2":
                    System.out.println("\nEnter a number: ");
                    System.out.print(INPUT_PROMPT);
                    
                    number = keyedInput.nextInt();
                    answer = number * number * number; //cube number
                    
                    System.out.println("\n" + number + "^3 = " + answer); // print answer
                    break;
                case "3":
                    System.out.println("\nEnter a number: ");
                    System.out.print(INPUT_PROMPT);
                    number = keyedInput.nextInt();
                    
                    System.out.println("\nEnter a power: ");
                    System.out.print(INPUT_PROMPT);
                    power = keyedInput.nextInt();
                    
                    answer = number; //initial value, will be updated
                    for (int i = 0; i < (power - 1); i++) { // loop through appropriate amount of times
                        answer *= number;
                    }
                
                    System.out.println("\n" + number + "^" + power + " = " + answer); // print answer
                    break;
                case "4":
                    System.out.println("\nThank you for using the program!");
                    return; // Exit program
                default:
                    System.out.println("Please enter an integer in between 1 and 4!"); // print answer
                    break; // Go through loop again
            }
            System.out.println("<>------------------------------------------------<>\n\n");
        }
    }
}
