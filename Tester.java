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
		Favorites fav = new Favorites();
		fav.add(new Contact("Tom","11111111111","email@email.com",""));
		fav.add(new Contact("bom","11111111111","email@email.com",""));
		fav.add(new Contact("com","11111111111","email@email.com",""));
		fav.add(new Contact("som","11111111111","email@email.com",""));
		fav.add(new Contact("rom","11111111111","email@email.com",""));
		fav.add(new Contact("rsom","11111111111","email@email.com",""));
		fav.swap("rsom",5);
		fav.swap("rsom", 1);
		fav.display();
	}

}
