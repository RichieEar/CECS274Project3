package Project3;
/**
*Stores and modifies following information:
*Name
*Number
*Email
*Notes
*@author Thomas McSwain
*/


public class Contact {
	private String name;
	private String number;
	private String email;
	private String notes;
	/**
	 * 
	 * @param name - name
	 * @param number - contact number in the form XXXXXXXXXXX
	 * @param email - contact email
	 * @param notes - any notes on the contact
	 */
	public Contact(String name,String number,String email,String notes){
		this.name=name;
		this.number=number;
		this.email=email;
		this.notes=notes;
	}
	/**
	 * 
	 * @return - returns name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return formated string 
	 */
	public String toString() {
		
		return String.format("%-20s%-20s%-20s%-20s",name,number,email,notes);
	
	}
	
	
}
