package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.lpg_booking.lpg_booking_backend.model.Receipt;
import com.lpg_booking.lpg_booking_backend.repository.ReceiptRepository;
@Service
public class ReceiptServiceImpl implements ReceiptService {

	@Autowired
	@Qualifier("recRepo")
	ReceiptRepository recRepo;
	
	@Override
	public Receipt insert(Receipt rs) {
		// TODO Auto-generated method stub
		return recRepo.save(rs);
	}

	@Override
	public Receipt update(long rid, Receipt rs) {
		// TODO Auto-generated method stub
		Optional<Receipt> opt=recRepo.findById(rid);
		if(opt.isPresent())
		{
			Receipt rr=opt.get();
			rr.setCid(rs.getCid());
			rr.setQuantity(rs.getQuantity());
			rr.setD_address(rs.getD_address());
			rr.setPrice(rs.getPrice());
			rr.setPrice(rs.getPrice());
			rr.setD_date(rs.getD_date());
		return recRepo.save(rr);
		}
		return null;
	}

	@Override
	public Receipt search(long rid) {
		Optional<Receipt> opt=recRepo.findById(rid);
		if(opt.isPresent())
		{
			Receipt rr=opt.get();
			
		return rr;
		}
		return null;
	}

	@Override
	public List<Receipt> getAll() {
		// TODO Auto-generated method stub
		return recRepo.findAll();
	}

}
