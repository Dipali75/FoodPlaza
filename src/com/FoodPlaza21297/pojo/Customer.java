package com.FoodPlaza21297.pojo;

public class Customer {
	int cusId;
	String cusName;
	String cusAddr;
	String cusEmail;
	String cusContact;
	String cuspsw;
	
	public Customer(int cusId, String cusName, String cusAddr, String cusEmail,String cusContact, String cuspsw) 
	{
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAddr = cusAddr;
		this.cusEmail = cusEmail;
		this.cusContact = cusContact;
		this.cuspsw = cuspsw;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusAddr() {
		return cusAddr;
	}

	public void setCusAddr(String cusAddr) {
		this.cusAddr = cusAddr;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusContact() {
		return cusContact;
	}

	public void setCusContact(String cusContact) {
		this.cusContact = cusContact;
	}

	public String getCuspsw() {
		return cuspsw;
	}

	public void setCuspsw(String cuspsw) {
		this.cuspsw = cuspsw;
	}

	
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName
				+ ", cusAddr=" + cusAddr + ", cusEmail=" + cusEmail
				+ ", cusContact=" + cusContact + ", cuspsw=" + cuspsw + "]";
	}
	

}
