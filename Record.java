/**
 * 
 * Keeps track of the name and date of calls
 * 
 * @author Thomas
 *
 */
public class Record {
	String id;
	String date;
	String IO;
	/**
	 * Constructor that sets all instance variables
	 * @param id - Name or number
	 * @param date - Date and time of call
	 * @param IO -Incoming or outgoing call.
	 */
	public Record(String id, String date, String IO) {
		this.id=id;
		this.date = date
		this.IO=IO;
	}
	/**
	 * returns this record's id
	 * @return id of this record
	 */
	public String getId() {
		return id;
	}
	/**
	 * Returns formated string of the record.
	 * @return - formated string
	 */
	public String toString() {
		return String.format("%s %n%-20s%s", id,date,IO);
	}
}
