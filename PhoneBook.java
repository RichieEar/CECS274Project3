package Project3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

/**
 * Contains an arraylist of contacts and modifies it
 * displays contacts in alphabetical order
 * @author Thomas McSwain
 *
 */
public class PhoneBook {
	private ArrayList<Contact> book = new ArrayList<Contact>();
	/**
	 * Adds a contact to book arraylist
	 * @param c - contact to be added to book
	 */
	public void add(Contact c) {
		book.add(c);
	}
	/**
	 * Removes contact with the name, name.
	 * @param name - name of contact to be removed
	 * @throws InputMismatchException - Throws exception when name is not found in the Phonebook
	 */
	public void remove(String name) throws InputMismatchException{
		for(Contact c:book) {
			if(name.equals(c.getName())) {
				book.remove(c);
				return;
			}
			
		}
		throw new InputMismatchException();
	}
	/**
	 * Sorts phonebook lexographical order.
	 */
	public void sort() {
		Collections.sort(book);
	}
	/**
	 * Prints formated contacts in the phonebook to console.
	 */
	public void display() {
		for(Contact c:book) {
			System.out.println(c.toString());
		}
	}
}
