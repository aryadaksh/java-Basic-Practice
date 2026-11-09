package ecom.JUnit.Sample.OrderMgmt;

public class DiscountCalculator {

	/*
	 * Calculate Discount using calculateDicount()
	 * 
	 * @param price int its Price of product
	 * 
	 * @param type String its types of customer either Regular/Premium
	 * 
	 * @param discountPercent int its will get percentage
	 */

	public int calculateDiscount(int price, String type, int discountPercent) {

		int finalAmount = 0;
		switch (type) {
		case "Regular":
			finalAmount = price - (price * discountPercent / 100);
			
			break;
		case "Gold":
			finalAmount = price - (price * discountPercent / 100) - 100;
			break;
		default:
			finalAmount = price;
			break;
		}
		return finalAmount;
	}
}
