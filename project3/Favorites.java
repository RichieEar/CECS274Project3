package edu.project3;

import java.util.ArrayList;

/**
 * Keeps track of your favorites
 * @author Thomas
 *
 */
public class Favorites {
	private ArrayList<Contact> fav = new ArrayList<Contact>();
	/**
	 * Adds a contact and keeps the list at a max of 6
	 * @param c - contact to be added
	 */
	public void add(Contact c) {
		fav.add(0,c);
		if(fav.size()==6) {
			fav.remove(5);
		}
	}
	/**
	 * Swaps a contact to a specified position
	 * @param name - name of contact to be swapped
	 * @param a position to swap contact to
	 */
	public void swap(String name,int a) {
		
		for(Contact c:fav) {
			if(c.getName()==name) {
				fav.remove(fav.indexOf(c));
				fav.add(a-1,c);
				break;
			}
		}
		
	}
	/**
	 * Displays all the favorites and their preference in order.
	 */
	public void display() {
		int pref =1;
		for(Contact c:fav) {
			System.out.println(pref+": "+c);
			pref++;
		}
	}

}
