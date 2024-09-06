package com.lpg_booking.lpg_booking_backend.services;

import java.util.List;

import com.lpg_booking.lpg_booking_backend.model.Receipt;

public interface ReceiptService {
	Receipt insert(Receipt rs);
	Receipt update(long rid,Receipt rs);
	Receipt search(long rid);
	List<Receipt> getAll();
}
