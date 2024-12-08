package com.coderscampus.A3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
    // Array to store users
    private User[] users;
    // Path to the CSV file containing the user data
    private String csvFilePath = "/Users/sarahcox/git/SarahCox_Assignment_3/data.txt";

    // Constructor to initialize the UserService and load users from the CSV file
    public UserService() {
        loadUsersFromCsv();
    }

    // Method to parse the CSV file and load the user data into UserService
    private void loadUsersFromCsv() {
        String line;
        String csvSplitBy = ",";
        int userCount = 0;

        // First, count the number of users in the CSV file
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            while ((line = br.readLine()) != null) {
                userCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Initialize the users array with the counted size
        users = new User[userCount];

        // Now, read the CSV file again to populate the users array
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            int index = 0;
            while ((line = br.readLine()) != null) {
                // Split the line by the comma delimiter
                String[] data = line.split(csvSplitBy);
                // Create a new User object and add it to the users array
                if (data.length >= 3) { // Ensure there are enough fields
                    String username = data[0];
                    String password = data[1];
                    String name = data[2];
                    users[index++] = new User(username, password, name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the resulting list of users
        for (User  user : users) {
            System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword() + ", Name: " + user.getName());
        }
    }

    // Method to get the users array
    public User[] getUsers() {
        return users;
    }
}