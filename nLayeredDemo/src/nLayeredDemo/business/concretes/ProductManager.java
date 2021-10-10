package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Products;

public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	private LoggerService loggerService; 

	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Products products) {
		if(products.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return;
		}
		this.productDao.add(products);
		this.loggerService.logToSystem("Ürün eklendi : " + products.getName());
		
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
