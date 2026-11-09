package com.service;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Product;
import com.repository.ProductRepository;

public class ProductService {
	
	// Instance Variable reference ProductRepository
	private ProductRepository productRepository;

	//Constructor 
	public ProductService(ProductRepository _productRepository) {
		this.productRepository = _productRepository;
	}
	
	// Adding product calling internally addProduct of ProductService
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
	
	// Viewing all Product its will return in List its internally calling ProductService which methods getAllProducts
	public List<Product> viewAllProduct(){
		return productRepository.getAllProducts();
	}
	
	// Searching Product by using productId its internally calling ProductService of methods getProductById
	public Product searchById(int id) {
		return productRepository.getProductById(id);
	}

	// Searching Product by name using StreamApi its internally calling ProductService of methods getAllProducts
	public List<Product> searchByName(String keyword) {
	    return productRepository.getAllProducts().stream()
	               .filter(p -> p.getProductName().toLowerCase().contains(keyword.toLowerCase()))
	               .collect(Collectors.toList());
	}

	
	// Searching Product by catogery using StreamApi its internally calling ProductService of methods getAllProducts
	public List<Product> searchByCatogery(String catogery){
		return productRepository.getAllProducts()
								.stream()
								.filter(p -> p.getCategory().equalsIgnoreCase(catogery))
								.collect(Collectors.toList());
	}
	
	// Searching Product by brandName using StreamApi its internally calling ProductService of methods getAllProducts
	public List<Product> searchByBrandName(String brandName){
		return productRepository.getAllProducts()
								.stream()
								.filter(p -> p.getBrandName().equalsIgnoreCase(brandName))
								.collect(Collectors.toList());
	}
	
	
	// Searching Product by priceRange  using StreamApi its internally calling ProductService of methods getAllProducts
	public List<Product> searchByPriceRange(double min,double max){
		return productRepository.getAllProducts()
								.stream()
								.filter(p-> p.getPrice() >= min && p.getPrice() <=max)
								.collect(Collectors.toList());
	}
	
	// Updating Price using productId its calling internaly Product.setPrice(newPrice)
	public void updatePrice(int id, double newPrice) {
		Product p = productRepository.getProductById(id);
		if( p != null) {
			p.setPrice(newPrice);
		}
		
	}
	
	// Updating qty using productId its calling internaly Product.setQuantity(newQty)
	public void updateQty(int id, int newQty) {
		Product p = productRepository.getProductById(id);
		if(p != null) {
			p.setQuantity(newQty);
		}
	}
	
	// Updating  using productId its calling internaly Product.setProductName(newProductName)
	public void updateProductName(int id,String newProductName) {
		Product p = productRepository.getProductById(id);
		if(p != null) {
			p.setProductName(newProductName);
		}
		
	}
	
	// Updating  using productId its calling internaly Product.setBrandName(newBrandName)
	public void updateBrandName(int id, String newBrandName) {
		Product p = productRepository.getProductById(id);
		if(p != null) {
			p.setBrandName(newBrandName);
		}
	}
	
	
	// Updating  using productId its calling internaly Product.setBrandName(category)
		public void updateCategory(int id, String category) {
			Product p = productRepository.getProductById(id);
			if(p != null) {
				p.setBrandName(category);
			}
		}
	
	//Removing or deleting the product
		public void deleteProduct(int id) {
			productRepository.deleteProduct(id);
		}
}
