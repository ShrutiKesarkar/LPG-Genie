package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.lpg_booking.lpg_booking_backend.model.Booking;
import com.lpg_booking.lpg_booking_backend.repository.BookingRepository;
@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	@Qualifier("bookRepo")
	BookingRepository bookRepo;
	
	@Override
	public Booking insert(Booking bs) {
		// TODO Auto-generated method stub
		return bookRepo.save(bs);
	}

	@Override
	public List<Booking> getAll() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public void delete(long bid) {
		bookRepo.deleteById(bid);
	}

}
