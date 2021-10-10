package intro;

public class Main {

	public static void main(String[] args) {

		/* topla fonksiyonu iki adet sayıya izin veriyor.
		 * bunu istenilen kadar sayı gönderilebilecek hale getirmek için ne
		 * yapılmalı?
		 * bunun için variable arguments kullanılır.
		*/
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,7,8,9,10);
		System.out.println(toplam);
		
	}
	

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	//arka planda bir int arrayi var
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}
}

