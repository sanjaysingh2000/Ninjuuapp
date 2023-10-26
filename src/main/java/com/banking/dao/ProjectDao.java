package com.banking.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.banking.beans.Customer;

@Repository	 
public class ProjectDao {
	
	public Customer getCustomer(long accountNumber) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("student_db");
		EntityManager manager = factory.createEntityManager();
		
		Customer customer = manager.find(Customer.class, accountNumber);
		return customer;
		
		
	}
}
