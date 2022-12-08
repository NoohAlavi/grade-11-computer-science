/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment20;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author nooha
 */
public class NoohAlaviAssignment20 {
    private static final DecimalFormat DF = new DecimalFormat("#.##"); // Do not display more than 2 decimal places.
    
    /*
        displayMenu
    
        This method displays a simple menu that tells the user how to use the program
        and then shows a prompt to get their keyboard input.
    
        Parameters: void
    
        Returns: void
    */
    private static void displayMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("Select a mathematical operation:");
        System.out.println("a) Calculate the volume of a rectangular prism.");
        System.out.println("b) Calculate the surface area of a rectangular prism.");
        System.out.println("c) Calculate the volume of a sphere.");
        System.out.println("d) Calculate the surface area of a sphere.");
        System.out.println("e) Calculate the slope of a line.");
        System.out.println("\n** TYPE ANYTHING ELSE TO EXIT THE PROGRAM **");
        System.out.print("\n$ ");
    }
    
    /*
        getRectPrismVolume
     
        Gets the width, length, and height of a rectangular prism, calculates
        its volume, and then displays it to the user.
    
        Parameters: Scanner
    
        Returns: String
    */
    private static String getRectPrismVolume(Scanner keyedInput) {
        System.out.print("\nEnter the rectangular prism's width: ");
        double width = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's length: ");
        double length = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's height: ");
        double height = keyedInput.nextDouble();
                    
        return DF.format(width * length * height);
    }
    
    /*
        getRectPrismSurfaceArea
    
        Gets the width, length, and height of a rectangular prism, calculates
        its surface area, and then displays it to the user.
    
        Parameters: Scanner
    
        Returns: String
    */
    private static String getRectPrismSurfaceArea(Scanner keyedInput) {
        System.out.print("\nEnter the rectangular prism's width: ");
        double width = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's length: ");
        double length = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's height: ");
        double height = keyedInput.nextDouble();
        
        return DF.format(2 * ((width * length) + (height * length) + (height * width)));
    }
    
    /*
        getSphereVolume
    
        Gets the radius of the sphere, calculates its volume, and then displays
        it to the user.
    
        Parameters: Scanner
    
        Returns: String
    */
    private static String getSphereVolume(Scanner keyedInput) {
        System.out.print("\nEnter the spheres's radius: ");
        double radius = keyedInput.nextDouble();
                    
        return DF.format((4 * Math.PI * Math.pow(radius, 3)) / 3);
    }
    
    /*
        getSphereSurfaceArea
    
        Get the radius of the sphere, calculate its surface area, and then
        displays it to the user.
    
        Parameters: Scanner
    
        Returns: String
    */
    private static String getSphereSurfaceArea(Scanner keyedInput) {
        System.out.print("\nEnter the spheres's surface area: ");
        double radius = keyedInput.nextDouble();
                    
        return DF.format(4 * Math.PI * Math.pow(radius, 2));
    }
    
    /*
        getSlope
    
        Gets the x-y coordinates of two different points on a plane, calculates
        its slope, and then displays it to the user.
    
        Parameters: Scanner
    
        Returns: String
    */
    private static String getSlope(Scanner keyedInput) {
        System.out.print("\nEnter the first point's x-coordinate: ");
        double x1 = keyedInput.nextDouble();
        System.out.print("Enter the first point's y-coordinate: ");
        double y1 = keyedInput.nextDouble();
        System.out.print("Enter the second point's x-coordinate: ");
        double x2 = keyedInput.nextDouble();
        System.out.print("Enter the second point's y-coordinate: ");
        double y2 = keyedInput.nextDouble();
                    
        return DF.format(
            (y2 - y1) / (x2 - x1)
        );
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        while (true) {
            // Display menu to user
            displayMenu();
            
            // Get user's calculation
            switch(keyedInput.next().toLowerCase()) { // Ignore case
                case "a":
                    System.out.println("\nThe volume of your rectangular prism is " + getRectPrismVolume(keyedInput) + " cubed units.");
                    break;
                case "b":
                    System.out.println("\nThe surface area of your rectangular prism is " + getRectPrismSurfaceArea(keyedInput) + " squared units.");
                    break;
                case "c":
                    System.out.println("\nThe volume of your sphere is " + getSphereVolume(keyedInput) + " cubed units.");
                    break;
                case "d":
                    System.out.println("\nThe surface area of your sphere is " + getSphereSurfaceArea(keyedInput) + " squared units.");
                    break;
                case "e":
                    System.out.println("\nThe slope of your line is " + getSlope(keyedInput) + ".");
                    break;
                default: // Anything that is not a - e
                    System.out.println("\nThanks for using the program!");
                    return; // Exit the loop
            }
        }
    }
}
