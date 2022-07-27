package com.qa.ims.persistence.domain;

import java.util.Date;

public class Order {

	private Long id;
	private Date DueDate;
	
	public Order(Long id, Date DueDate) {
		this.setId(id);
		this.setDueDate(DueDate);
	}
	public Order(Date DueDate) {
		this.setDueDate(DueDate);
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
	
}
