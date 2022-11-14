import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class NoohAlaviAssignment16 {

    static final String FILE_URL = "users.txt";
    static ArrayList<User> users = new ArrayList<>();

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

        public void print() {
            // Prints out data related to this user
            System.out.println(this.firstName + " " + this.lastName + " (" + this.email + ")");
        }

        public String toString() {
            // Convert user data to saveable string
            return this.firstName + "," + this.lastName + "," + this.email + "," + this.password;
        }
    }

    private static void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_URL))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] newUserData = currentLine.split(",");
                User newUser = new User(
                    newUserData[0],
                    newUserData[1],
                    newUserData[2],
                    newUserData[3]);

                users.add(newUser);
            }
            reader.close();
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println("Finished loading data from '" + FILE_URL + "'!");
    }

    private static void saveToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_URL, true))) {
            writer.write("\n" + text);
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
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

        loadData();

        while (true) {
            System.out.println("------------------------------");

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

                    System.out.println("Account with email address '" + email
                            + "' not found! Double check the spelling or make a new account.");
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
                        System.out.println(
                                "The passwords '" + newPassword1 + "' and '" + newPassword2 + "' do not match!");
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

                    // Add user to array and save to file
                    users.add(newUser);
                    saveToFile(newUser.toString());

                    System.out.println("User '" + firstName + " " + lastName + " (" + email + ")' successfully created!");
                    break;
                case "c":
                    // Show list of all users in format
                    // First Last (email)
                    // For example:
                    // John Doe (johndoe@alavimail.com)
                    for (User user : users) {
                        user.print();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
