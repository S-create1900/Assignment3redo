package com.coderscampus.A3;

import java.util.ArrayList;
import java.util.List;


public class UserService {
	// A list to store users
		private List<User> users = new ArrayList<>();
		// Path to the HTML file containing the user data
		String csvFilePath = "/Users/sarahcox/git/SarahCox_Assignment_3/data.txt file.txt";

		// Parse the CSV file and load the user data into UserService
		String csvFile = "csvFilePath"; // Update this to your actual file path
		String line;
	// Split the line by commas to extract email, password, and name
		String csvSplitBy = ",";
		// Open the local file for reading

		// List to hold the data
		List<String[]> dataList = new ArrayList<>() {

		try(
		BufferedReader br = new BufferedReader(new FileReader(csvFile)))
		{
			// Read each line from the CSV file
			while ((line = br.readLine()) != null) {
				// Split the line by the comma delimiter
				String[] data = line.split(csvSplitBy);
				// Add the data array to the list
				dataList.add(data);
			}
		}catch(
		IOException e)
		{
			e.printStackTrace();
		}

		// Print the resulting list
		for(
		String[] data:dataList)
		{
			System.out.println("Email: " + data[0] + ", Password: " + data[1] + ", Name: " + data[2]);
		}
	}
	}
}
