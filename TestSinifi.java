import java.util.Scanner;

public class TestSinifi {

	public static void main(String[] args) {
		Scanner konsoldanOku = new Scanner(System.in);
		/*
		int tamSayi;
		System.out.print("Bir tamsayı giriniz:");
		tamSayi = konsoldanOku.nextInt();
		System.out.println("Girdiğiniz tam sayı: " + tamSayi);
		
		float ondalikSayi;
		System.out.print("Bir ondalık sayı giriniz: ");
		ondalikSayi = konsoldanOku.nextFloat();
		System.out.println("Girdiğiniz ondalık sayı: " + ondalikSayi);
		
		System.out.println("Nihal");
		System.out.print("Altuntaş");
		
		System.out.println("\n-------------------------\n");
		
		konsoldanOku.nextLine();
		String isim;
		System.out.print("Lütfen isminizi giriniz: ");
		isim = konsoldanOku.nextLine();
		System.out.println("Adınız: " + isim);
		*/
		
		/*
		 * Döngü içerisinde kullanıcının girdiği tam sayının karesini
		 * ekrana yazan bir program yazınız.
		 * Kullanıcı -1 girerse döngüden çıksın.
		 */
		/*
		int sayi, karesi;
		do {
			System.out.println("-------------------------------");
			System.out.println("Bir sayı giriniz (Durmak için -1 giriniz)");
			sayi = konsoldanOku.nextInt();
			karesi = sayi * sayi;
			System.out.println("Girdiğiniz sayı: " + sayi);
			System.out.println("Girdiğiniz sayının karesi: " + karesi);
		} while(sayi != -1);
		
		System.out.println("Döngüden çıktı");
		*/
		
		/*
		 * Kullanıcıdan 3 sayı girmesini isteyen ve girdiği sayıların
		 * en büyüğünü dönen programı yazınız
		 */
		/*
		int sayi1, sayi2, sayi3;
		System.out.println("Üç tam sayı giriniz:");
		sayi1 = konsoldanOku.nextInt();
		sayi2 = konsoldanOku.nextInt();
		sayi3 = konsoldanOku.nextInt();
		System.out.println("Girdiğiniz sayılar: " + sayi1 +
				", " + sayi2 + ", " + sayi3);
		
		if(sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("Girdiğiniz en büyük sayı: "+ sayi1);
		}
		else if(sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("Girdiğiniz en büyük sayı: "+ sayi2);
		}
		else {
			System.out.println("Girdiğiniz en büyük sayı: "+ sayi3);
		}
		*/
		
		/*
		 * Kullanıcı [1, 12] aralığında değer girene kadar okuma
		 * yapan programı yazınız.
		 * Kullanıcının girdiği ayın kaç çektiğini ekrana yazınız.
		 */
		int ay, gunSayisi;
		System.out.println("Ay için [1, 12] aralığında bir sayı giriniz:");
		ay = konsoldanOku.nextInt();
		while(ay < 1 || ay > 12) {
			System.out.println("Girdiğiniz değer [1, 12] aralığında olmalı!");
			System.out.println("Yeni bir değer giriniz: ");
			ay = konsoldanOku.nextInt();
		}
		switch(ay) {
			case 4:
			case 6:
			case 9:
			case 11:
				gunSayisi = 30;
				break;
			case 2:
				gunSayisi = 28;
				break;
			default:
				gunSayisi = 31;
		}
		
		System.out.println(ay + ". ayın gün sayısı: " + gunSayisi);
	}
	
}
