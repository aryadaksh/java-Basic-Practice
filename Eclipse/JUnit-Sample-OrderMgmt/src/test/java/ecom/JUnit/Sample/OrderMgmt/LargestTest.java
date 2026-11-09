package ecom.JUnit.Sample.OrderMgmt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestTest {
	
	private static Largest largest;
	
	@BeforeAll
	public static void setUp() {
		largest = new Largest();
	}
	
	@BeforeEach
	public  void beforeEachMethod() {
		System.out.println("THis will excute before every method");
	}
	
	@Test
	public void testLargestNumber() {
		int expected =9;
		int actual = largest.largestNumber(new int[] {7,8,9});
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLargestNumberOrder() {
		/*
		 * int expected =9; int actual = largest.largestNumber(new int[] {7,8,9});
		 */
		assertEquals(9, largest.largestNumber(new int[] {7,8,9}));
		assertEquals(9, largest.largestNumber(new int[] {9,8,9}));
		assertEquals(9, largest.largestNumber(new int[] {8,7,9}));

		
	}
	
	@Test
	public void testLargestNumberDup() {
		/*
		 * int expected =9; int actual = largest.largestNumber(new int[] {7,8,9});
		 */
		assertEquals(9, largest.largestNumber(new int[] {9,7,8,9}));


		
	}
	
	@Test
	public void testLargestNumberOne() {
		/*
		 * int expected =9; int actual = largest.largestNumber(new int[] {7,8,9});
		 */
		assertEquals(1, largest.largestNumber(new int[] {1}));


		
	}
	
	@Test
	public void testLargestNumberNegative() {
		/*
		 * int expected =9; int actual = largest.largestNumber(new int[] {7,8,9});
		 */
		assertEquals(-7, largest.largestNumber(new int[] {-7,-8,-9}));


		
	}
	
	@Test
	public void testLargestNumberEmpty() {
		/*
		 * int expected =9; int actual = largest.largestNumber(new int[] {7,8,9});
		 */
		assertEquals(1, largest.largestNumber(new int[] {1}));


		
	}
	
	@AfterEach
	public void afterEachMethod() {
		System.out.println("THis will excute After every method");
		System.out.println();
	}
	
	@AfterAll
	public  static void afterAll() {
		System.out.println("This is execute of all the methods");
		largest = null;
	}

}
