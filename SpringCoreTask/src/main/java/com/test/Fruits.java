package com.test;

public class Fruits {

	private String name;
	private String color;
	private int price;
	private int qnt;
	public Fruits() {
		
	}
	public Fruits(String name, String color, int price, int qnt) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.qnt = qnt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", qnt=" + qnt + "]";
	}
	
}
