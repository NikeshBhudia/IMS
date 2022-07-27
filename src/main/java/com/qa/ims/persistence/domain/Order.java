package com.qa.ims.persistence.domain;

import java.util.Date;
import java.util.Objects;

public class Order {
	
	private Long id;
	private Date DueDate;
	private Long Customer_id;
	
	public Order(Date DueDate, Long Customer_id) {
		this.setDueDate(DueDate);
		this.setCustomer_id(Customer_id);
	}

	public Order(Long id, Date DueDate, Long Customer_id) {
		this.setId(id);
		this.setDueDate(DueDate);
		this.setCustomer_id(Customer_id);
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDueDate() {
		return DueDate;
	}
	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}
	public Long getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		Customer_id = customer_id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", DueDate=" + DueDate + ", Customer_id=" + Customer_id + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Customer_id, DueDate, id);
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
		return Objects.equals(Customer_id, other.Customer_id) && Objects.equals(DueDate, other.DueDate)
				&& Objects.equals(id, other.id);
	}
	
	


	
	
}
