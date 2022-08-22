package com.samples.S05InterfaceInjection.service.impl;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;
import com.samples.S05InterfaceInjection.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO;

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderServiceImpl.placeOrder() method...");
		orderDAO.createOrder();
	}

}