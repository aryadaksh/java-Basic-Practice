package com.week.six;

public class MensProduct extends ClothingProduct {
	
	private char size;
	
	public MensProduct(String _productId,String _productName,int _price,String _tOP,char _size) {
		super(_productId,_productName,_price,_tOP);
		this.size = _size;
	}
	public MensProduct(char _size) {
		this.size = _size;
		
	}
	public MensProduct() {
		this('X');
	}
	
	public void printDetailsMenProduct() {
		super.printDetailsCloth();
		System.out.println("Size :"+size);
	}
	
	public void changeDetailsMenProducts(char _size) {
		super.changeDetailsCloth(1000, "Mens ");
		this.size = _size;
	}

}
