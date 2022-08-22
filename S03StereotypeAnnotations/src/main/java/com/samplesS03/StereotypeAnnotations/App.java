package com.samplesS03.StereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S03StereotypeAnnotations.model.Instructor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samplesS03/StereotypeAnnotations/SpringConfig.xml");

		Instructor inst = (Instructor) springContainer.getBean("inst");
		System.out.println(inst);


	}
}