package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		/* class oluşturma --- Product türünde product1 nesnesi oluşturuldu.
		 * Product string ve int gibi veri tipi. 
		 * Örnek oluşturma, referans oluşturma, instance creation
		*/
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB RAM",
				10); 
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
