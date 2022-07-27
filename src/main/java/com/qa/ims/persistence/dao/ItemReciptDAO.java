package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.persistence.domain.ItemRecipt;
import com.qa.ims.utils.DBUtils;

public class ItemReciptDAO implements Dao<ItemRecipt> {

	public static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public ItemRecipt modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long id = resultSet.getLong("id");
		Long ItemId = resultSet.getLong("ItemId");
		Long OrderId = resultSet.getLong("OrderId");
		return new ItemRecipt(id, ItemId, OrderId);
	}
	/**
	 * 
	 * 
	 * @return 
	 */
	@Override
	public List<ItemRecipt> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orders");) {
			List<ItemRecipt> ItemRecipt = new ArrayList<>();
			while (resultSet.next()) {
				ItemRecipt.add(modelFromResultSet(resultSet));
			}
			return ItemRecipt;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}

	public ItemRecipt readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM ItemRecipt ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * 
	 * 
	 * @param ItemRecipt
	 */
	@Override
	public ItemRecipt create(ItemRecipt ItemRecipt) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO ItemRecipt(ItemId, OrderId) VALUES (?, ?)");) {
			statement.setLong(1, ItemRecipt.getItemId());
			statement.setLong(2, ItemRecipt.getOrderId());
			statement.executeUpdate();
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public ItemRecipt read(Long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM ItemRecipt WHERE id = ?");) {
			statement.setLong(1, id);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResultSet(resultSet);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * 
	 * 
	 * @param ItemRecipt
	 * 
	 * @return
	 */
	@Override
	public ItemRecipt update(ItemRecipt ItemRecipt) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("UPDATE ItemRecipt SET ItemId = ?, OrderId = ? WHERE id = ?");) {
			statement.setLong(1, ItemRecipt.getOrderId());
			statement.setLong(2, ItemRecipt.getItemId());
			statement.setLong(3, ItemRecipt.getId());
			statement.executeUpdate();
			return read(ItemRecipt.getId());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * 
	 * @param id 
	 */
	@Override
	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM ItemRecipt WHERE id = ?");) {
			statement.setLong(1, id);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}


}
