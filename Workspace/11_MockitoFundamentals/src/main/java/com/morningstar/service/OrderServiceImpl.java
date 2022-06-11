package com.morningstar.service;

import java.sql.SQLException;

import com.morningstar.dao.OrderDao;
import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;

public class OrderServiceImpl implements OrderService{
	
	private OrderDao dao;

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean placeOrder(Order order) throws OrderException {
		try 
		{
			int result = getDao().create(order);
			System.out.println("result: " + result);
			if(result != 0)
			{
				return true;
			}
		} 
		catch (SQLException e) 
		{
			throw new OrderException(e);
		}
		return false;

	}

	@Override
	public boolean cancelOrder(int id) throws OrderException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(int id) throws OrderException {
		// TODO Auto-generated method stub
		return false;
	}

}
