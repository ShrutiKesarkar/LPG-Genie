package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.lpg_booking.lpg_booking_backend.model.Customer;
import com.lpg_booking.lpg_booking_backend.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	@Qualifier("custRepo")
	CustomerRepository custRepo;
	
	@Override
	public Customer insert(Customer cs) {
		// TODO Auto-generated method stub
		return custRepo.save(cs);
	}

	@Override
	public void delete(long cid) {
		// TODO Auto-generated method stub
		custRepo.deleteById(cid);
	}

	@Override
	public Customer update(long cid, Customer cs) {
		Optional<Customer> opt=custRepo.findById(cid);
		if(opt.isPresent())
		{
			Customer cc=opt.get();
			cc.setName(cs.getName());
			cc.setContact(cs.getContact());
			cc.setAddress(cs.getAddress());
			cc.setEmail(cs.getEmail());
			cc.setPassword(cs.getPassword());
		return custRepo.save(cc);
		}
		return null;
	}

	@Override
	public Customer search(long cid) {
		Optional<Customer> opt=custRepo.findById(cid);
		if(opt.isPresent())
		{
			Customer cc=opt.get();
			
		return cc;
		}
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return custRepo.findAll();
	}

	@Override
	public Customer login(String em, String ps) {
		// TODO Auto-generated method stub
		return custRepo.findByEmailAndPassword(em, ps);
	}

}
