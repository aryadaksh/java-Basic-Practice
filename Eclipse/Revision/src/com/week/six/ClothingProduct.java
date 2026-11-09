package com.week.six;

public class ClothingProduct extends Products {
	
	private String typeOfProduct;
	
	public ClothingProduct(String _productId,String _productName,int _price,String _tOP) {
		super(_productId,_productName,_price);
		this.typeOfProduct = _tOP;
	}
	
	public ClothingProduct(String _tOP) {
		this.typeOfProduct = _tOP;
	}
	public ClothingProduct() {
		this("Mens Product");
	}
	
	public void printDetailsCloth() {
		super.printProductDetails();
		System.out.println("Type of Product:"+typeOfProduct);
	}
	
	public void changeDetailsCloth(int _price, String _type) {
		int price = _price;
		super.changeProductDetails("Cloth_xxx", "Mens Cloth", price);
		this.typeOfProduct = _type;
	}
	

}
