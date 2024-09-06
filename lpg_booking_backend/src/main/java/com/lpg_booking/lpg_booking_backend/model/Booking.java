package com.lpg_booking.lpg_booking_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bid;
	private String cid;
	private int quantity;
	private String delivery_address;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String cid, int quantity, String delivery_address) {
		super();
		this.cid = cid;
		this.quantity = quantity;
		this.delivery_address = delivery_address;
	}
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	
	
}
