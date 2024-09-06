package com.lpg_booking.lpg_booking_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpg_booking.lpg_booking_backend.model.Customer;
import com.lpg_booking.lpg_booking_backend.services.CustomerService;

@RestController
@RequestMapping("/lpg")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
	@Autowired
	CustomerService cs;
	
	@GetMapping("/customer")
	public List<Customer> getAll()
	{
		return cs.getAll();
	}
	@PostMapping("/customer")
	public Customer insert(@RequestBody Customer c)
	{
		return cs.insert(c);
	}
	@DeleteMapping("/customer/{id}")
	public void delete(@PathVariable("id")long id)
	{
		cs.delete(id);
	}
	@PutMapping("/customer/{id}")
	public Customer update(@PathVariable("id")long id,@RequestBody Customer c)
	{
		return cs.update(id, c);
	}
	@GetMapping("/customer/{id}")
	public Customer search(@PathVariable("id")long id)
	{
		return cs.search(id);
	}
	@GetMapping("/customer/{email}/{password}")
	public Customer login(@PathVariable("email")String email,@PathVariable("password")String password)
	{
		return cs.login(email, password);
	}
}
