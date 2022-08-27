package com.samples.S06SpringJdbc.dao;

import com.samples.S06SpringJdbc.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);
	
	Employee read(int id);
	
}