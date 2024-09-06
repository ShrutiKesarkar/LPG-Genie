package com.lpg_booking.lpg_booking_backend.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lpg_booking.lpg_booking_backend.model.Receipt;

@Repository
@Qualifier("recRepo")
public interface ReceiptRepository extends JpaRepository<Receipt, Long>{

}
