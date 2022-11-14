/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noohalaviassignment16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author s201119359
 */
public class NoohAlaviAssignment16 {

    final String fileUrl = "users.txt";

    private static class User {
        String firstName;
        String lastName;
        
        String email;
        String password;
        
        public User(String _firstName, String _lastName, String _email, String _password) {
            firstName = _firstName;
            lastName = _lastName;
            email = _email;
            password = _password;
        }
    }
    
    private static String getUsers() {
        StringBuilder contentBuilder = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                contentBuilder.append(currentLine).append("\n");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    
    public static void main(String[] args) {
        
        final String INPUT_PROMPT = ">>> ";
        
        Scanner keyedInput = new Scanner(System.in);
        
        String choice;
        String email;
        String password;
        
        String newPassword1;
        String newPassword2;
        
        String firstName;
        String lastName;
        
        ArrayList<User> users = new ArrayList<> ();
        //users = getUsers();
        System.out.println(getUsers());
        
        while (true) {
            System.out.println("--------------------");
            
            System.out.println("Welcome!");
            System.out.println("a) Log in.");
            System.out.println("b) Sign up.");
            System.out.println("c) List all users.");
            
            System.out.print(INPUT_PROMPT);
            
            choice = keyedInput.next();
            
            switch (choice) {
                case "a":
                    // Sign into existing account
                    System.out.println("Enter your email: ");
                    System.out.print(INPUT_PROMPT);
                    email = keyedInput.next();
                    
                    for (User user : users) {
                        if (user.email.equals(email)) {
                            System.out.println("Enter your password: ");
                            System.out.print(INPUT_PROMPT);
                            password = keyedInput.next();
                            
                            if (user.password.equals(password)) {
                                System.out.println("You have successfully signed in.");
                                System.out.println("Welcome, " + user.firstName + "!");
                            }
                            break;
                        }
                    }
                    
                    System.out.println("Account with email address '" + email + "' not found! Double check the spelling or make a new account.");
                    break;
                case "b":
                    // Make new account
                    System.out.println("Enter your email: ");
                    System.out.print(INPUT_PROMPT);
                    email = keyedInput.next();
                    
                    for (User user : users) {
                        if (user.email.equals(email)) {
                            System.out.println("Email '" + email + "' is already being used by another account!");
                            break;
                        }
                    }
                
                    System.out.println("Enter your password: ");
                    System.out.print(INPUT_PROMPT);
                    newPassword1 = keyedInput.next();
                    
                    System.out.println("Confirm your password: ");
                    System.out.print(INPUT_PROMPT);
                    newPassword2 = keyedInput.next();
                    
                    if (!(newPassword1.equals(newPassword2))) {
                        System.out.println("The passwords '" + newPassword1 + "' and '" + newPassword2 + "' do not match!");
                        break;
                    }
                    
                    System.out.println("Enter your first name: ");
                    System.out.print(INPUT_PROMPT);
                    firstName = keyedInput.next();
                    
                    System.out.println("Enter your last name: ");
                    System.out.print(INPUT_PROMPT);
                    lastName = keyedInput.next();
                    
                    // Make new user
                    User newUser = new User(firstName, lastName, email, newPassword1);
                    
                    // Add user to array
                    users.add(newUser);
                    
                    System.out.println("User '" + firstName + " " + lastName + " (" + email + ")' successfully created!");
                    break;
                case "c":
                    // Show list of all users in format
                    // First Last (email)
                    // For example:
                    // John Doe (johndoe@alavimail.com)
                    for (User currentUser : users) {
                        System.out.println(currentUser.firstName + " " + currentUser.lastName + " (" + currentUser.email + ")");
                    }
                    break;
                default:
                    break;
            }
        }
    } 
}
