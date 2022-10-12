/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment1;

/**
 *
 * @author S201119359
 */
public class NoohAlaviAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String processorCompany = "AMD Ryzen";
        char processorVersion = '5';
        int amountOfRAM = 32;
        
        int ssdStorage = 250;
        String ssdStorageUnit = "GB";
        char hddStorage = '4';
        String hddStorageUnit = "TB";
        
        double currentPriceOfGPU = 1499.99;
        int approximatePriceOfPC = 1000; // The total price was a bit higher than 1000
        double priceOfGPUComparedToPC = Math.round((currentPriceOfGPU/approximatePriceOfPC)*100);
        Boolean areTheGPUPricesStillCrazy = true;
        
        Boolean wasTheComputerWorthIt = true;
        
        System.out.println("Last December, I built my own PC. I used an " + processorCompany + " " + processorVersion + " APU, which also had a built-in "
                + "graphics card. \nThe reason I didn't buy a seperate GPU was because of the chip shortage; the prices were absoultely insane back then (" + areTheGPUPricesStillCrazy + ", they still are)!"
                + " Some cards, like the GeForce RTX 3090 Ti, \nare currently selling for ~$" + currentPriceOfGPU + "! "
                + "That is nearly " + priceOfGPUComparedToPC + "% of the price of the entire PC! "
                + "\nI went a bit overboard with the RAM, getting an entire " + amountOfRAM + "GB! I also got a TON of storage, getting a"
                + " SDD with " + ssdStorage + ssdStorageUnit +", and a HDD with " + hddStorage + hddStorageUnit + ".");
        
        if (wasTheComputerWorthIt) {
            System.out.println("Overall, the computer was definitely worth it! I loved building it, and I still continuously use it to this day!");
        } else {
            System.out.println("However, there's always a price to having a cheap budget. Since I couldn't get a graphics card, the computer struggles to "
                    + "run some of the games that I enjoy.");
        }
    }
    
}
