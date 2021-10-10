package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Products;

/* bunun içerisinde veriye erişim kodlarını yazacağız.
 * soyutlamak için implements ediyoruz.
 * */
public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Products products) {
		System.out.println("Hibernate ile eklendi : " + products.getName());
		
	}

	@Override
	public void delete(Products products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Products products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Products get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
