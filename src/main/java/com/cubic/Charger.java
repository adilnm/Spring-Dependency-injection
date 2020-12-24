package com.cubic;

public class Charger {
	private String brand;
	private String color;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", color=" + color + "]";
	}

}
