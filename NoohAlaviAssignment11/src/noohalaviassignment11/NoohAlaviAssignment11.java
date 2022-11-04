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
 * ** FLOWCHART LINK: https://drive.google.com/file/d/1zJXyGjKRsj2fxQ3_jOSEyG25LfFUscPS/view?usp=sharing **
 * DECISIONS ARE NAMED IN COMMENTS, NAME IS NUMBER BASED ON PARENT DECISION.
 */
public class NoohAlaviAssignment11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        final String INPUT_PROMPT = "(Enter letter) >>> ";
        
        String username;
        boolean hasWeapon = false; // flag to be used later.

        // Get username
        System.out.print("Welcome, player!\n\n--PLEASE ENTER USERNAME--\n");
        System.out.print(" >>> ");
        
        username = keyedInput.nextLine().toLowerCase();
        username = username.substring(0, 1).toUpperCase() + username.substring(1); //capitalize name
        
        // Display intro
        System.out.println("\n------------------------------------------------------------------------------------------");
        System.out.println("    ❝" + username + "!❝" + " You snap back to attention as you hear a voice call your name. ❝" + username + "!❝");
        System.out.println("    ❝Yes sir,❞ you reply, quickly fixing your posture and looking in the dark gray eyes of General Moss.");
        System.out.println("    ❝Dozing off again?❞ He asks you, with his famous frown plastered on his face. ❝That’s the third time today.\n"
                + "Are you worried ‘bout something, " + username + "? Do you think it is more important than the incoming invasion? Pay attention!❞");
        System.out.println("    ❝No sir, of course not sir,❞ you manage to cough, thoughts flying through your head as the general turns "
                    + "\naround. The invasion. You still remember the news forecast where NASA announced that a meteor storm was getting "
                    + "\ncloser to the Earth—and then they said it was actually a fleet of alien vessels. NASA tried communicating with them "
                    + "\nin every language known to man, but they only got one reply—a series of dashes and dots spelling out, ❝D I E.❞");
        System.out.println("    All the world's countries formed a temporary alliance, and every adult male was drafted into the largest army"
                    + "\nthat the Earth had ever seen. Many others—women and children, had volunteered to go along and help the army. The "
                    + "\narmy nearly had three billion people.");
        System.out.println("    That was two weeks ago. Fifteen days, seven hours, and thirty three seconds, to be exact. You were now in one"
                    + "\nof the five hundred thousand ships speeding towards the invading fleet. Your wife wanted to come along, but you "
                    + "\nboth knew that she had to stay back to take care of your one year old kid. You need to save the Earth. Your family is on the line. ");
        System.out.println("    Your computer suddenly beeps, as the map of the Milky Way on your screen starts to blink. ❝We’re in range, "
                    + "\nsir,❞ you say, when General Moss faces you again. ❝We need to execute the plan.❞");
        System.out.println("    ❝All the ships are waiting for my command,❞ he tells you, ❝which direction is the safest?❞\n");
            
        // Decision 0
        System.out.println("a) Approach fleet from the front.");
        System.out.println("b) Sneak around the fleet from the back.\n");
        System.out.print(INPUT_PROMPT);
            
        switch (keyedInput.next().toLowerCase()) {
            case "a":
                System.out.println("\n    You squint at the screen, and tell him, ❝We should approach the fleet head-on. They won’t expect it, and our\n "
                        + "forces are extremely maneuverable.❞");
                System.out.println("    ❝You better not be wrong, " + username + ",❞ the general says, as he communicates the plan with the other ships, ❝the fate\n"
                        + " of the human race depends on it.❞");
                System.out.println("    You feel the ship suddenly speed up, and the enemy fleet seems to get bigger and bigger. You hear Rogers prepare the ship’s\n "
                        + "weaponry. Everyone buckles their seatbelts, when suddenly, Boom! You see the ship beside you become a ball of fire. Before you can understand\n "
                        + "what is happening, more explosions ring through the air, and you see blasts of pure, purple plasma coming from the direction of the extraterrestrial\n "
                        + "armada.  They had radar scanners, and managed to detect your sneak attack.");
                System.out.println("❝We’re under attack!❞ yells General Moss. The ship’s pilot, Patel, manages to steer through the rain of death and destruction, and your ship \n"
                        + "crash lands on Mars. When Moss sends out a communication, asking for the status of all ships, you learn that only one thousand remain. Most of humanity\n"
                        + " has been annihilated.\n");
                break;
            case "b":
                System.out.println("\n    You squint at the screen, and tell him, ❝We should sneak around the back of the fleet. They won’t be able to see us, and our\n"
                        + " forces will completely overwhelm them.❞");
                System.out.println("    ❝You better not be wrong, " + username + ",❞ the general says, as he communicates the plan with the other ships, ❝the fate\n"
                        + " of the human race depends on it.❞");
                System.out.println("    You feel the ship suddenly speed up, and the enemy fleet seems to get bigger and bigger. You hear Rogers prepare the ship’s\n "
                        + "weaponry. Everyone buckles their seatbelts, when suddenly, Boom! You see the ship beside you become a ball of fire. Before you can understand\n "
                        + "what is happening, more explosions ring through the air, and you see blasts of pure, purple plasma coming from the direction of the extraterrestrial\n "
                        + "armada. ");
                System.out.println("    ❝We’re under attack!❞ yells General Moss. The ship’s pilot, Patel, manages to steer through the rain of death and destruction, and your ship \n"
                        + "crash lands on Mars. When Moss sends out a communication, asking for the status of all ships, you learn that only one thousand remain. Most of humanity\n"
                        + " has been annihilated.\n");
                break;
            default:
                break;
        }
        
        //Decision 0.1
        System.out.println("a) Search the planet for resources.");
        System.out.println("b) Search the ship for resources.\n");
        System.out.print(INPUT_PROMPT);
        
        switch (keyedInput.next().toLowerCase()) {
            case "a":
                System.out.println("\n    ❝I'm gonna head out and try to find resources,❞ you tell your team, walking out onto the red surface. You keep walking around until you\n"
                        + "stumble upon the strangest creature that you have ever seen. It looks like a dog, but it is huge, purple, has seven eyes, and has knives for teeth.\n"
                        + "What do you do?\n");
                
                //Decision 0.1.1
                System.out.println("a) Fight.");
                System.out.println("b) Talk.");
                System.out.println("c) Retreat.\n");
                System.out.print(INPUT_PROMPT);
                
                switch (keyedInput.next().toLowerCase()) {
                    case "a":
                        System.out.println("\n    As the creature curiously looks at you, you pull out your blaster, and point it at its head. The alien, realizing the danger\n"
                                + "that he is in, bares his teeth and pounces at you. However, you manage to fire your blaster, and the dog falls to the ground mere \n"
                                + "milliseconds before it can bite you. As it succumbs to its wounds, it lets out a blood-curdling howl.");
                        System.out.println("\n    The creature's call summons many others of its kind, undoubtedly members of its now-grieving family. They stare at \n"
                                + "you, a murderer, in anger, baring their teeth and desiring vengeance.\n");
                        
                        // Decision 0.1.1.1
                        System.out.println("    Should you run or hold your ground?\n");
                        System.out.println("a) Fight.");
                        System.out.println("b) Run away.\n");
                        System.out.print(INPUT_PROMPT);
                        
                        switch (keyedInput.next().toLowerCase()) {
                            case "a":
                                System.out.println("\n    You grasp firmly onto your blaster, pointing it at your enemies, one by one. For a moment, both you and your \n"
                                        + "enemies are too afraid to make a move. You fire, shooting balls of plasmic light towards the alien group. They pounce, \n"
                                        + "and you cannot fight them all at once.");
                                System.out.println("\nGAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            case "b":
                                System.out.println("\n    You look around at the extraterrestial army, and know that you do not have a chance against them. You \n"
                                        + "turn around and run away, trying to get back to the ship. You quickly look back, and realize that every single alien \n"
                                        + "dog is chasing you. You keep running for what feels like eternity, and finally see the doors of the ship.");
                                System.out.println("\n    The door is open, and you sprint towards it. When you are about to step into the safety of the ship, \n"
                                        + "you feel one of the aliens pounce on your back and you fall over. You were so close.");
                                System.out.println("\nGAME OVER: YOU LOSE!");
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
                        
                        // Decision 0.1.1.2
                        System.out.println("a) Fight.");
                        System.out.println("b) Run.\n");
                        System.out.print(INPUT_PROMPT);
                        
                        switch (keyedInput.next().toLowerCase()) {
                            case "a":
                                System.out.println("\n    You pull out your blaster and point it at the alien's deformed skull. But before you can do \n"
                                        + "anything, it attacks.");
                                System.out.println("\nGAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            case "b":
                                System.out.println("\n    You turn around and try to run away, but your one leg does not get you very far. You fall on \n"
                                        + "the ground, and the alien licks its brown lips, ready for lunch.");
                                System.out.println("\nGAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                            default:
                                break;
                        }
                        
                        break;
                    case "c":
                        System.out.println("\n   ❝Nope,❝ you say, turning around 360° and running back to the ship. ❝There are some weird \n"
                                + "extraterrestial creatures around here, possibly hostile,❝ you tell them.");
                        System.out.println("    ❝Don't worry, we were just about to go find you. We got some parts from the ship's storage room and \n"
                                + "managed to get it up and going,❝ Patel tells you. ❝Hop in!❝");
                        System.out.println("    You get in the ship as the engines roar to life, and before you know it, you are once again zooming \n"
                                + "through the solar system to find the alien fleet. You hope you are not too late. What if they reached Earth already? \n"
                                + "What would they have done to the planet? To the people? TO YOUR FAMILY?");
                        System.out.println("    As your journey through the stars, you find a circular ship with strange-looking blasters and scanners, \n"
                                + "a ship which undoubtedly belongs to the extraterrestial invaders. Baxter Johnson Williams Smith, the ship's main \n"
                                + "weapon controller, already has his hand on the trigger. The general looks at you inquisitively, clearly wanting \n"
                                + "your expert opinion.\n");
                        
                        // Decision 0.1.1.3
                        System.out.println("a) Sneak in the ship.");
                        System.out.println("b) Attack.\n");
                        System.out.print(INPUT_PROMPT);
                        
                        switch (keyedInput.next().toLowerCase()) {
                            case "a":
                                System.out.println("\n    ❝We don't know how powerful their blasters and shields are,❞ you tell Patel. ❝I will go \n"
                                        + "in by myself.❞");
                                System.out.println("    You manage to sneak into the ship without triggering the alarms or the radars. So far so \n"
                                        + "good. You find an intersection, and there are three doors, labeled in an alien tongue. One has the \n"
                                        + "universal bathroom symbol, the second has a window that shows that it leads to the cockpit, and the last \n"
                                        + "door has a distinct blaster shape encarved onto the metal.");
                                
                                // Decision 0.1.1.3.1
                                while (true){
                                    System.out.println("    Which door do you choose?\n");
                                                                
                                    System.out.println("a) The bathroom.");
                                    System.out.println("b) The cockpit.");
                                    System.out.println("c) The weapon room.\n");
                                    System.out.print(INPUT_PROMPT);
                                
                                    switch (keyedInput.next().toLowerCase()) {
                                        case "a":
                                            System.out.println("\n    You walk through the enemy bathroom and find yourself in a strange hall. However, \n"
                                                    + "you do not realize that the aliens are watching you through security cameras. As you reach the end \n"
                                                    + "of the hall and walk through another door, they click a button on the dashboard and it closes \n"
                                                    + "behind you. Before you realize what is happening, the airlock is opened and you are flung \n"
                                                    + "into the vastness of outer space.");
                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                            return;
                                        case "b":
                                            if (!hasWeapon) {
                                                System.out.println("\n    You open the door to the cockpit, and stare blankly towards the two giant guards. \n"
                                                        + "Before you can react, they pull out their blasters and deal with the terran intruder.");
                                                System.out.println("\nGAME OVER: YOU LOSE!");
                                                System.out.println("------------------------------------------------------------------------------------------\n");
                                                return;
                                            }
                                            System.out.println("\n    You open the door to the cockpit, and stare blankly towards the two giant guards. \n"
                                                    + "Before you can react, they pull out their blasters, but you are faster. You point your weapon \n"
                                                    + "at them and hit both of your targets. You only have one left—the pilot—who you promptly deal \n"
                                                    + "with.\n    You run the ship's life scanners and realize that there were no other aliens in this \n"
                                                    + "vessel. This is now YOUR ship. Do you want to blend in with the enemy fleet, or try to locate \n"
                                                    + "the alien mothership?\n");
                                            
                                            // Decision 0.1.1.3.1.2
                                            System.out.println("a) Blend in with enemy fleet.");
                                            System.out.println("b) Try to locate alien mothership.\n");
                                            System.out.print(INPUT_PROMPT);
                                            
                                            switch (keyedInput.next().toLowerCase()) {
                                                case "a":
                                                    System.out.println("\n    You decide to join the enemy fleet, to blend in and try to find out \n"
                                                            + "their plan. You follow them for a few hours until they reach Earth. Oh no. You cannot \n"
                                                            + "do anything now. It's too late.");
                                                    System.out.println("\n    You see the alien fleets charging up their plasma cannons, and can only \n"
                                                            + "helplessly watch as Earth is destroyed. As it turns into a ball of fire, all you can \n"
                                                            + "think of is your poor family and how you failed them.");
                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                                case "b":
                                                    System.out.println("\n    You decide to manoeuvre through the fleet, and finally locate the giant \n"
                                                            + "mothership. It is impossible to miss, as it dwarfs all of the other ships, and has a \n"
                                                            + "distinct blood-red colour, which shines in the sun's light.");
                                                    System.out.println("\n    You need to do something. Destroy it maybe. Or get in and find the \n"
                                                            + "aliens' plans.\n");
                                                    
                                                    // Decision 0.1.1.3.1.2.1
                                                    System.out.println("a) Fire at the ship's weak spot and destroy it.");
                                                    System.out.println("b) Sneak into the ship.\n");
                                                    System.out.print(INPUT_PROMPT);
                                                    
                                                    switch (keyedInput.next().toLowerCase()) {
                                                        case "a":
                                                            System.out.println("\n    You charge up your cannon and shoot it at the mothership's engines. But \n"
                                                                    + "right before it hits, its seemingly stopped by an invisible object. A force field. The \n"
                                                                    + "cannon blast bounces back and hits your ship. You don't have a force field.");
                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                            return;
                                                        case "b":
                                                            System.out.println("\n    You sneak into the mothership, and see three giant doors. They are all labelled, \n"
                                                                    + "but in symbols and shapes that are obviously alien. There are no icons or windows to help you out. You \n"
                                                                    + "just need to pick a door.\n");
                                                            
                                                            // Decision 0.1.1.3.1.2.1.1
                                                            System.out.println("a) Far left door.");
                                                            System.out.println("b) Middle door.");
                                                            System.out.println("c) Far right door.\n");
                                                            System.out.print(INPUT_PROMPT);
                                                            
                                                            switch (keyedInput.next().toLowerCase()) {
                                                                case "a":
                                                                    System.out.println("\n    You open the door to see an alien creature that looks like a giant lizard. It is bright pink, has \n"
                                                                            + "six heads, and many sharp teeth. The creature smiles as the door closes behind you. It's lunch time.");
                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                    return;
                                                                case "b":
                                                                    System.out.println("\n    Oh, that was the door to the airlock. You should not have opened that.");
                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                    return;
                                                                case "c":
                                                                    System.out.println("\n    You find the engine room and walk inside. You feel the blaster in your pocket. You can be a hero.\n"
                                                                            + "You can stop the alien invasion by destroying these engines. The resulting blast would disintegrate all of the \n"
                                                                            + "nearby enemy ships. But if you do it, you will never be able to see your family again. What do you do?\n");
                                                                    
                                                                    // Decision 0.1.1.3.1.2.1.1.1
                                                                    System.out.println("a) Destroy the engines.");
                                                                    System.out.println("b) Explore a bit more.\n");
                                                                    System.out.print(INPUT_PROMPT);
                                                                    
                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                        case "a":
                                                                            System.out.println("\n    You look at the engines surrounding you, and the blaster in your hand. You know what you have to do. All you can think \n"
                                                                                    + "of is your family as you blow the enemy fleet to smithereens.");
                                                                            System.out.println("\nGAME OVER: YOU WIN!\nGOOD ENDING #1\nSELF-SACRIFICE");
                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                            return;
                                                                        case "b":
                                                                            System.out.println("\n    You start to explore the engine room, and eventually find a door. You open it and walk through, and it suddenly closes \n"
                                                                                    + "behind you. You see two doors in front of you, each one labelled with the extraterrestial symbols. Which door do you pick?\n");
                                                                            
                                                                            // Decision 0.1.1.3.1.2.1.1.1.1
                                                                            System.out.println("a) Left door.");
                                                                            System.out.println("b) Right door.\n");
                                                                            System.out.print(INPUT_PROMPT);
                                                                            
                                                                            switch (keyedInput.next().toLowerCase()) {
                                                                                case "a":
                                                                                    System.out.println("\n   You click the button to open to left door and enter. The minute you step in, the door shuts close behind you and red lights \n"
                                                                                            + "start to flash, accompanied by an unmistake alarm. You pull out your blaster, ready for the worst. The door suddenly opens, and four aliens \n"
                                                                                            + "stand there, ready to take out the threat.");
                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                    return;
                                                                                case "b":
                                                                                    System.out.println("\n   You open the right door and enter the room. You see two aliens drinking a blue, bubbly drink, \n"
                                                                                            + "and instinctively pull out your blaster. So do they. What do you do?\n");
                                                                                    
                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1
                                                                                    System.out.println("a) Fight.");
                                                                                    System.out.println("b) Negotiate.");
                                                                                    System.out.println("c) Retreat.\n");
                                                                                    System.out.print(INPUT_PROMPT);
                                                                                    
                                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                                        case "a":
                                                                                            System.out.println("\n    You decide to defend yourself, but are outnumbered. You lose the gun fight.");
                                                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                            return;
                                                                                        case "b":
                                                                                            System.out.println("\n    ❝Wait,❞ you tell the aliens, who enable their global translation apparatus (GTA). What do you tell them?\n");
                                                                                            
                                                                                            // Decision 0.1.1.3.1.2.1.1.1.1.1.1
                                                                                            System.out.println("a) ❝Stop your attack.❞");
                                                                                            System.out.println("b) ❝Take me to your leader.❞");
                                                                                            System.out.println("c) ❝I want to join you.❞\n");
                                                                                            System.out.print(INPUT_PROMPT);
                                                                                            
                                                                                            switch (keyedInput.next().toLowerCase()) {
                                                                                                case "a":
                                                                                                    System.out.println("\n    ❝Stop your attack,❞ you tell them. They stare at you for a second, before letting out an unmistakable \n"
                                                                                                            + "laugh. They point their blasters at you, and you know that you have failed your mission.");
                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                    return;
                                                                                                case "b":
                                                                                                    System.out.println("\n    ❝Take me to your leader,❞ you tell them. They look at each other, whisper something, and look back at you. Pulling out \n"
                                                                                                            + "some handcuffs, they order you, ❝Put these on,❞ and you comply. They take you to their leader, a giant purple alien with a black metal brown. \n"
                                                                                                            + "     They whisper something to him, and he says, ❝Thou, a filthy terran, came here to negotiate with us? Never.❞ He commands his cronies with \n"
                                                                                                            + "words that you don't understand. They pull out their blasters, and then it hits you. He thought you came to negotiate and doesn't want to any \n"
                                                                                                            + "of that, so he ordered his cronies to get rid of you.");
                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                    break;
                                                                                                case "c":
                                                                                                    System.out.println("\n    The aliens look at you, confused, before hurriedly whispering to each other. After a few minutes of discussion, one of them looks \n"
                                                                                                            + "back at you and says, ❝Can you prove your loyalty, terran?❞");
                                                                                                    System.out.println("    You are about to give them your blaster, but then remember a picture that you have of your family. If you tear that up, they might accept \n"
                                                                                                            + "that gesture as a proof of your allegiance. What do you do?\n");
                                                                                                    
                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1
                                                                                                    System.out.println("a) Tear photo.");
                                                                                                    System.out.println("b) Hand over blaster.\n");
                                                                                                    System.out.print(INPUT_PROMPT);
                                                                                                    
                                                                                                    if (keyedInput.next().toLowerCase().equals("b")) {
                                                                                                        hasWeapon = false;
                                                                                                    }
                                                                                                    
                                                                                                    System.out.println("\n    The extraterrestials accept your gesture of loyalty, and take you through the ship to the throne room. When you step inside, you see the \n"
                                                                                                            + "giant leader. He looks like the rest of the aliens, but is much bigger, has tentacles, and some kind of black ring-shaped device on his head. You \n"
                                                                                                            + "immediately recognize it. It's a controller chip! This means that all of the aliens are part of a hive mind—if the leader's neural links are severed, \n"
                                                                                                            + "then the entire army will fall. Earth will be saved.");
                                                                                                    
                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.1
                                                                                                    if (hasWeapon) {
                                                                                                        System.out.println("    Fortunately, you chose not to give up your weapon to prove your allegiance. Do you want to try to assassinate the leader and end \n"
                                                                                                                + "the invasion on Earth?\n");
                                                                                                        
                                                                                                        System.out.println("a) Yes.");
                                                                                                        System.out.println("b) No.\n");
                                                                                                        System.out.print(INPUT_PROMPT);
                                                                                                        
                                                                                                        switch (keyedInput.next().toLowerCase()) {
                                                                                                            case "a":
                                                                                                                System.out.println("\n    You pull out your blaster and fire a plasma shot straight at the leader. Before anybody can react or stop you, the leader falls off \n"
                                                                                                                        + "his metal throne. The rest of the aliens stare at you blankly, before also crumpling to the floor.");
                                                                                                                System.out.println("\nGAME OVER: YOU WIN!\nGOOD ENDING #2\nTHE ASSASSIN");
                                                                                                                System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                return;
                                                                                                            case "b":
                                                                                                                break; //continue to next option
                                                                                                            
                                                                                                            default:
                                                                                                                System.out.println("ERROR: INVALID INPUT @ DECISION 15");
                                                                                                                return;
                                                                                                        }
                                                                                                    } else {
                                                                                                        System.out.println("\n    Sigh. You shouldn't have given up your blaster. Otherwise you might have been able to end this, once and for all.");
                                                                                                    }
                                                                                                    
                                                                                                    System.out.println("\n    ❝Terran,❞ the leader asks, ❝does thou swear thine allegiance to the Solar Sovereign State?❞");
                                                                                                    
                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2
                                                                                                    System.out.println("a) Yes.");
                                                                                                    System.out.println("b) Never!\n");
                                                                                                    System.out.print(INPUT_PROMPT);
                                                                                                    
                                                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                                                        case "a":
                                                                                                            System.out.println("\n    ❝Of course I do, sir,❞ you tell him. ❝What do you want me to do?❞");
                                                                                                            System.out.println("    ❝Here are the coordinates to a known terran base,❞ he tells you, as one of his cronies brings you a holographic device displaying \n"
                                                                                                                    + "a bunch of numbers. ❝Thy mission is to find these terrans and utterly destroy them. Does thou accept?\n❞");
                                                                                                            
                                                                                                            // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1
                                                                                                            System.out.println("a) Yes.");
                                                                                                            System.out.println("b) No.\n");
                                                                                                            System.out.print(INPUT_PROMPT);
                                                                                                            
                                                                                                            switch (keyedInput.next().toLowerCase()) {
                                                                                                                case "a":
                                                                                                                    System.out.println("\n    ❝Of course I do, sir,❞ you tell the leader.");
                                                                                                                    System.out.println("    You go to the target coordinates along with a small team of six other aliens. When you reach the planet, you see what appears to \n"
                                                                                                                            + "be a crashed human ship. What do you do?\n");
                                                                                                                    
                                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.2
                                                                                                                    System.out.println("a) Explore the ship.");
                                                                                                                    System.out.println("b) Attack the ship.");
                                                                                                                    System.out.println("c) Go back.\n");
                                                                                                                    System.out.print(INPUT_PROMPT);
                                                                                                                    
                                                                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                                                                        case "a":
                                                                                                                            System.out.println("\n    You get out of the vessel that the leader provided for your transport, and start walking around the human spaceship. You're trying \n"
                                                                                                                                    + "to find survivors, trying to save them and make sure the rest of your 'team' does not find them first. Suddenly, you heard a *BOOM* from somewhere in the engine \n"
                                                                                                                                    + "room. Oh no. It's a decoy ship which was meant as a trap for the aliens! You turn on your heels and run as fast as your legs can take you, but it's not fast enough.");
                                                                                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                            return;
                                                                                                                        case "b":
                                                                                                                            System.out.println("\n    You decide to fire at the ship, whispering a quick 'sorry' under your breath. As your barrages come in contact with the ship's engine, it bursts into \n"
                                                                                                                                    + "a ball of flames. Oh no. It was a decoy meant for the aliens. Oh no. All you can do is watch as you are engulfed by the remaining flames.");
                                                                                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                            return;
                                                                                                                        case "c":
                                                                                                                            System.out.println("\n    ❝We need to leave,❞ you tell the alien crew who is with you. ❝I have worked with these hum—these terrans for years. This is obviously nothing \n"
                                                                                                                                    + "more than a decoy ship that's meant to destroy us if we try to interact with it.❞");
                                                                                                                            System.out.println("    ❝We think that thou are not but trying to make fools of us,❞ they reply. ❝Thou are simply too sentimental to harm thine own kind!❞");
                                                                                                                            System.out.println("    ❝Very well,❞ you tell them, ❝then don't listen to me. But let me get a safe distance away before you guys try anything stupid!❞");
                                                                                                                            System.out.println("    Your certainty seems to convince them. They look at each other, and then say, ❝What about the leader? He would feed us to the Perlacertiliasaurus!❞");
                                                                                                                            System.out.println("    ❝Listen, we just need to tell him that we carried out the job. There's no way he's comin' out here to check. If you guys back up my story, we'll be good.❞");
                                                                                                                            System.out.println("    Having agreed to the plan, you leave the planet and return to the leader. However, the minute you see him, perched high on his throne, surrounded by guards, \n"
                                                                                                                                    + "you start to think lying is a bad idea. It's way to risky. But at the same time, you have already promised the others that you would do it... What are you going to do?\n");
                                                                                                                            
                                                                                                                            // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.2.1
                                                                                                                            System.out.println("a) Tell the truth.");
                                                                                                                            System.out.println("b) Lie");
                                                                                                                            
                                                                                                                            switch (keyedInput.next().toLowerCase()) {
                                                                                                                                case "a":
                                                                                                                                    System.out.println("\n    The leader is extremely disappointed when he hears the news. The aliens were right. He feeds you to the Perlacertiliasaurus, which turns out to be a giant \n"
                                                                                                                                            + "bright pink alien lizard, with six heads and long, sharp teeth.");
                                                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                                    return;
                                                                                                                                case "b":
                                                                                                                                    System.out.println("\n    You decide to lie to the leader, and surprisingly, your plan works.");
                                                                                                                                    System.out.println("    ❝Well done, terran.❞ he tells you. ❝I must say, thou has surprised me. I do have another mission for thee. Take thou this blaster of mine, a brand new model, \n"
                                                                                                                                            + "and use it to destroy the terran rebellion on Europa, one of the moons of Jupiter. Do thou accept?❞\n");
                                                                                                                                    
                                                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.2.1.1
                                                                                                                                    System.out.println("a) Accept the mission.");
                                                                                                                                    System.out.println("b) Betray the leader.\n");
                                                                                                                                    System.out.print(INPUT_PROMPT);
                                                                                                                                    
                                                                                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                                                                                        case "a":
                                                                                                                                            System.out.println("\n    As you are flying to Europa to carry out your job, you see an alien fleeting heading to Earth. You know that they're going to destroy it. What do you do?\n");
                                                                                                                                            
                                                                                                                                            // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.2.1.1.1
                                                                                                                                            System.out.println("a) Stand there and do nothing.");
                                                                                                                                            System.out.println("b) Attack the enemy ships.\n");
                                                                                                                                            System.out.print(INPUT_PROMPT);
                                                                                                                                            
                                                                                                                                            switch (keyedInput.next().toLowerCase()) {
                                                                                                                                                case "a":
                                                                                                                                                    System.out.println("\n    You stand there and watch as the aliens attack. China, America, and India fall. Other big countries fall soon after. Within mere minutes, \n"
                                                                                                                                                            + "the entire planet is left to ruins. You hear the report over the PA systems, ❝No survivors.❞ Oh no. Your family. What have you done.");
                                                                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                                                    return;
                                                                                                                                                case "b":
                                                                                                                                                    System.out.println("\n    ❝NOOOOOO,❞ you scream, firing at the aliens. Many big ships fall, crash landing on Earth. You don't stop, and the fleet slowly diminishes.");
                                                                                                                                                    System.out.println("\n    ❝The terran has turned,❞ you suddenly hear over the PA system, ❝destroy the terran!❞ You try to get out, but you realize that your ship has been locked. \n"
                                                                                                                                                            + "You see the mothership come closer and closer to you, and know the leader is going to get his revenge. You see the ship's largest cannon power up, and then you see nothing at all.");
                                                                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                                                    return;
                                                                                                                                                default:
                                                                                                                                                    System.out.println("ERROR: INVALID INPUT @ DECISION 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.2.1.1.1");
                                                                                                                                                    return;
                                                                                                                                            }                                                                                                                                            
                                                                                                                                        case "b":
                                                                                                                                            System.out.println("\n    ❝Actually 'sir',❞ you say, picking up the blaster, ❝there's been a slight change of plans.❞ You point it at the leader, and with a swish of your \n"
                                                                                                                                                    + "finger, he falls off his throne. The rest of the aliens stare at you blankly, before also crumpling to the floor.");
                                                                                                                                            System.out.println("\nGAME OVER: YOU WIN!\nGOOD ENDING #3\nTHE TRIPLE CROSS");
                                                                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                                            return;
                                                                                                                                        default:
                                                                                                                                            System.out.println("ERROR: INVALID INPUT @ DECISION 20");
                                                                                                                                            return;
                                                                                                                                    }
                                                                                                                                default:
                                                                                                                                    System.out.println("ERROR: INVALID INPUT @ DECISION 19");
                                                                                                                                    return;
                                                                                                                            }
                                                                                                                        default:
                                                                                                                            System.out.println("ERROR: INVALID INPUT @ DECISION 18");
                                                                                                                            return;
                                                                                                                    }
                                                                                                                case "b":
                                                                                                                    System.out.println("\n    ❝How dare thou refuse my order,❞ the leader asks you, ❝what is thy problem?\n❞");
                                                                                                                    
                                                                                                                    // Decision 0.1.1.3.1.2.1.1.1.1.1.1.1.2.1.1
                                                                                                                    System.out.println("a) I cannot harm other humans!");
                                                                                                                    System.out.println("b) I actually came here to end the invasion!\n");
                                                                                                                    System.out.print(INPUT_PROMPT);
                                                                                                                    
                                                                                                                    switch (keyedInput.next().toLowerCase()) {
                                                                                                                        case "a":
                                                                                                                            System.out.println("\n    ❝I'm sorry sir, but I cannot harm other fellow hum—I mean, terrans. Is there any other mission \n"
                                                                                                                                    + "that you can give me?❞");
                                                                                                                            System.out.println("    ❝I am very disappointed in thee,❞ the leader tells you, ❝Guards! Get rid of this creature!❞");
                                                                                                                            break;
                                                                                                                        case "b":
                                                                                                                            System.out.println("\n    ❝To be honest 'sir,' I just came here to get rid of you and end this invasion. Say goodbye.❞");
                                                                                                                            System.out.println("    The leader stares for a second, before he bursts into laughter and says, ❝Guards, deal with this foolish being.❞");
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            System.out.println("ERROR: INVALID INPUT @ DECISION 18");
                                                                                                                            return;                                                                                                                    
                                                                                                                    }
                                                                                                                    
                                                                                                                    // No matter what they say in decision 18, they lose the game.
                                                                                                                    System.out.println("    The guards step towards you with their weapons in their hands. You can only watch as they slowly power up and shoot out a blast \n"
                                                                                                                            + "of plasma.");
                                                                                                                    
                                                                                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                                    return;
                                                                                                                default:
                                                                                                                    System.out.println("ERROR: INVALID INPUT @ DECISION 17");
                                                                                                                    return;
                                                                                                            }                                                                                                           
                                                                                                        case "b":
                                                                                                            System.out.println("\n    ❝Never,❞ you tell him in defiance.");
                                                                                                            System.out.println("    ❝Then what are thou doing here, filthy terran,❞ the leader replies in defiance. Turning to his cronies, he tells \n"
                                                                                                                    + "them, ❝Get rid of this disgusting creature. Hurl it off the ship.❞");
                                                                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                                            return;
                                                                                                        default:
                                                                                                            System.out.println("ERROR: INVALID INPUT @ DECISION 16");
                                                                                                            return;
                                                                                                    }
                                                                                                default:
                                                                                                    System.out.println("ERROR: INVALID INPUT @ DECISION 13");
                                                                                                    return;
                                                                                            }
                                                                                            break;
                                                                                        case "c":
                                                                                            System.out.println("\n    You turn around, trying to run away, but realize, much to your horror, that the door has shut behind you. You\n"
                                                                                                    + "hear the alien's blasters go off behind you.");
                                                                                            System.out.println("\nGAME OVER: YOU LOSE!");
                                                                                            System.out.println("------------------------------------------------------------------------------------------\n");
                                                                                            return;
                                                                                        default:
                                                                                            System.out.println("ERROR: INVALID INPUT @ DECISION 12");
                                                                                            return;
                                                                                    }
                                                                                    break;
                                                                                default:
                                                                                    System.out.println("ERROR: INVALID INPUT @ DECISION 11");
                                                                                    return;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            System.out.println("\nERROR: INVALID INPUT @ DECISION 10");
                                                                            return;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                    break;
                                            }  
                                            break;
                                        case "c":
                                            if (hasWeapon) {
                                                System.out.println("\n    You go back into the weapon room. You have already picked up the blaster and \n"
                                                        + "the rest of the ewapons are under lock and key. You leave the room.");
                                                break; // Return to decision 6
                                            }
                                            
                                            System.out.println("\n    You walk into the weapon room and find that all of the weapons are inside of locked \n"
                                                    + "storage containers, except a plasma blaster lying on the table. What do you do?\n");
                                            
                                            // Decision 0.1.1.3.1.1
                                            
                                            System.out.println("a) Take it.");
                                            System.out.println("b) Leave room.\n");
                                            System.out.print(INPUT_PROMPT);
                                            
                                            switch (keyedInput.next().toLowerCase()) {
                                                case "a":
                                                    System.out.println("\n    You pick up the blaster and feel the plasmic power pulsating within it. You leave \n"
                                                                + "the room, weapon in hand.");
                                                    hasWeapon = true;
                                                    break; // return to decision 0.1.1.3.1
                                                case "b":
                                                    System.out.println("You leave the room, returning to the hall.");
                                                    break; // return to decision 0.1.1.3.1
                                                default:
                                                    break;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            case "b":
                                System.out.println("\n    ❝Go for it, Patel,❞ you tell him.");
                                System.out.println("    ❝Will do, " + username + ",❞  you tell him. He clicks the button, and a blast of plasma \n"
                                        + "fires from the ship's cannon, flies towards the enemy shuttle, and goes right through. It is a decoy. \n"
                                        + "Your ship's radar suddenly beeps, and you all realize that the real ship is behind you. It charges \n"
                                        + "its blaster and fires.");
                                System.out.println("\nGAME OVER: YOU LOSE!");
                                System.out.println("------------------------------------------------------------------------------------------\n");
                                return;
                        }
                        break;
                    default:
                        System.out.println("ERROR: INVALID INPUT @ DECISION 6");
                        break;
                }
                
                break;
            case "b":
                System.out.println("\n    You do not know whether the extraterrestial enemies have already taken control of Mars, so you decide to explore the ship instead, trying\n"
                        + "to find resources to fix your ship. You walk around the ship until you reach an intersection.\n");
                
                // Decision 0.1.2
                while (true) {
                    System.out.println("    Which room would you like to go to?\n");
                    System.out.println("a) Communication room.");
                    System.out.println("b) Storage room.\n");
                    System.out.print(INPUT_PROMPT);
                
                    switch (keyedInput.next().toLowerCase()) {
                        case "a":
                            System.out.println("\n    You walk into the ship's communication room and find a large device which you immediately recognize as being the Intergalactic\n"
                                    + "communicator. Do you want to try to send a message to other surviving ships, so you can team up to defeat the aliens?\n");
                            
                            // Decision 0.1.2.1
                            System.out.println("a) Try to communicate.");
                            System.out.println("b) Leave room.\n");
                            System.out.print(INPUT_PROMPT);
                            
                            switch (keyedInput.next().toLowerCase()) {
                                case "a":
                                    System.out.println("    \nYou send out an SOS signal with your coordinates, and the computer lets out a successful *beep*. You wait patiently for a response,\n"
                                            + "and then you see it; a huge ship just outside the planet's atomosphere. Suddenly, your heart drops. That's not a human ship. The aliens must have \n"
                                            + "intercepted your message!");
                                    System.out.println("    A laser beam powers up from the ship, and fires towards Mars, destroying the entire planet.");
                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                    return;
                                case "b":
                                    break; //return to decision 0.1.2
                                default:
                                    break;
                            }
                            break;
                        case "b":
                            System.out.println("\n    You enter the storage room and sigh in relief, as you find a bunch of materials and resources needed to fix the ship. As you and your crewmates start the \n"
                                    + "repairs, you hear a sound outside. When you peer out the air-tight window, you realize that it is an alien ship that is looking for survivors. What do you do?\n");
                            
                            //Decision 0.1.2.2
                            System.out.println("a) Fire at the ship.");
                            System.out.println("b) Hide in the ship.\n");
                            System.out.print(INPUT_PROMPT);
                            
                            switch (keyedInput.next().toLowerCase()) {
                                case "a":
                                    System.out.println("\n    You run to the control room, yelling, ❝Aliens! They're here! We need to fire the weapons!❞");
                                    System.out.println("    ❝You heard him,❞ General Moss says to the weapon crew, ❝we get them before they get us.❞");
                                    System.out.println("    You see the weapon crew charge up their blaster cannons, and a bright light and a loud sound confirms that the alien ship is no more. However, before\n"
                                            + "you can celebrate, a group of alien canine-like creatures surrounds the ship. There are too many to fight off, and the space dogs are happy to have found their lunch.");
                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                    return;
                                case "b":
                                    System.out.println("\n    You run to the control room, yelling, ❝Aliens! They're here! We need to hide in the ship!❞");
                                    System.out.println("    ❝You heard him,❞ General Moss says to the crew, ❝power off the ship and hide before they board.❞");
                                    System.out.println("    You run around, drastically trying to find a place to hide, and you stumble upon a closet, which is large enough for you to crawl into. As you shut the\n"
                                            + "doors behind you, you see two aliens with high-grade blasters walking through the hall. You feel your own blaster in your pocket, and put your hand on it.\n");
                                   
                                    // Decision Decision 0.1.2.2.1
                                    System.out.println("a) Jump out of the closet and shoot the intruders.");
                                    System.out.println("b) Stay hidden.\n");
                                    System.out.print(INPUT_PROMPT);
                                    
                                    switch (keyedInput.next().toLowerCase()) {
                                        case "a":
                                            System.out.println("\n    You take a deep breath, and kick the door open. The aliens look back at you, but before they can react, you release two blasts of light from your \n"
                                                    + "blaster, which both hit their mark. The loud noise, howevever, attracts the rest of the aliens to your location, just like a magnet. You look down at your blaster, \n"
                                                    + "and then at the closet that you just came out of. What do you do?\n");
                                           
                                            // Decision 0.1.2.2.1.1
                                            System.out.println("a) Hide back in the closet.");
                                            System.out.println("b) Fight the aliens.");
                                            System.out.println("c) Stay still, and hope that the aliens are blind.\n");
                                            System.out.print(INPUT_PROMPT);
                                            
                                            switch(keyedInput.next().toLowerCase()) {
                                                case "a":
                                                    System.out.println("\n    You move quickly, hiding back into the closet, closing the door behind you. A whole swarm of aliens storms into the hallway, and all of them \n"
                                                            + "are armed. You see one of them holding a device. Oh no. It's a lifeform detector. As it beeps, you realize that you have been caught.");
                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                                case "b":
                                                    System.out.println("\n    You pull out your blaster as no less than twenty aliens, all armed, walk into the hallway, surrounding you. You starting firing your blaster, \n"
                                                            + "and a few them fall to the ground. However, reinforcements are quickly streaming into the hall, and you are no match for them.");
                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                                case "c":
                                                    System.out.println("\n    You rememeber watching Guardians of the Galaxy, and remember the scene where Drax became invisible by standing still. You decide to try out his \n"
                                                            + "strategy, but as the aliens surround you and power up their blasters, you realize that Marvel lied to you.");
                                                    System.out.println("\nGAME OVER: YOU LOSE!");
                                                    System.out.println("------------------------------------------------------------------------------------------\n");
                                                    return;
                                            }
                                            break;
                                        case "b":
                                            System.out.println("\n    You let go of the gun. What were you thinking, you ask yourself. You can't possibly take on both of them at once. Besides, they don't even know\n"
                                                    + "that you're here, " + username + ". You're perfectly safe! Suddenly, you hear a loud beeping noise, and both the aliens turn to face you. They have a life-detection\n"
                                                    + "scanner. You might have spoken too soon. You can't do anything as one of them aims their plasma blaster at the door and pulls the trigger.");
                                            System.out.println("\nGAME OVER: YOU LOSE!");
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
