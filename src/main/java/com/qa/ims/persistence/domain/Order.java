package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private Long Customer_id;

	
	public Order(Long customer_id) {
		this.setCustomer_id(customer_id);
	}
	public Order(Long id, Long customer_id) {
		this.setId(id);
		this.setCustomer_id(customer_id);
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.Customer_id = customer_id;
	}
	
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer_id=" + Customer_id +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Customer_id, id);
	}
	


}
	
	
	
