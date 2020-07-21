package com.cronycommunity.restfulservicesdemo.business;

import java.util.List;

import com.cronycommunity.restfulservicesdemo.entities.Product;

public interface IProductService {
	
	List<Product> getAll();
	
	void add(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
}
