package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Products;

public interface ProductService {
	void add(Products products);
	List<Products> getAll();

}
