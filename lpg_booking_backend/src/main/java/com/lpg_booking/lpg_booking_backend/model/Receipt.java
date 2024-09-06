package com.lpg_booking.lpg_booking_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Receipt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rid;
	private long cid;
	private int quantity;
	private String d_address;
	private int price;
	private String d_date;
	public Receipt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receipt(long cid, int quantity, String d_address, int price, String d_date) {
		super();
		this.cid = cid;
		this.quantity = quantity;
		this.d_address = d_address;
		this.price = price;
		this.d_date = d_date;
	}
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getD_date() {
		return d_date;
	}
	public void setD_date(String d_date) {
		this.d_date = d_date;
	}
	

}
