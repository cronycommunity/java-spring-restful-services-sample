package com.cronycommunity.restfulservicesdemo.business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cronycommunity.restfulservicesdemo.dal.IProductDal;
import com.cronycommunity.restfulservicesdemo.entities.Product;

@Service
public class ProductManager implements IProductService {
	
	private IProductDal productDal;
	
	@Autowired
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}

	@Override
	@Transactional
	public List<Product> getAll() {
		return this.productDal.getAll();
	}

	@Override
	@Transactional
	public void add(Product product) {
		this.productDal.add(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		this.productDal.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		this.productDal.delete(product);
	}
	
}
