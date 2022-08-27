package com.samples.S05InterfaceInjection.DAO.impl;

import org.springframework.stereotype.Component;

import com.samples.S05InterfaceInjection.DAO.OrderDAO;

@Component("daov2")
public class OrderDAOImplV2 implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("create order in Oracle DB");
	}

}