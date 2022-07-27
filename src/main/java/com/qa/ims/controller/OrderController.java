package com.qa.ims.controller;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {


		public static final Logger LOGGER = LogManager.getLogger();

		private OrderDAO orderDAO;
		private Utils utils;

		public OrderController(OrderDAO orderDAO, Utils utils) {
			super();
			this.orderDAO = orderDAO;
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

		/**
		 * Creates a customer by taking in user input
		 */
		
		@Override 
		public Order create() {
			LOGGER.info("Please enter your Customer ID");
			Long Customer_id = utils.getLong();
			Order order = orderDAO.create(new Order(Customer_id));
			LOGGER.info("Customer created");
			return order;
		}

		/**
		 * Updates an existing customer by taking in user input
		 */
		@Override
		public Order update() {
			LOGGER.info("Please enter the id of the order you would like to update");
			Long id = utils.getLong();
			LOGGER.info("Please enter the id");
			Order order = orderDAO.update(new Order(id));
			LOGGER.info("Customer updated");
			return order;
		}
	

		/**
		 * 
		 * 
		 * @return
		 */
		@Override
		public int delete() {
			LOGGER.info("Please enter the id of the order you would like to delete");
			Long id = utils.getLong();
			return orderDAO.delete(id);
		}
	}

	

