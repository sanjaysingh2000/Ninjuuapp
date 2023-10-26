package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.beans.Customer;
import com.banking.dao.ProjectDao;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectDao dao;
	
	public Customer getCustomer(long accountNumber) {
		return dao.getCustomer(accountNumber);
	}

}
