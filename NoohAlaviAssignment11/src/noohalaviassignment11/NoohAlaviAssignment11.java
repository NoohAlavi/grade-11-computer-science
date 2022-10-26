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
        String inputPrompt = ">>> ";

        // Get username
        System.out.println("Welcome, User! Please enter your name to continue:");
        System.out.print(inputPrompt);
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
        System.out.println("    “All the ships are waiting for my command,” he tells you, “which direction is the safest?”\n");
            
        // Decision 1
        System.out.println("a) Approach fleet from the front.");
        System.out.println("b) Sneak around the fleet from the back.\n");
        System.out.print(inputPrompt);
            
        switch (keyedInput.next().toLowerCase()) {
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
                        + " has been annihilated.\n");
                break;
            case "b":
                System.out.println("\n    You squint at the screen, and tell him, “We should sneak around the back of the fleet. They won’t be able to see us, and our\n"
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
        System.out.print(inputPrompt);
        
        switch (keyedInput.next().toLowerCase()) {
            case "a":
                System.out.println("\n    “I'm gonna head out and try to find resources,” you tell your team, walking out onto the red surface. You keep walking around until you\n"
                        + "stumble upon the strangest creature that you have ever seen. It looks like a dog, but it is huge, purple, has seven eyes, and has knives for teeth.\n"
                        + "What do you do?\n");
                
                //Decision 3
                System.out.println("a) Fight.");
                System.out.println("b) Talk.");
                System.out.println("c) Retreat.\n");
                System.out.print(inputPrompt);
                
                switch (keyedInput.next().toLowerCase()) {
                    case "a":
                        System.out.println("\n    As the creature curiously looks at you, you pull out your blaster, and point it at its head. The alien, realizing the danger\n"
                                + "that he is in, bares his teeth and pounces at you. However, you manage to fire your blaster, and the dog falls to the ground mere \n"
                                + "milliseconds before it can bite you. As it succumbs to its wounds, it lets out a blood-curdling howl.");
                        System.out.println("\n    The creature's call summons many others of its kind, undoubtedly members of its now-grieving family. They stare at \n"
                                + "you, a murderer, in anger, baring their teeth and desiring vengeance.\n");
                        
                        // Decision 4
                        System.out.println("    Should you run or hold your ground?\n");
                        System.out.println("a) Fight.");
                        System.out.println("b) Run away.\n");
                        System.out.print(inputPrompt);
                        
                        switch (keyedInput.next().toLowerCase()) {
                            case "a":
                                System.out.println("\n    You grasp firmly onto your blaster, pointing it at your enemies, one by one. For a moment, both you and your \n"
                                        + "enemies are too afraid to make a move. You fire, shooting balls of plasmic light towards the alien group. They pounce, \n"
                                        + "and you cannot fight them all at once.");
                                System.out.println("\n    GAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            case "b":
                                System.out.println("\n    You look around at the extraterrestial army, and know that you do not have a chance against them. You \n"
                                        + "turn around and run away, trying to get back to the ship. You quickly look back, and realize that every single alien \n"
                                        + "dog is chasing you. You keep running for what feels like eternity, and finally see the doors of the ship.");
                                System.out.println("\n    The door is open, and you sprint towards it. When you are about to step into the safety of the ship, \n"
                                        + "you feel one of the aliens pounce on your back and you fall over. You were so close.");
                                System.out.println("\n    GAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            default:
                                break;
                        }
                        break;
                    case "b":
                        System.out.println("\n    You signal that you come in peace, and slowly approach the dog with a smile on your face. It, however, is \n"
                                + "not very friendly and bites off your leg.");
                        System.out.println("\n    You fall on the floor, and the evil creature bares its teeth, ready for the finishing blow. What do you do?\n");
                        System.out.print(inputPrompt);
                        
                        // Decision 4
                        System.out.println("a) Fight.");
                        System.out.println("b) Run.\n");
                        System.out.print(inputPrompt);
                        
                        switch (keyedInput.next().toLowerCase()) {
                            case "a":
                                System.out.println("\n    You pull out your blaster and point it at the alien's deformed skull. But before you can do \n"
                                        + "anything, it attacks.");
                                System.out.println("\n    GAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            case "b":
                                System.out.println("\n    You turn around and try to run away, but your one leg does not get you very far. The alien \n"
                                        + "licks its brown lips, ready for supper."); 
                               break;
                            default:
                                break;
                        }
                        
                        break;
                    case "c":
                        break;
                    default:
                        break;
                }
                
                break;
            case "b":
                System.out.println("\n    You do not know whether the extraterrestial enemies have already taken control of Mars, so you decide to explore the ship instead, trying\n"
                        + "to find resources to fix your ship. You walk around the ship until you reach an intersection.\n");
                
                // Decision 3
                while (true) {
                    System.out.println("    Which room would you like to go to?\n");
                    System.out.println("a) Communication room.");
                    System.out.println("b) Storage room.\n");
                    System.out.print(inputPrompt);
                
                    switch (keyedInput.next().toLowerCase()) {
                        case "a":
                            System.out.println("\n    You walk into the ship's communication room and find a large device which you immediately recognize as being the Intergalactic\n"
                                    + "communicator. Do you want to try to send a message to other surviving ships, so you can team up to defeat the aliens?\n");
                            
                            // Decision 4
                            System.out.println("a) Try to communicate.");
                            System.out.println("b) Leave room.\n");
                            System.out.print(inputPrompt);
                            
                            switch (keyedInput.next().toLowerCase()) {
                                case "a":
                                    System.out.println("    \nYou send out an SOS signal with your coordinates, and the computer lets out a successful *beep*. You wait patiently for a response,\n"
                                            + "and then you see it; a huge ship just outside the planet's atomosphere. Suddenly, your heart drops. That's not a human ship. The aliens must have \n"
                                            + "intercepted your message!");
                                    System.out.println("    A laser beam powers up from the ship, and fires towards Mars, destroying the entire planet.");
                                    System.out.println("\n    GAME OVER: YOU LOSE!");
                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                    return;
                                case "b":
                                    // breaking here will go back to the selection due to the while true loop
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case "b":
                            System.out.println("\n    You enter the storage room and sigh in relief, as you find a bunch of materials and resources needed to fix the ship. As you and your crewmates start the \n"
                                    + "repairs, you hear a sound outside. When you peer out the air-tight window, you realize that it is an alien ship that is looking for survivors. What do you do?\n");
                            
                            //Decision 4
                            System.out.println("a) Fire at the ship.");
                            System.out.println("b) Hide in the ship.\n");
                            System.out.print(inputPrompt);
                            
                            switch (keyedInput.next().toLowerCase()) {
                                case "a":
                                    System.out.println("\n    You run to the control room, yelling, “Aliens! They're here! We need to fire the weapons!”");
                                    System.out.println("\n    “You heard him,” General Moss says to the weapon crew, “we get them before they get us.”");
                                    System.out.println("\n    You see the weapon crew charge up their blaster cannons, and a bright light and a loud sound confirms that the alien ship is no more. However, before\n"
                                            + "you can celebrate, a group of alien canine-like creatures surrounds the ship. There are too many to fight off, and the space dogs are happy to have found their lunch.");
                                    System.out.println("\n    GAME OVER: YOU LOSE!");
                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                    return;
                                case "b":
                                    System.out.println("\n    You run to the control room, yelling, “Aliens! They're here! We need to hide in the ship!”");
                                    System.out.println("\n    “You heard him,” General Moss says to the crew, “power off the ship and hide before they board.”");
                                    System.out.println("\n    You run around, drastically trying to find a place to hide, and you stumble upon a closet, which is large enough for you to crawl into. As you shut the\n"
                                            + "doors behind you, you see two aliens with high-grade blasters walking through the hall. You feel your own blaster in your pocket, and put your hand on it.\n");
                                   
                                    // Decision 5
                                    System.out.println("a) Jump out of the closet and shoot the intruders.");
                                    System.out.println("b) Stay hidden.\n");
                                    System.out.print(inputPrompt);
                                    
                                    switch (keyedInput.next().toLowerCase()) {
                                        case "a":
                                            System.out.println("\n    You take a deep breath, and kick the door open. The aliens look back at you, but before they can react, you release two blasts of light from your \n"
                                                    + "blaster, which both hit their mark. The loud noise, howevever, attracts the rest of the aliens to your location, just like a magnet. You look down at your blaster, \n"
                                                    + "and then at the closet that you just came out of. What do you do\n?");
                                           
                                            // Decision 6
                                            System.out.println("a) Hide back in the closet.");
                                            System.out.println("b) Fight the aliens.");
                                            System.out.println("c) Stay still, and hope that the aliens are blind.\n");
                                            System.out.print(inputPrompt);
                                            
                                            switch(keyedInput.next().toLowerCase()) {
                                                case "a":
                                                    System.out.println("\n    You move quickly, hiding back into the closet, closing the door behind you. A whole swarm of aliens storms into the hallway, and all of them \n"
                                                            + "are armed. You see one of them holding a device. Oh no. It's a lifeform detector. As it beeps, you realize that you have been caught.");
                                                    System.out.println("\n    GAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                                case "b":
                                                    System.out.println("\n    You pull out your blaster as no less than twenty aliens, all armed, walk into the hallway, surrounding you. You starting firing your blaster, \n"
                                                            + "and a few them fall to the ground. However, reinforcements are quickly streaming into the hall, and you are no match for them.");
                                                    System.out.println("\n    GAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                                case "c":
                                                    System.out.println("\n    You rememeber watching Guardians of the Galaxy, and remember the scene where Drax became invisible by standing still. You decide to try out his \n"
                                                            + "strategy, but as the aliens surround you and power up their blasters, you realize that Marvel lied to you.");
                                                    System.out.println("\n    GAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                            }
                                            break;
                                        case "b":
                                            System.out.println("\n    You let go of the gun. What were you thinking, you ask yourself. You can't possibly take on both of them at once. Besides, they don't even know\n"
                                                    + "that you're here, " + username + ". You're perfectly safe! Suddently, you hear a loud beeping noise, and both the aliens turn to face you. They have a life-detection\n"
                                                    + "scanner. You might have spoken too soon. You can't do anything as one of them aims their plasma blaster at the door and pulls the trigger.");
                                            System.out.println("\n    GAME OVER: YOU LOSE!");
                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                            return;
                                    }
                                    break;
                            }
                        default:
                            break;
                    }
                }
            default:
                break;
        }
    }
}
