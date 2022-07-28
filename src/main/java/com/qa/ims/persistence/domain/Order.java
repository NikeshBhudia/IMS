package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private Long customer_id;
	private Long orderId;
	private Long itemId;
	
	public Order(Long customer_id) {
		this.customer_id = customer_id;
	
	}
	public Order(Long orderId, Long itemId) {
		this.orderId = orderId;
		this.itemId = itemId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer_id=" + customer_id + ", OrderId=" + orderId + ", ItemId=" + itemId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(itemId, orderId, customer_id, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(itemId, other.itemId) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(customer_id, other.customer_id) && Objects.equals(id, other.id);
	}


}
	
	
	
