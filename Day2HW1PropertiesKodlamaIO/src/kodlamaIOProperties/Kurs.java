package kodlamaIOProperties;

public class Kurs {
	public Kurs() {
		System.out.println("Ben çalýþtým.");
	}
	
	public Kurs(int id, String name, int kursSuresiGun , String seviye) {
			this();
			this.id = id;
			this.name = name;
			this.kursSuresiGun = kursSuresiGun;
			this.seviye = seviye;
	}
	
	int id;
	String name;
	int kursSuresiGun;
	String seviye;
	
	


}
