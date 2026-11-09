/*
 * package com.main;
 * 
 * import java.util.Scanner;
 * 
 * import com.model.Customer; import com.repository.CustomerRepository; import
 * com.repository.OrderRepository; import com.repository.ProductRepository;
 * import com.service.CartService; import com.service.CustomerService; import
 * com.service.OrderService; import com.service.ProductService;
 * 
 * public class ECommerceApplication {
 * 
 * static {
 * System.out.println("═════════════════════════════════════════════════════");
 * System.out.println("║                                                   ║");
 * System.out.println("║ E-Commerce Product & Order Management System      ║");
 * System.out.println("║                                                   ║");
 * System.out.println("═════════════════════════════════════════════════════");
 * }
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * // Creating object of all repository ProductRepository productRepository =
 * new ProductRepository(); CustomerRepository customerRepository = new
 * CustomerRepository(); OrderRepository orderRepository = new
 * OrderRepository();
 * 
 * // Creating Object of all Service ProductService productService = new
 * ProductService(productRepository); CustomerService customerService = new
 * CustomerService(customerRepository); CartService cartService = new
 * CartService(); OrderService orderService = new OrderService(orderRepository,
 * productRepository, cartService);
 * 
 * int customerId = 101;
 * 
 * boolean status = true; while (status) {
 * System.out.println("Press 1 for ADMIN");
 * System.out.println("Press 2 for CUSTOMER");
 * System.out.println("Press 3 for EXIT");
 * System.out.print("Provide Your Input::"); int key = sc.nextInt();
 * sc.nextLine(); switch (key) { case 1: adminMenu(sc, productService,
 * customerService, orderService); break;
 * 
 * case 2: customerMenu(sc, productService, customerService, cartService,
 * orderService, customerId); break; case 3: status = false; default:
 * System.out.println("Invaild Choice!"); break; } }
 * 
 * }
 * 
 * private static void adminMenu(Scanner sc, ProductService productService,
 * CustomerService customerService, OrderService orderService) {
 * System.out.println("\n=== Admin Menu ===");
 * System.out.println("1. Add Product"); System.out.println("2. View Product");
 * System.out.println("3. Search Prooduct by ID"); System.out.println("4. ");
 * 
 * }
 * 
 * private static void customerMenu(Scanner sc, ProductService productService,
 * CustomerService customerService, CartService cartService, OrderService
 * orderService, int customerId) {
 * 
 * } }
 */

package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.exception.CustomerNotFoundException;
import com.exception.InsufficentStockException;
import com.exception.InvalidOrderException;
import com.exception.ProductNotFoundException;
import com.model.Customer;
import com.model.Order;
import com.model.Product;
import com.repository.CustomerRepository;
import com.repository.OrderRepository;
import com.repository.ProductRepository;
import com.service.CartService;
import com.service.CustomerService;
import com.service.OrderService;
import com.service.ProductService;

public class ECommerceApplication {
	static {
		System.out.println("═════════════════════════════════════════════════════");
		System.out.println("║                                                   ║");
		System.out.println("║ E-Commerce Product & Order Management System      ║");
		System.out.println("║                                                   ║");
		System.out.println("═════════════════════════════════════════════════════");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ProductRepository productRepo = new ProductRepository();
		CustomerRepository customerRepo = new CustomerRepository();
		OrderRepository orderRepo = new OrderRepository();

		ProductService productService = new ProductService(productRepo);
		CustomerService customerService = new CustomerService(customerRepo);
		CartService cartService = new CartService();
		OrderService orderService = new OrderService(orderRepo, productRepo, cartService);

		// Pre-added products
		Product iphone17 = new Product("iPhone 17", 95000, "Mobile", 10, "Apple");
		Product macbookPro = new Product("MacBook Pro", 180000, "Laptop", 5, "Apple");
		Product galaxyS25 = new Product("Galaxy S25", 85000, "Mobile", 8, "Samsung");
		Product dellXps = new Product("Dell XPS 15", 140000, "Laptop", 6, "Dell");
		Product sonyHeadphones = new Product("Sony WH-1000XM6", 30000, "Audio", 15, "Sony");

		productRepo.addProduct(iphone17);
		productRepo.addProduct(macbookPro);
		productRepo.addProduct(galaxyS25);
		productRepo.addProduct(dellXps);
		productRepo.addProduct(sonyHeadphones);

		int customerId = 101; // demo customer

		while (true) {
			
			System.out.println("1. Admin Menu");
			System.out.println("2. Customer Menu");
			System.out.println("3. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				adminMenu(sc, productService, customerService, orderService);
				break;
			case 2:
				customerMenu(sc, productService, customerService, cartService, orderService, customerId);
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private static void adminMenu(Scanner sc, ProductService productService, CustomerService customerService,
			OrderService orderService) {

		boolean adminRunning = true;

		while (adminRunning) {

			System.out.println("\n=== Admin Menu ===");
			System.out.println("1. Add Product");
			System.out.println("2. View Products");
			System.out.println("3. Search Product by ID");
			System.out.println("4. Update Product Price");
			System.out.println("5. Update Product Quantity");
			System.out.println("6. Delete Product");
			System.out.println("7. View Customers");
			System.out.println("8. View All Orders");
			System.out.println("9. Exit Admin Menu");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Category: ");
				String cat = sc.nextLine();

				double price = readPositiveInt(sc, "Price: ");
				int qty = readPositiveInt(sc, "Qty: ");

				sc.nextLine();

				System.out.print("Brand: ");
				String brand = sc.nextLine();

				productService.addProduct(new Product(name, price, cat, qty, brand));

				System.out.println("Product added successfully!");
				break;

			case 2:
				productService.viewAllProduct().forEach(System.out::println);
				break;

			case 3:
				System.out.print("ID: ");
				int id = sc.nextInt();

				System.out.println(productService.searchById(id));
				break;

			case 4:
				System.out.print("ID: ");
				int idp = sc.nextInt();

				System.out.print("New Price: ");
				double np = sc.nextDouble();

				productService.updatePrice(idp, np);
				break;

			case 5:
				System.out.print("ID: ");
				int idq = sc.nextInt();

				System.out.print("New Qty: ");
				int nq = sc.nextInt();

				productService.updateQty(idq, nq);
				break;

			case 6:
				System.out.print("ID: ");
				int del = sc.nextInt();

				productService.deleteProduct(del);
				break;

			case 7:
				customerService.viewAllCustomer().forEach(System.out::println);
				break;

			case 8:
				orderService.viewAllOrder().forEach(System.out::println);
				break;

			case 9:
				System.out.println("Exiting Admin Menu...");
				adminRunning = false;
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}

	}

	private static int readPositiveInt(Scanner sc, String prompt) {
		int value = 0;
		while (true) {
			System.out.print(prompt);
			try {
				value = sc.nextInt();
				if (value <= 0) {
					System.out.println(" Value must be positive. Try again.");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println(" Invalid input! Please enter a whole number.");
				sc.nextLine(); // clear invalid input
			}
		}
		return value;
	}

	private static void customerMenu(Scanner sc, ProductService productService, CustomerService customerService,
			CartService cartService, OrderService orderService, int customerId) {

		boolean customerRunning = true;

		while (customerRunning) {

			// ==============================
			// CUSTOMER MENU
			// ==============================

			System.out.println("\n=== Customer Menu ===");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. View Products");
			System.out.println("4. Search Product");
			System.out.println("5. Add Product to Cart");
			System.out.println("6. View Cart");
			System.out.println("7. Remove Product from Cart");
			System.out.println("8. Place Order");
			System.out.println("9. View My Orders");
			System.out.println("10. Cancel Order");
			System.out.println("11. Logout");

			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Email: ");
				String email = sc.nextLine();

				System.out.print("Mobile: ");
				String mobile = sc.nextLine();

				System.out.print("Address: ");
				String address = sc.nextLine();

				Customer c = new Customer(name, email, mobile, address);

				customerService.registerCustomer(c);

				System.out.println("Customer registered successfully!");

				System.out.println("Your Customer ID is: " + c.getCustomerId());

				break;

			case 2: // Login
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Email: ");
				String email1 = sc.nextLine();

				Customer c1 = customerService.viewCustomer(id);
				if (c1 != null && c1.getEmail().equals(email1)) {
					System.out.println("Login successful! Welcome " + c1.getName());
					// Merge any pre-login cart (e.g., tempId = 0) into this customer’s cart
					cartService.mergeCart(0, id);
					customerId = id; // set active session
				} else {
					System.out.println("Error: Invalid login credentials!");
				}
				break;

			case 3:
				System.out.println("\n=== Products ===");

				productService.viewAllProduct().forEach(System.out::println);

				break;

			case 4:

				System.out.println("Search by: " + "1.ID " + "2.Name " + "3.Category " + "4.Brand " + "5.PriceRange");

				int s = sc.nextInt();

				switch (s) {

				case 1:
					System.out.print("ID: ");
					int sid = sc.nextInt();

					System.out.println(productService.searchById(sid));

					break;

				case 2:
					System.out.print("Name: ");
					String sn = sc.next();

					productService.searchByName(sn).forEach(System.out::println);

					break;

				case 3:
					System.out.print("Category: ");
					String sca = sc.next();

					productService.searchByCatogery(sca).forEach(System.out::println);

					break;

				case 4:
					System.out.print("Brand: ");
					String sb = sc.next();

					productService.searchByBrandName(sb).forEach(System.out::println);

					break;

				case 5:
					System.out.print("Min: ");
					double min = sc.nextDouble();

					System.out.print("Max: ");
					double max = sc.nextDouble();

					productService.searchByPriceRange(min, max).forEach(System.out::println);

					break;

				default:
					System.out.println("Invalid search option!");
				}

				break;

			case 5:
				System.out.print("Product ID: ");
				int pid = sc.nextInt();

				System.out.print("Quantity: ");
				int qty = sc.nextInt();

				Product prod = productService.searchById(pid);

				if (prod != null) {

					cartService.addToCart(customerId, prod, qty);

					System.out.println("Added to cart!");

				} else {

					System.out.println("Product not found!");
				}

				break;

			case 6:

				cartService.viewCart(customerId).forEach(System.out::println);

				System.out.println("Cart Total: Rs." + cartService.calculateTotal(customerId));

				break;

			case 7:

				System.out.print("Product ID to remove: ");

				int rid = sc.nextInt();

				cartService.removeFromCart(customerId, rid);

				System.out.println("Removed from cart!");

				break;

			case 8:

				try {

					Order order = orderService.placeOrder(customerId);

					System.out.println("Order placed: " + order);

				} catch (InvalidOrderException | ProductNotFoundException | InsufficentStockException e) {

					System.out.println("Error: " + e.getMessage());
				}

				break;

			case 9:

				orderService.viewsOrderByCustomer(customerId).forEach(System.out::println);

				break;

			case 10:

				System.out.print("Order ID to cancel: ");

				int oid = sc.nextInt();

				orderService.cancelOrder(oid);

				System.out.println("Order cancelled if found.");

				break;

			case 11:

				System.out.println("Logging out...");

				customerRunning = false;

				break;

			default:

				System.out.println("Invalid choice!");
			}
		}
	}
}
