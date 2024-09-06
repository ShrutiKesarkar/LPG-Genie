package com.lpg_booking.lpg_booking_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lpg_booking.lpg_booking_backend.model.Admin;
import com.lpg_booking.lpg_booking_backend.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	@Qualifier("admRepo")
	AdminRepository admRepo;
	
	@Override
	public Admin login(String em, String ps) {
		// TODO Auto-generated method stub
		return admRepo.findByEmailAndPassword(em, ps);
	}

}
