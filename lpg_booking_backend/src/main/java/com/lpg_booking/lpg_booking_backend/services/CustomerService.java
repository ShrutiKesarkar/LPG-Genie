package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;

import com.lpg_booking.lpg_booking_backend.model.Customer;

public interface CustomerService {
	Customer insert(Customer cs);
	void delete(long cid);
	Customer update(long cid,Customer cs);
	Customer search(long cid);
	List<Customer> getAll();
	Customer login(String em,String ps);
}
