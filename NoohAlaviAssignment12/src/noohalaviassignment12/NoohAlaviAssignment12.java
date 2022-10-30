/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment12;

import java.util.Scanner;

/**
 *
 * @author nooha
 */
public class NoohAlaviAssignment12 {

    /**
     * @param args the command line arguments
     */
    
    private static String capitalizeStr(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        // All possible choices
        String[] choices = {
            "count from 0 to 10 by 1",
            "count from 100 to 0 by 10",
            "count from 50 to 500 by 50",
            "count from 6000 to 1000 by 1000"
        };
        
        System.out.println("---Cool Counting Program---\n");
        
        System.out.println("Please enter your choice:");
        System.out.println("1... " + capitalizeStr(choices[0]));
        System.out.println("2... " + capitalizeStr(choices[1]));
        System.out.println("3... " + capitalizeStr(choices[2]));
        System.out.println("4... " + capitalizeStr(choices[3]));
        
        // Get user input
        int selectedChoice = keyedInput.nextInt();
        System.out.println("\n------------------------------------");
        
        // Run appropriate loop, based on user's choice.
        switch (selectedChoice) {
            case 1:
                System.out.println("You have chosen to " + choices[0] + ":");
                
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("You have chosen to " + choices[1] + ":");
                
                for (int i = 100; i >= 0; i -= 10) {
                    System.out.println(i);
                }
                break;
            case 3:
                System.out.println("You have chosen to " + choices[2] + ":");
                
                for (int i = 50; i <= 500; i += 50) {
                    System.out.println(i);
                }
                break;
            case 4:
                System.out.println("You have chosen to " + choices[3] + ":");
                
                for (int i = 6000; i >= 100; i -= 1000) {
                    System.out.println(i);
                }
                break;
        }
        
        // Print some lines to end the program.
        System.out.println("------------------------------------");
    }
    
}
