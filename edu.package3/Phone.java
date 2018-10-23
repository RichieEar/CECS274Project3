package CECS274;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Phone_Book phone = new Phone_Book();
		//Checks if you want to use the phone book
		System.out.println("Would you like to access your phone book? 'Yes' or 'No' ");
		String access = scan.nextLine();
		if (access.equalsIgnoreCase("Yes")) {
			while (true) {
				//Displays a list of options for the user to pick from and will execute
				//an action based off the desired choice
				//If input is incorrect, will tell user and loop back to prompt user again
				try {
					System.out.println("Please select one:\n'Add'\n'Edit'\n'Delete'\n"
							+ "'Display'\n'Favorites'\n'Call History'\n'Finish'\n"
							+ "What would you like to do?");
					String nextInput = scan.nextLine();
					if (nextInput.equalsIgnoreCase("Add")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Edit")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Delete")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Display")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Favorites")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Call History")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Finish")) {
						break;
					}
					else {
						System.out.println("Let's try this again.");
						continue;
					}
				}
				catch (InputMismatchException e) {
					System.out.println("You've entered in something wrong. Let's try again.");
					continue;
				}
			}
		}
		else {
			System.out.println("Maybe next time!");
		}
	}
}
