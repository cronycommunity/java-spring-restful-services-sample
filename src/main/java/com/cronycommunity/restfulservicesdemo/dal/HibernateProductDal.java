package com.cronycommunity.restfulservicesdemo.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cronycommunity.restfulservicesdemo.entities.Product;

@Repository
public class HibernateProductDal implements IProductDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateProductDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Product> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Product> products = session.createQuery("from Product", Product.class).getResultList();
		return products;
	}

	@Override
	@Transactional 
	public void add(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
	}

	@Override
	@Transactional 
	public void update(Product product) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(product);
	}

	@Override
	@Transactional 
	public void delete(Product product) {
		Session session = entityManager.unwrap(Session.class);
		Product willdeletedProduct = session.get(Product.class, product.getId());
		session.delete(willdeletedProduct);
	}

	@Override
	public Product getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Product product = session.get(Product.class, id);
		return product;
	}


}
