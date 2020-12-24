package com.cubic;

public class Laptop {
	private String brand;
	private String size;
	private int price;
	private Charger charger;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", size=" + size + ", price=" + price + ", charger=" + charger + "]";
	}

}
