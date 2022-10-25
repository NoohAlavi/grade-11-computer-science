/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment11;

import java.util.Scanner;

/**
 *
 * @author s201119359
 */
public class NoohAlaviAssignment11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        String username;
        

        // Get username
        System.out.print("Welcome, User! Please enter your name to continue:\n>>> ");
        username = keyedInput.nextLine();
        // Intro
        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("    “" + username + "!“" + " You snap back to attention as you hear a voice call your name. “" + username + "!“");
        System.out.println("    “Yes sir,” you reply, quickly fixing your posture and looking in the dark gray eyes of General Moss.");
        System.out.println("    “Dozing off again?” He asks you, with his famous frown plastered on his face. “That’s the third time today."
                    + "\nAre you worried ‘bout something, " + username + "? Do you think it is more important than the incoming invasion? Pay attention!”");
        System.out.println("    “No sir, of course not sir,” you manage to cough, thoughts flying through your head as the general turns "
                    + "\naround. The invasion. You still remember the news forecast where NASA announced that a meteor storm was getting "
                    + "\ncloser to the Earth—and then they said it was actually a fleet of alien vessels. NASA tried communicating with them "
                    + "\nin every language known to man, but they only got one reply—a series of dashes and dots spelling out, “D I E.”");
        System.out.println("    All the world's countries formed a temporary alliance, and every adult male was drafted into the largest army"
                    + "\nthat the Earth had ever seen. Many others—women and children, had volunteered to go along and help the army. The "
                    + "\narmy nearly had a billion people.");
        System.out.println("    That was two weeks ago. Fifteen days, seven hours, and thirty three seconds, to be exact. You were now in one"
                    + "\nof the five hundred thousand ships speeding towards the invading fleet. Your wife wanted to come along, but you "
                    + "\nboth knew that she had to stay back to take care of your one year old kid. You need to save the Earth. Your family is on the line. ");
        System.out.println("    Your computer suddenly beeps, as the map of the Milky Way on your screen starts to blink. “We’re in range, "
                    + "\nsir,” you say, when General Moss faces you again. “We need to execute the plan.”");
        System.out.println("    “All the ships are waiting for my command,” he tells you, “which direction is the safest?\n”");
            
        // Decision 1
        System.out.println("a) Approach fleet from the front.");
        System.out.println("b) Sneak around the fleet from the back.\n");
        System.out.print(">>> ");
            
        switch (keyedInput.next()) {
            case "a":
                System.out.println("\n    You squint at the screen, and tell him, “We should approach the fleet head-on. They won’t expect it, and our\n "
                        + "forces are extremely maneuverable.”");
                System.out.println("    “You better not be wrong, " + username + ",” the general says, as he communicates the plan with the other ships, “the fate\n"
                        + " of the human race depends on it.”");
                System.out.println("    You feel the ship suddenly speed up, and the enemy fleet seems to get bigger and bigger. You hear Rogers prepare the ship’s\n "
                        + "weaponry. Everyone buckles their seatbelts, when suddenly, Boom! You see the ship beside you become a ball of fire. Before you can understand\n "
                        + "what is happening, more explosions ring through the air, and you see blasts of pure, purple plasma coming from the direction of the extraterrestrial\n "
                        + "armada.  They had radar scanners, and managed to detect your sneak attack.");
                System.out.println("“We’re under attack!” yells General Moss. The ship’s pilot, Patel, manages to steer through the rain of death and destruction, and your ship \n"
                        + "crash lands on Mars. When Moss sends out a communication, asking for the status of all ships, you learn that only one thousand remain. Most of humanity\n"
                        + " has been annihilated.");
                break;
            case "b":
                System.out.println("    You squint at the screen, and tell him, “We should sneak around the back of the fleet. They won’t be able to see us, and our\n"
                        + " forces will completely overwhelm them.”");
                System.out.println("    “You better not be wrong, " + username + ",” the general says, as he communicates the plan with the other ships, “the fate\n"
                        + " of the human race depends on it.”");
                System.out.println("    You feel the ship suddenly speed up, and the enemy fleet seems to get bigger and bigger. You hear Rogers prepare the ship’s\n "
                        + "weaponry. Everyone buckles their seatbelts, when suddenly, Boom! You see the ship beside you become a ball of fire. Before you can understand\n "
                        + "what is happening, more explosions ring through the air, and you see blasts of pure, purple plasma coming from the direction of the extraterrestrial\n "
                        + "armada. ");
                System.out.println("    “We’re under attack!” yells General Moss. The ship’s pilot, Patel, manages to steer through the rain of death and destruction, and your ship \n"
                        + "crash lands on Mars. When Moss sends out a communication, asking for the status of all ships, you learn that only one thousand remain. Most of humanity\n"
                        + " has been annihilated.\n");
                break;
            default:
                break;
        }
        
        //Decision 2
        System.out.println("a) Search the planet for resources.");
        System.out.println("b) Search the ship for resources.\n");
        System.out.print(">>> ");
        
        switch (keyedInput.next()) {
            case "a":
                System.out.println("\n    “I'm gonna head out and try to find resources,” you tell your team, walking out onto the red surface. You keep walking around until you\n"
                        + "stumble upon the strangest creature that you have ever seen. It looks like a dog, but it is huge, purple, has seven eyes, and has knives for teeth.\n"
                        + "What do you do?\n");
                
                //Decision 3
                System.out.println("a) Attack");
                System.out.println("b) Talk");
                System.out.println("c) Retreat");
            case "b":
                System.out.println("You do not know whether the extraterrestial enemies have already taken control of Mars, so you decide to explore the ship instead, trying\n"
                        + "to find resources to fix your ship.\n");
                System.out.println("You walk around the ship until you reach an intersection. Which room would you like to go to?");
                
                // Decision 3
                switch (keyedInput.next()) {
                    case "a":
                        break;
                    case "b":
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        
        // Add line to end the program
        System.out.println("\n------------------------------------------------------------------------------------------\n");
    }
}
