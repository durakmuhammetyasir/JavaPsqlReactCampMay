package kodlamaIOProperties;

//import kodlamaIOProperties.KursEgitmeni;7
//import kodlamaIOProperties.Kategori;
//import kodlamaIOProperties.Kurs;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurs kurs1 = new Kurs(1, "csharp ve angular ", 21, "Ýleri Düzey");
		
		Kurs kurs2 = new Kurs(2, "java ve react ", 16, "Ýleri Düzey");
		
		Kurs kurs3 = new Kurs(3, "programlamaya giriþ ", 1 ,"Temel");
		
		
		Kurs[] kurslar = {kurs1,kurs2,kurs3};
		
		for (Kurs kurs : kurslar) {
			
			System.out.println(kurs.name);
		}
		
		System.out.println(kurslar.length);
		
		Kategori kategori1 = new Kategori();
		kategori1.id = 1;
		kategori1.name = "Programlama";
		
		Kategori kategori2 = new Kategori();
		kategori2.id = 2;
		kategori2.name = "Tümü";		
		
		KursEgitmeni kursEgitmeni = new KursEgitmeni();
		kursEgitmeni.add(kurs1);
		kursEgitmeni.add(kurs2);
		kursEgitmeni.add(kurs3);

	}

}
