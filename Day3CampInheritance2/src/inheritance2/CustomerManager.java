package inheritance2;

public class CustomerManager {
	//i� s�n�f�
	/*public void add() {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		
	}*/
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		logger.log();
		
	}

}
