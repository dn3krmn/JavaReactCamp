package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Products;

public interface ProductDao {
	
	void add(Products products);
	void delete(Products products);
	void update(Products products);
	Products get(int id);
	List<Products> getAll();

}
