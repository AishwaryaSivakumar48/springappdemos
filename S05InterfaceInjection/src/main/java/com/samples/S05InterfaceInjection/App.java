package com.samples.S05InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S05InterfaceInjection.service.OrderService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S05InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("service");
		System.out.println(service);
		service.placeOrder();

	}
}