
public class KutuDemo {

	public static void main(String[] args) {

		Kutu ilkKutum = new Kutu(1, 1, 1);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());
		
		ilkKutum.setGenislik(5.9F);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());
		
		ilkKutum.setYukseklik(-9.8F);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());

	}

}
