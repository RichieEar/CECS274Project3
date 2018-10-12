package Project3;

public class Tester {

	public static void main(String[] args) {
		Log test = new Log();
		test.add(new Record("test","test","Incoming"));
		test.add(new Record("test","test1","Incoming"));
		test.add(new Record("test","test2","Incoming"));
		test.add(new Record("test","test3","Incoming"));
		test.add(new Record("test","test4","Incoming"));
		test.display();
	}

}
