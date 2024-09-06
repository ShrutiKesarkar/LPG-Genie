package com.lpg_booking.lpg_booking_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpg_booking.lpg_booking_backend.model.Booking;
import com.lpg_booking.lpg_booking_backend.services.BookingService;

@RestController
@RequestMapping("/lpg")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	@Autowired
	BookingService bs;
	
	@GetMapping("/booking")
	public List<Booking> getAll()
	{
		return bs.getAll();
	}
	@PostMapping("/booking")
	public Booking insert(@RequestBody Booking b)
	{
		return bs.insert(b);
	}
	@DeleteMapping("/booking/{id}")
	public void delete(@PathVariable("id")long id)
	{
		bs.delete(id);
	}


}
