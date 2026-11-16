package com.springdi.bean;

public class Address {
	
	private String line1;
	private String line2;
	private String cityName;
	public Address(String line1, String line2, String cityName) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.cityName = cityName;
	}
	
	public String display() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", cityName=" + cityName + "]";
	}

	
}
