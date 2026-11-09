package com.repository;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductRepository {
	
	private List<Product> products = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void updateProduct(Product updateProduct) {
		for(int i = 0; i<products.size(); i++) {
			if(products.get(i).getProductId() == updateProduct.getProductId()) {
				products.set(i, updateProduct);
				return;
			}
		}
	}
	
	public void deleteProduct(int id) {
		products.removeIf(product -> product.getProductId() == id);
	}
	
	public Product getProductById(int id) {
		return products.stream().filter(product -> product.getProductId() == id).findFirst().orElse(null);
	}
	
	public List<Product> getAllProducts(){
		return products;
	}

}
