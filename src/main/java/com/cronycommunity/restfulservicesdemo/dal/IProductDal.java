package com.cronycommunity.restfulservicesdemo.dal;

import java.util.List;

import com.cronycommunity.restfulservicesdemo.entities.*;

public interface IProductDal {
	
	List<Product> getAll();
	
	void add(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product getById(int id);
}
