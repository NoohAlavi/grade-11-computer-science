/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment6;

/**
 *
 * @author S201119359
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class NoohAlaviAssignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // defining and initializing variables
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        final double firstDiscountMaxPrice = 50.00; // if it is over this, then the next discount will be applied
        final double secondDiscountMaxPrice = 90.00;
        final double thirdDiscountMaxPrice = 130;
        
        final double firstDiscountPercent = 15; // % of discount to be applied if price is under firstDiscountMaxPrice
        final double secondDiscountPercent = 20;
        final double thirdDiscountPercent = 25;
        final double overThirdDiscountPercent = 35; // to be applied if price is over thirdDiscountMaxPrice
        
        double price = 0; // How much money the customer is spending
        double discountPercentage = 0; //Not in decimal form, in percent form
        double amountSaved = 0; // how much money the user saved
        double discountedPrice; // amount customer will pay, after discount is applied
        
	// get user input
        System.out.print("How much money are you spending?\n>>> $");
        price = keyedInput.nextDouble();
        
        // calculate discount
        if (price > 0 && price <= firstDiscountMaxPrice) {
            discountPercentage = firstDiscountPercent;
        } else if (price > firstDiscountMaxPrice && price <= secondDiscountMaxPrice) {
            discountPercentage = secondDiscountPercent;
        } else if (price > secondDiscountMaxPrice && price <= thirdDiscountMaxPrice) {
            discountPercentage = thirdDiscountPercent;
        } else if (price > thirdDiscountMaxPrice) { // not using else, since "0" has not been handled yet
            discountPercentage = overThirdDiscountPercent;
        }
        
        // display results
        if (price != 0) {
            amountSaved = price * (discountPercentage/100);
            discountedPrice = price - amountSaved;
            System.out.println("Since you are spending $" + df.format(price) + ", you get a " +
                    discountPercentage + "% discount! You saved $" + df.format(amountSaved) + ", and the "
                    + "total price is now $" + df.format(discountedPrice) + "!");
        } else { //handle "0" as input
            System.out.println("You cannot get a discount—you are not spending any money!");
        }
    }
    
}