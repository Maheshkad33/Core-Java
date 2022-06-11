package com.morningstar.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.morningstar.dao.OrderDao;
import com.morningstar.exception.OrderException;
import com.morningstar.model.Order;

public class OrderServiceImplTest {

	OrderServiceImpl target = null;
	
	Order order = null;
	
	@Mock
	OrderDao orderdao = null;
	
	@Before
	public void setup() {
		
		MockitoAnnotations.initMocks(this);
		
		target = new OrderServiceImpl();
		order = new Order();
		order.setId(1234);
		order.setStatus("Confirm");
		
		target.setDao(orderdao);
	}

	@Test
	public void testPlaceOrderShouldSaveOrderInDatabaseAndReturnTrue() throws OrderException, SQLException {
		when(orderdao.create(order)).thenReturn(1);
		boolean result = target.placeOrder(order);
		assertTrue(result);

	}

}
