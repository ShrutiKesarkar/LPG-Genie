package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;

import com.lpg_booking.lpg_booking_backend.model.Booking;

public interface BookingService {
	Booking insert(Booking bs);
	void delete(long bid);
	List<Booking> getAll();

}
