package com.cronycommunity.restfulservicesdemo.entities;

import javax.persistence.*;

@Table(name="cc_product")
@Entity
public class Product {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name")
	private String name;
	
	private String category;
	
	public Product() {}
	
	public Product(int id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
