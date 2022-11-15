package noohalaviassignment16;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class NoohAlaviAssignment16 {
    static final String PARENT_FOLDER = "src/noohalaviassignment16";
    static final String FILE_TYPE = ".txt";
    
    static final String USERS_FILE_URL = PARENT_FOLDER + "/users" + FILE_TYPE;
    static final String POSTS_FOLDER = PARENT_FOLDER + "/posts";
    
    static ArrayList<User> users = new ArrayList<>();

    private static class User {
        private final String FIRST_NAME;
        private final String LAST_NAME;

        private final String EMAIL;
        private final String PASSWORD;
        
        private ArrayList<String> posts;

        public User(String _firstName, String _lastName, String _email, String _password) {
            FIRST_NAME = _firstName;
            LAST_NAME = _lastName;
            EMAIL = _email;
            PASSWORD = _password;
            
            posts = new ArrayList<>();
        }
        
        public String getFirstName() {
            return this.FIRST_NAME;
        }
        
        public String getLastName() {
            return this.LAST_NAME;
        }
        
        public String getEmail() {
            return this.EMAIL;
        }
        
        public String getPassword() {
            return this.PASSWORD;
        }
        
        public ArrayList<String> getPosts() {
            return this.posts;
        }
        
        public void loadPosts() {
            // clear posts
            this.posts = new ArrayList<>();
            
            // Get file name
            String fileUrl = POSTS_FOLDER + "/" + this.EMAIL + FILE_TYPE;
            
            // Get file
            try (BufferedReader reader = new BufferedReader(new FileReader(fileUrl))) {
                String currentLine;
                while ((currentLine = reader.readLine()) != null) {
                    this.posts.add(currentLine);
                }
                reader.close();
                System.out.println("Finished loading data from '" + fileUrl + "'!");
            } catch(Exception e) {
            }
        }
        
        public void newPost(String newPost) {
            this.posts.add(newPost);
            
            // Generate or get file
            String fileUrl = POSTS_FOLDER + "/" + this.EMAIL + FILE_TYPE;
            System.out.println("Saving to " + fileUrl);
            
            // Save to file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileUrl))) {
                for (String post : this.posts) {
                    writer.write(post + "\n");
                }
                writer.close();
            } catch(Exception e) {
            }
        }

        public String getPrintable() {
            // Prints out data related to this user
            return (this.FIRST_NAME+ " " + this.LAST_NAME + " (" + this.EMAIL + ")");
        }

        @Override
        public String toString() {
            // Convert user data to saveable string
            return this.FIRST_NAME + "," + this.LAST_NAME + "," + this.EMAIL + "," + this.PASSWORD;
        }
    }

    private static void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE_URL))) {
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
            System.out.println("Finished loading data from '" + USERS_FILE_URL + "'!");
        } catch(Exception e) {
        }
    }

    private static void saveToFile(String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE_URL, true))) {
            writer.write("\n" + text);
            writer.close();
        } catch(Exception e) {
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
                    User currentUser = null;
                    
                    // Sign into existing account
                    System.out.println("Enter your email: ");
                    System.out.print(INPUT_PROMPT);
                    email = keyedInput.next();

                    // Check if user exists
                    Boolean isSignedIn = false;
                    for (User user : users) {
                        if (user.getEmail().equals(email)) {
                            System.out.println("Enter your password: ");
                            System.out.print(INPUT_PROMPT);
                            password = keyedInput.next();

                            if (user.getPassword().equals(password)) {
                                isSignedIn = true;
                                currentUser = user;
                                
                                // Print info
                                System.out.println("You have successfully signed in.");
                                System.out.println("Welcome, " + user.getFirstName() + "!");
                            
                                // Get saved user posts
                                currentUser.loadPosts();
                            }
                            break;
                        }
                    }
                    if (!isSignedIn) {
                        System.out.println("Email or password incorrect! Please try again or make a new account.");
                        break;
                    }
                    while (true) {
                        // User is now logged in
                        if (!isSignedIn) {
                            break;
                        }
                        
                        System.out.println("\nDo you want to:");
                        System.out.println("a) Make new post.");
                        System.out.println("b) See your posts.");
                        System.out.println("c) Log out.");
                        
                        System.out.print(INPUT_PROMPT);
                        choice = keyedInput.next();
                        
                        switch (choice) {
                            case "a":
                                // Make new post
                                System.out.println("Enter content of post:");
                                System.out.print(INPUT_PROMPT);
                                
                                keyedInput.nextLine(); //consume unused '\n'
                                String newPost = keyedInput.nextLine();
                                
                                currentUser.newPost(newPost);
                                break;
                            case "b":
                                ArrayList<String> posts = currentUser.getPosts();
                                for (int i = 0; i < posts.size(); i++) {
                                    System.out.println((i + 1) + ") '" + posts.get(i) + "'");
                                }
                                break;
                            case "c":
                                isSignedIn = false; //Log out
                                currentUser = null;
                                break;
                            default:
                                System.out.println("Please choose a valid option!");
                                break;
                        }
                    }
                    break;
                case "b":
                    // Make new account
                    System.out.println("Enter your email: ");
                    System.out.print(INPUT_PROMPT);
                    email = keyedInput.next();

                    for (User user : users) {
                        if (user.getEmail().equals(email)) {
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

                    System.out.println("User '" + newUser.getPrintable() + "' successfully created!");
                    break;
                case "c":
                    // Show list of all users in format
                    // First Last (email)
                    // For example:
                    // John Doe (johndoe@alavimail.com)
                    users.forEach((user) -> {
                        System.out.println(user.getPrintable());
                    });
                    break;
                default:
                    System.out.println("Please choose a valid option!");
                    break;
            }
        }
    }
}
