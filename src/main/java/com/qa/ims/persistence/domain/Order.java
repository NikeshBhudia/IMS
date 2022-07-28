package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private Long customer_id;
	private Long OrderId;
	private Long ItemId;
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
		return OrderId;
	}
	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer_id=" + customer_id + ", OrderId=" + OrderId + ", ItemId=" + ItemId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ItemId, OrderId, customer_id, id);
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
		return Objects.equals(ItemId, other.ItemId) && Objects.equals(OrderId, other.OrderId)
				&& Objects.equals(customer_id, other.customer_id) && Objects.equals(id, other.id);
	}


}
	
	
	
