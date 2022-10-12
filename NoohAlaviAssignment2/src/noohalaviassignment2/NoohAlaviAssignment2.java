/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment2;

/**
 *
 * @author S201119359
 */

import java.util.Scanner;

public class NoohAlaviAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ohm's Law: I = V / R; V = IR; R = V/I;
        // V = voltage
        // I = current
        // R = resistance
        
        Scanner keyedInput = new Scanner(System.in);
        double voltage = 0;
        double resistance = 0;
        double current = 0;
        
        char voltageSymbol = 'V'; //volts
        char resistanceSymbol = 'Ω'; //ohms
        char currentSymbol = 'A'; //amperes
        
        String choice;
        
        System.out.println("--NOOH ALAVI'S OHM'S LAW CALCULATOR--");
        System.out.print("What do you want to calculate? (V, I, R): ");
        choice = keyedInput.nextLine().toLowerCase();
        
        if (choice.equals("r")) {
            // R = V/I
            System.out.print("\nCALCULATING RESISTANCE\n    Please enter the voltage: ");
            voltage = keyedInput.nextDouble();
            System.out.print("    Please enter the current: ");
            current = keyedInput.nextDouble();
            
            resistance = voltage / current;
        } else if (choice.equals("v")) {
            // V = IR
            System.out.print("\nCALCULATING VOLTAGE\n    Please enter the current: ");
            current = keyedInput.nextDouble();
            System.out.print("    Please enter the resistance: ");
            resistance = keyedInput.nextDouble();
            
            voltage = current * resistance;
        } else if (choice.equals("i")) {
            // I = V/R
            System.out.print("\nCALCULATING CURRENT\n    Please enter the voltage: ");
            voltage = keyedInput.nextDouble();
            System.out.print("    Please enter the resistance: ");
            resistance = keyedInput.nextDouble();
            
            current = voltage / resistance;
        } else {
            System.out.println("'" + choice + "'" + " is an invalid choice. Please enter either 'r' for resistance, 'v' for voltage,\n"
                    + "or 'i' for current.");
            return;
        }
        
        System.out.println("\nRESULTS\n    Voltage: " + voltage + voltageSymbol + "\n    Resistance: " + 
                resistance + resistanceSymbol + "\n    Current: " + current + currentSymbol);
    }
    
}
