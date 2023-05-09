package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	Random rand = new Random();
		
	private int code;
	private String name;
	private String description;
	private int price;
	private int iva;
	
	public Prodotto (String name, String description, int price, int iva) {
		
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
		code = rand.nextInt(100000000);
		
	}
	
	public int getCode() {	
		
		return code;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	public int getPrice() {
		
		return price;
	}
	
	public void setPrice(int price) {
		
		this.price = price;
	}
	
	public int getIva() {
		
		return iva;
	}
	
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	
	public String getFullCode() {
		
		return getCode() + "-" + getName();
	}
	
	public int getPriceIva() {
		
		int fullPrice = (int) ((int) price * (1 + iva / 100f));
		
		return fullPrice;
	}
	
	public String getBarCode() {
		
		String strCode = "" + code;
		int lng = strCode.length();
		
		for ( int i = 0; i < 8 - lng; i++) {
			strCode = "0" + strCode;
		}
		
		return strCode;
	}
	
	
	@Override
	public String toString() {
		
		return ("Code: " + getCode() + "\n"
				+ "Full code: " + getFullCode() + "\n"
				+ "Name: " + getName() + "\n"
				+ "Description: " + getDescription() + "\n"
				+ "Price: " + getPrice() + "\n"
				+ "Iva: " + getIva() + "\n"
				+ "Price with iva: " + getPriceIva() + "\n"
				+ "Bar code: " + getBarCode());
	}
}
