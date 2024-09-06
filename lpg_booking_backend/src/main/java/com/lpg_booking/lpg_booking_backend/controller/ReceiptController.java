package com.lpg_booking.lpg_booking_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lpg_booking.lpg_booking_backend.model.Receipt;
import com.lpg_booking.lpg_booking_backend.services.ReceiptService;

@RestController
@RequestMapping("/lpg")
@CrossOrigin(origins = "http://localhost:4200")
public class ReceiptController {
	@Autowired
	ReceiptService rs;
	
	@GetMapping("/receipt")
	public List<Receipt> getAll()
	{
		return rs.getAll();
	}
	@PostMapping("/receipt")
	public Receipt insert(@RequestBody Receipt r)
	{
		return rs.insert(r);
	}
	@PutMapping("/receipt/{id}")
	public Receipt update(@PathVariable("id")long id,@RequestBody Receipt r)
	{
		return rs.update(id, r);
	}
	@GetMapping("/receipt/{id}")
	public Receipt search(@PathVariable("id")long id)
	{
		return rs.search(id);
	}
}
