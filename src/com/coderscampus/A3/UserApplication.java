package com.coderscampus.A3;

public class UserApplication {

	public static void main(String[] args) {
		import java.io.BufferedReader;
		import java.io.File;
		import java.io.FileReader;
		import java.io.IOException;
		import java.util.Scanner;
		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class UserApplication {

			public static void main(String[] args) {

		// Initialize UserService to handle user operations
				UserService userService = new UserService();

		// Add user to the service (trim and convert to lower case)
				userService.addUser(new User(email.toLowerCase(), password, name));
			}}br.close();}catch(

			IOException e)
			{
				System.err.println("Error reading the HTML file: " + e.getMessage());
				return; // Exit if there's an error reading the file
			}

		// Set up a counter for login attempts
			int maxAttempts = 5;
			int attempts = 0;

		// Get user input for authentication
			Scanner scanner = new Scanner(System.in);

			while(attempts<maxAttempts)
			{
				System.out.println("Enter username (email):");
				String inputUsername = scanner.nextLine().trim().toLowerCase(); // case insensitive match

				System.out.println("Enter password:");
				String inputPassword = scanner.nextLine().trim(); // case sensitive match

				System.out.println("Enter name:");
				String inputName = scanner.nextLine().trim();

		// Authenticate user by checking the credentials
				User authenticatedUser = userService.authenticate(inputUsername, inputPassword, inputName);

				if (inputUsername.equals(username()) && inputPassword.equals(password()) && inputName.equals(name())) {
		// If authentication is successful
					System.out.println("Authentication successful! Welcome, " + authenticatedUser.getName() + ".");
					return; // Exit the program after successful login
				} else {
		// If authentication fails, increment the attempt counter
					attempts++;
					System.out.println("Invalid username, password, or name. Attempt " + attempts + " of " + maxAttempts);

		// If max attempts are reached, lock the user out and terminate
					if (attempts >= maxAttempts) {
						System.out.println("Too many failed login attempts, you are now locked out.");
						return; // Exit the program
					}
				}
			}
		}}


	}

}
