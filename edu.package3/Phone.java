package CECS274;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import CECS274.Phone_Book;
import CECS274.Contact;
import CECS274.Favorites;
import CECS274.Record;

public class Phone extends Phone_Book{

	public static void main(String[] args) {
		String name;
		String number;
		String email;
		String notes;
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
						System.out.println("Are you sure you want to add? 'y'/'n'");
						nextInput = scan.nextLine();
						if (nextInput.equalsIgnoreCase("y")) {
							System.out.println("Enter a name");
							name = scan.nextLine();
							System.out.println("Enter a number");
							number = scan.nextLine();
							System.out.println("Enter an email");
							email = scan.nextLine();
							System.out.println("Enter a note or enter a '0' if nothing to note");
							notes = scan.nextLine();
							Contact c = new Contact(name, number, email, notes);
							phone.add(c);
						}
						else {
							continue;
						}
					}
					else if (nextInput.equalsIgnoreCase("Edit")) {
						System.out.println("Are you sure you want to edit? 'y'/'n'");
						nextInput = scan.nextLine();
						if (nextInput.equalsIgnoreCase("y")) {
							System.out.println("Enter a name to edit");
							name = scan.nextLine();
							for (int i = 0; i < phone.size(); i++) {
								if (phone.getContact(i).getName().equalsIgnoreCase(name)) {
									System.out.println("'Name'\n'Number'\n"
											+ "'Email'\n'Note'\n"
											+ "What do you want to edit?");
									nextInput = scan.nextLine();
									if (nextInput.equalsIgnoreCase("Name")) {
										System.out.println("Edit the name here");
										name = scan.nextLine();
										phone.getContact(i).setName(name);
									}
									if (nextInput.equalsIgnoreCase("Number")) {
										System.out.println("Edit the number here");
										number = scan.nextLine();
										phone.getContact(i).setNumber(number);
									}
									if (nextInput.equalsIgnoreCase("Email")) {
										System.out.println("Edit the email here");
										email = scan.nextLine();
										phone.getContact(i).setEmail(email);
									}
									if (nextInput.equalsIgnoreCase("Note")) {
										System.out.println("Edit the notes here");
										notes = scan.nextLine();
										phone.getContact(i).setNote(notes);
									}
								}
							}
						}
						else {
							System.out.println("That name is not in the phone book");
							continue;
						}
					}
					else if (nextInput.equalsIgnoreCase("Delete")) {
						
					}
					else if (nextInput.equalsIgnoreCase("Display")) {
						phone.display();
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
				catch (NoSuchElementException e) {
					System.out.println("The entry couldn't be found.");
					continue;
				}
			}
		}
		else {
			System.out.println("Maybe next time!");
		}
		scan.close();
	}
}
