package com.qa.ims.persistence.domain;

import java.util.Objects;

public class ItemRecipt {

	private Long id;
	private Long ItemId;
	private Long OrderId;
	
	public ItemRecipt(Long ItemId, Long OrderId) {
		this.setItemId(ItemId);
		this.setOrderId(OrderId);
	}
		
	public ItemRecipt(Long id, Long ItemId, Long OrderId) {
		this.setId(id);
		this.setItemId(ItemId);
		this.setOrderId(OrderId);
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	public Long getOrderId() {
		return OrderId;
	}
	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ItemId, OrderId, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemRecipt other = (ItemRecipt) obj;
		return Objects.equals(ItemId, other.ItemId) && Objects.equals(OrderId, other.OrderId)
				&& Objects.equals(id, other.id);
	}
	
}
