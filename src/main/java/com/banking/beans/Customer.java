package com.banking.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@Column(name="account_number")
	private long accountNumber;
	private String name;
	private int age;
	private double balance;
	private String password;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(long accountNumber, String name, int age, double balance, String password) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.age = age;
		this.balance = balance;
		this.password = password;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [accountNumber=" + accountNumber + ", name=" + name + ", age=" + age + ", balance=" + balance
				+ ", password=" + password + "]";
	}
	
}