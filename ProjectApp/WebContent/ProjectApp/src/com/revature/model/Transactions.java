package com.revature.model;

public class Transactions {

	private String description;
	private String status;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Transactions(String description, String status) {
		super();
		this.description = description;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Transactions [description=" + description + ", status=" + status + "]";
	}
	
	
	
}
