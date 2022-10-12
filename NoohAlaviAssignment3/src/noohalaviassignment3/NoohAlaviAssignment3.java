/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment3;

/**
 *
 * @author S201119359
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class NoohAlaviAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        final double SALES_TAX_RATE = .13; //13% in Ontario
        
        final String ITEM_1_NAME = "coffee"; // name of product
        final double ITEM_1_PRICE = 1.79; // starting price, in dollars
        int item1Quantity = 0; // quantity customer wants to buy
        double item1FinalPrice; // starting price * quantity
        
        final String ITEM_2_NAME = "donut";
        final double ITEM_2_PRICE = .99;
        int item2Quantity = 0;
        double item2FinalPrice;
        
        final String ITEM_3_NAME = "Himbit© 10 pck";
        final double ITEM_3_PRICE = 1.99;
        int item3Quantity = 0;
        double item3FinalPrice;
        
        final String ITEM_4_NAME = "muffin";
        final double ITEM_4_PRICE = 1.49;
        int item4Quantity = 0;
        double item4FinalPrice;
        
        final String ITEM_5_NAME = "Iced Hat©";
        final double ITEM_5_PRICE = 3.29;
        int item5Quantity = 0;
        double item5FinalPrice;
        
        double subtotalPrice; //total price w/o tax
        double taxAmount; // totalprice * tax
        double finalPrice; //total price with tax
        
        System.out.print("Welcome to Him Torton©'s (Totally not an offbrand Tim Horton's)!\n    How many " + ITEM_1_NAME + "s would you like to buy? "
                + "($" + ITEM_1_PRICE + ")\n    >>> ");
        item1Quantity = keyedInput.nextInt();
        item1FinalPrice = ITEM_1_PRICE * item1Quantity;
        
        System.out.print("    How many " + ITEM_2_NAME + "s would you like to buy? ($" + ITEM_2_PRICE + ")\n    >>> ");
        item2Quantity = keyedInput.nextInt();
        item2FinalPrice = ITEM_2_PRICE * item2Quantity;
        
        System.out.print("    How many " + ITEM_3_NAME + "s would you like to buy? ($" + ITEM_3_PRICE + ")\n    >>> ");   
        item3Quantity = keyedInput.nextInt();
        item3FinalPrice = ITEM_3_PRICE * item3Quantity;
        
        System.out.print("    How many " + ITEM_4_NAME + "s would you like to buy? ($" + ITEM_4_PRICE + ")\n    >>> ");   
        item4Quantity = keyedInput.nextInt();
        item4FinalPrice = ITEM_4_PRICE * item4Quantity;
        
        System.out.print("    How many " + ITEM_5_NAME + "s would you like to buy? ($" + ITEM_5_PRICE + ")\n    >>> ");   
        item5Quantity = keyedInput.nextInt();
        item5FinalPrice = ITEM_5_PRICE * item5Quantity;
        
        subtotalPrice = item1FinalPrice + item2FinalPrice + item3FinalPrice + item4FinalPrice + item5FinalPrice;
        taxAmount = subtotalPrice * SALES_TAX_RATE;
        finalPrice = subtotalPrice + taxAmount; //calculate final price, and add tax
        
        System.out.println("\nProceeding to checkout...");
        System.out.println("    " + ITEM_1_NAME.toUpperCase() + " (x" + item1Quantity + ").......... $" + df.format(item1FinalPrice));
        System.out.println("    " + ITEM_2_NAME.toUpperCase() + " (x" + item2Quantity + ").......... $" + df.format(item2FinalPrice));
        System.out.println("    " + ITEM_3_NAME.toUpperCase() + " (x" + item3Quantity + ").......... $" + df.format(item3FinalPrice));
        System.out.println("    " + ITEM_4_NAME.toUpperCase() + " (x" + item4Quantity + ").......... $" + df.format(item4FinalPrice));
        System.out.println("    " + ITEM_5_NAME.toUpperCase() + " (x" + item5Quantity + ").......... $" + df.format(item5FinalPrice));
        System.out.println("\n    SUBTOTAL.......... $" + df.format(subtotalPrice));
        System.out.println("    TAX.......... $" + df.format(taxAmount) + " (" + (SALES_TAX_RATE*100) + "%)");
        System.out.println("\n    TOTAL PRICE.......... $" + df.format(finalPrice));
        
        System.out.println("\nThank you for shopping with Him Tortons© today!");
    }
    
}
