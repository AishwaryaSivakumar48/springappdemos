package com.samples.S03StereotypeAnnotations.model;

import org.springframework.stereotype.Component;

public class Patient {

	private int id;
	
	public Patient() {
		System.out.println("Inside patient constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Inside the setter method for Id field");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	public void methodOne() {
		System.out.println("Inside methodOne");
	}
	
	public void methodTwo() {
		System.out.println("Inside methodTwo");
	}
	
}