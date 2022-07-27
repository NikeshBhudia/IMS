package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {

	private Long id;
	private static String itemName;
	private double price;


	public Item(String itemName, double price) {
		this.setItemName(itemName);
		this.setPrice(price);
	}
	public Item(Long id, String itemName, double price) {
		this.setId(id);
		this.setItemName(itemName);
		this.setPrice(price);
	}
		
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public static String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		Item.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, itemName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(itemName, other.itemName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
		
	}

