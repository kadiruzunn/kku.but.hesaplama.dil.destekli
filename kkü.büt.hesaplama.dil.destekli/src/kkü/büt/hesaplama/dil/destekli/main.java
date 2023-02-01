package kkü.büt.hesaplama.dil.destekli;

import java.util.Scanner;

public class main {
	final static String INGILIZCE_DILI_KISALTMASI = "en";
	final static String TURKCE_DILI_KISALTMASI = "tr";
	final static String ACILIS_MESAJI = "KKU MATEMATIK BOLUMU BUT'E KALDIN MI UYGULAMASINA HOS GELDINIZ. ";
	final static String SECIM_EKRANI = "INGILIZCE ICIN en , TURKCE ICIN tr YAZINIZ : ";
	final static String TURKCE_ISIM = "ISMINIZI GIRIN :";
	final static String INGILIZCE_ISIM = "ENTER YOUR NAME :";
	final static String TURKCE_MESAJ = "HOS GELDINIZ  ";
	final static String INGILIZCE_MESAJ = "WELCOME  ";
	final static String HATA_MESAJI = "HATALI GIRDINIZ";
	final static String FINAL_NOTU_TURKCE = "  FINAL NOTUNUZU GIRINIZ: ";
	final static String FINAL_NOTU_INGILIZCE = "  ENTER YOUR FINAL NOTE: ";
	final static String GECTINIZ_TURKCE = "BU DERSTEN GECTINIZ ";
	final static String GECTINIZ_INGILIZCE = "YOU HAVE FOLLOWED THIS LESSON ";
	final static String BUT_INGILIZCE = "YOU DID NOT PASS THIS LESSON ";
	final static String BUT_TURKCE = "BU DERSTEN KALDINIZ ";
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(ACILIS_MESAJI + SECIM_EKRANI);
		String secimEkranı = input.next();
		
		if (secimEkranı.equals(TURKCE_DILI_KISALTMASI)) {
			System.out.print(TURKCE_ISIM);
		} else if(secimEkranı.equals(INGILIZCE_DILI_KISALTMASI)) {
			System.out.print(INGILIZCE_ISIM);
		} else {
			System.out.println(HATA_MESAJI);
		}
		
		String kullanicininAdi = input.next();
		
		if (secimEkranı.equals(TURKCE_DILI_KISALTMASI)) {
			System.out.println(TURKCE_MESAJ + kullanicininAdi + FINAL_NOTU_TURKCE);
			
			Scanner not = new Scanner(System.in);
			int aldıgıNot = not.nextInt();{
				
				if(aldıgıNot <= 100 && aldıgıNot > 0) {
					if(aldıgıNot >= 50) {
						System.out.println(GECTINIZ_TURKCE);
					}else {
						System.out.println(BUT_TURKCE);
					}
			
				}	
			}
			
		} else if (secimEkranı.equals(INGILIZCE_DILI_KISALTMASI)) {
			System.out.println(INGILIZCE_MESAJ + kullanicininAdi + FINAL_NOTU_INGILIZCE);
			Scanner not = new Scanner(System.in);
			int aldıgıNot = not.nextInt();{
				
				if(aldıgıNot <= 100 && aldıgıNot > 0) {
					if(aldıgıNot >= 50) {
						System.out.println(GECTINIZ_INGILIZCE);
					}else {
						System.out.println(BUT_INGILIZCE);
					}
			
				}	
			}
			} 
		System.out.println();
		
		
		
				switch (secimEkranı){
				case "en": {
					System.out.println("en");
					break;
				}
				case "tr": {
					System.out.println("tr");
					break;
				}
				default:
					System.out.println(HATA_MESAJI);
				}
				
				
				}

}
