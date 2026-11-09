package com.week.six;

public class ElectronicProduct extends Product{
	
	private int warrentyYears;
	
	public ElectronicProduct() {
		this(2);
	}
	
	public ElectronicProduct(int _warrYear) {
		this.warrentyYears = _warrYear;
	}
	public ElectronicProduct(String _productId,String _productName,int _price,int _warrYear) {
		super( _productId, _productName, _price);
		this.warrentyYears = _warrYear;
	}
	
	public void printFullDetails() {
		super.printProductDetails();
		System.out.println("Warrenty Year:"+warrentyYears);
	}
	
	public void changeWarrenty(int _warty) {
		this.warrentyYears = _warty;
	}
	

}
