package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Products;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(
				new AbcProductDao(), new JLoggerManagerAdapter());
		
		Products products = new Products(1,2,"Elma",12,50);
		
		productService.add(products);
		

	}

}
