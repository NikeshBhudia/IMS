package com.qa.ims.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.persistence.dao.ItemReciptDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.ItemRecipt;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order>{


		public static final Logger LOGGER = LogManager.getLogger();

		private OrderDAO orderDAO;
		private ItemReciptDAO ItemReciptDAO;
		private Utils utils;

		public OrderController(OrderDAO orderDAO, ItemReciptDAO ItemReciptDAO, Utils utils) {
			super();
			this.orderDAO = orderDAO;
			this.ItemReciptDAO = ItemReciptDAO;
			this.utils = utils;
		}


		@Override
		public List<Order> readAll() {
			List<Order> orders = orderDAO.readAll();
			for (Order order : orders) {
				LOGGER.info(order);
			}
			return orders;
		}
		
		@Override 
		public Order create() {
			LOGGER.info("Please enter your Customer ID");
			Long Customer_id = utils.getLong();
			Order order = orderDAO.create(new Order(Customer_id));
			LOGGER.info("Order Created");
			return order;
		}

		@Override
		public Order update() {
			LOGGER.info("Please enter the id of the order you would like to update");
			Long id = utils.getLong();
			LOGGER.info("Please enter the ItemId you would like to add");
			Long ItemId = utils.getLong();
			LOGGER.info("Please enter the ID of Order you want to add it to");
			Long OrderId = utils.getLong();
			ItemRecipt ItemRecipt = ItemReciptDAO.update(new ItemRecipt(id, ItemId, OrderId));
			LOGGER.info("Order Updated");
			return ItemRecipt;
		}
		
		@Override
		public int delete() {
			LOGGER.info("Please enter the id of the order you would like to delete");
			Long id = utils.getLong();
			return orderDAO.delete(id);
		}
	}

	

