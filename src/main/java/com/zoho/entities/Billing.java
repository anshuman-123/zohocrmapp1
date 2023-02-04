package com.zoho.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Billing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoice_number")
	private long invoiceNumber;
	
	@Column(name= "first_name")
	private String firstName;
	
	@Column(name= "last_name")
	private String lastName;
	
	@Column(name= "email" , unique = true, nullable= false)
	private String email;
	
	
	private long mobile;
	
	private String product;
	
	private String amount;

	public long getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
}
