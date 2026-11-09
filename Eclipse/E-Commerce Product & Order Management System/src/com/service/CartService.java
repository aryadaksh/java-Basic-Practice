package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.model.CartItem;
import com.model.Product;

public class CartService {

	private Map<Integer, List<CartItem>> carts = new HashMap<>();

	public void addToCart(int customerId, Product product, int qty) {
		List<CartItem> cart = carts.computeIfAbsent(customerId, k -> new ArrayList<CartItem>());
		Optional<CartItem> existing = cart.stream().filter(ci -> ci.getProductId() == product.getProductId())
				.findFirst();
		if (existing.isPresent()) {
			existing.get().setQuantity(existing.get().getQuantity() + qty);
		} else {
			cart.add(new CartItem(product.getProductId(), product.getProductName(), product.getPrice(), qty));
		}
	}

	public void removeFromCart(int customerId, int productId) {
		List<CartItem> cart = carts.getOrDefault(customerId, new ArrayList<>());
		cart.removeIf(ci -> ci.getProductId() == productId);
	}

	public void increaseQuantity(int customerId, int productId, int qty) {
		carts.getOrDefault(customerId, new ArrayList<>()).forEach(ci -> {
			if (ci.getProductId() == productId)
				ci.setQuantity(ci.getQuantity() + qty);
		});

	}

	public void decreaseQuantity(int customerId, int productId, int qty) {
		carts.getOrDefault(customerId, new ArrayList<>()).forEach(ci -> {
			if (ci.getProductId() == productId)
				ci.setQuantity(ci.getQuantity() - qty);
		});
	}

	 public void mergeCart(int tempId, int realCustomerId) {
	        if (carts.containsKey(tempId)) {
	            carts.putIfAbsent(realCustomerId, new ArrayList<>());
	            carts.get(realCustomerId).addAll(carts.get(tempId));
	            carts.remove(tempId); // clear temp cart
	        }
	    }
	
	public List<CartItem> viewCart(int customerId) {
		return carts.getOrDefault(customerId, new ArrayList<>());
	}

	public double calculateTotal(int customerId) {
		return viewCart(customerId).stream().mapToDouble(CartItem::getTotalPrice).sum();

	}

	public void clearCart(int customerId) {
		carts.remove(customerId);

	}

}
