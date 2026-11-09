package ecom.JUnit.Sample.OrderMgmt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {
	
	private static DiscountCalculator discountCalculator;
	@BeforeAll
	public static void setUp() {
		System.out.println("THis will create before each methods");
		discountCalculator = new DiscountCalculator(); 
		System.out.println();
	}
	
	
	
	@BeforeEach
	public void beforeEveryMethod() {
		System.out.println("This will Exceute before Every Method");
		
	}
	
	@Test
	public void testCalculateDiscountRegular() {
		int excepted = 900;
		int actual =discountCalculator.calculateDiscount(1000, "Regular", 10);
		assertEquals(excepted, actual);
	}
	
	@Test
	public void testCalculateDiscountGold() {
		int excepted = 800;
		int actual =discountCalculator.calculateDiscount(1000, "Gold", 10);
		assertEquals(excepted, actual);
	}
	
	@Test
	public void testCalculateDiscountDefault() {
		int excepted = 1000;
		int actual =discountCalculator.calculateDiscount(1000, "Premium", 10);
		assertEquals(excepted, actual);
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("This will exceute after each method will exceute!");
		System.out.println();
	}
	
	@AfterAll
	public static void last() {
		System.out.println();
		discountCalculator = null;
		System.out.println("THis will execute in last after each and every method is ended");
	}
}
