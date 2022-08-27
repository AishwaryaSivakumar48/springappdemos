package com.samples.S05InterfaceInjection.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;
import com.samples.S05InterfaceInjection.service.OrderService;

@Component("orderservice")
public class OrderServiceImpl implements OrderService {

	@Autowired
	@Qualifier("dao")
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