/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment19;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author nooha
 */
public class NoohAlaviAssignment19 {
    private static final DecimalFormat DF = new DecimalFormat("#.##"); // Do not display more than 2 decimal places.
    
    private static String getRectPrismVolume() {
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.print("\nEnter the rectangular prism's width: ");
        double width = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's length: ");
        double length = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's height: ");
        double height = keyedInput.nextDouble();
                    
        return DF.format(width * length * height);
    }
    
    private static String getRectPrismSurfaceArea(Scanner keyedInput) {
        System.out.print("\nEnter the rectangular prism's width: ");
        double width = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's length: ");
        double length = keyedInput.nextDouble();
        System.out.print("Enter the rectangular prism's height: ");
        double height = keyedInput.nextDouble();
                    
        return DF.format(
                2 * ((width * length) + (height * length) + (height * width))
        );
    }
    
    private static String getSphereVolume(Scanner keyedInput) {
        System.out.print("\nEnter the spheres's radius: ");
        double radius = keyedInput.nextDouble();
                    
        return DF.format(
                (4 * Math.PI * Math.pow(radius, 3)) / 3
        );
    }
    
    private static String getSphereSurfaceArea(Scanner keyedInput) {
        System.out.print("\nEnter the spheres's surface area: ");
        double radius = keyedInput.nextDouble();
                    
        return DF.format(
                4 * Math.PI * Math.pow(radius, 2)
        );
    }
    
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
    
    private static String getFactorial(Scanner keyedInput) {
        System.out.print("\nEnter a number: ");
        int num = keyedInput.nextInt();
        int factorial = num;
        
        if (num == 1) {
            return "1";
        }
        
        for (int i = num - 1; i > 0; i--) {
            factorial *= i;
        }
        
        return DF.format(factorial);
    }
    
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        while (true) {
            // Display menu to user
            System.out.println("-------------------------------------------------");
            System.out.println("Select a mathematical operation:");
            System.out.println("a) Calculate the volume of a rectangular prism.");
            System.out.println("b) Calculate the surface area of a rectangular prism.");
            System.out.println("c) Calculate the volume of a sphere.");
            System.out.println("d) Calculate the surface area of a sphere.");
            System.out.println("e) Calculate the slope of a line.");
            System.out.println("f) Calculate the factorial of a number.");
            System.out.println("\n** TYPE ANYTHING ELSE TO EXIT THE PROGRAM **");
            System.out.print("\n$ ");
            
            // Get user's calculation
            switch(keyedInput.next().toLowerCase()) { // ignore case
                case "a":
                    System.out.println("\nYour rectangular prism has a volume of " + getRectPrismVolume() + " cubed units.");
                    break;
                case "b":
                    System.out.println("\nYour rectangular prism has a surface area of " + getRectPrismSurfaceArea(keyedInput) + " squared units.");
                    break;
                case "c":
                    System.out.println("\nYour sphere has a volume of " + getSphereVolume(keyedInput) + " cubed units.");
                    break;
                case "d":
                    System.out.println("\nYour sphere has a surface area of " + getSphereSurfaceArea(keyedInput) + " squared units.");
                    break;
                case "e":
                    System.out.println("\nYour line has a slope of " + getSlope(keyedInput) + ".");
                    break;
                case "f":
                    System.out.println("\nYour number's factorial is " + getFactorial(keyedInput) + ".");
                    break;
                default: // anything that is not a-f
                    System.out.println("\nThanks for using the program!");
                    return; // Exit the loop
            }
        }
    }
}
