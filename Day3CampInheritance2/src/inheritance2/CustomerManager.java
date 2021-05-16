package inheritance2;

public class CustomerManager {
	//iþ sýnýfý
	/*public void add() {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		
	}*/
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		logger.log();
		
	}

}
