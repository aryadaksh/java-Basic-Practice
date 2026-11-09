package com.service;

import java.util.List;

import com.exception.InsufficentStockException;
import com.exception.InvalidOrderException;
import com.exception.ProductNotFoundException;
import com.model.CartItem;
import com.model.Order;
import com.model.Product;
import com.repository.OrderRepository;
import com.repository.ProductRepository;

public class OrderService {

	private OrderRepository orderRepository;
	private ProductRepository productRepository;
	private CartService cartService;

	public OrderService(OrderRepository _orderRepository, ProductRepository _productRepository,
			CartService _cartService) {
		this.orderRepository = _orderRepository;
		this.productRepository = _productRepository;
		this.cartService = _cartService;
	}

	public Order placeOrder(int customerId)
			throws InvalidOrderException, ProductNotFoundException, InsufficentStockException 
	{
		List<CartItem> cart = cartService.viewCart(customerId);
		if (cart.isEmpty()) {
			throw new InvalidOrderException("Cart Is Empty");
		}

		for (CartItem item : cart) {
			Product product = productRepository.getProductById(item.getProductId());
			if (product == null) {
				throw new ProductNotFoundException("Product with ID " + item.getProductId() + " not found. ");
			}
			if (product.getQuantity() < item.getQuantity()) {
				throw new InsufficentStockException("Not enough stock for " + product.getProductName());
			}

			product.setQuantity(product.getQuantity() - item.getQuantity());
		}
		Order order = new Order(customerId, cart);
		orderRepository.saveOrder(order);
		cartService.clearCart(customerId);
		return order;

	}
	
	public List<Order> viewsOrderByCustomer(int customerId){
		return orderRepository.getOrderByCustomer(customerId);
	}
	
	public void cancelOrder(int orderId) {
		for(Order o: orderRepository.getAllOrders()) {
			if(o.getOrderId() == orderId) {
				o.setOrderStatus("CANCELLED");
				return;
			}
		}
	}
	
	public List<Order> viewAllOrder(){
		return orderRepository.getAllOrders();
	}

}
