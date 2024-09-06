package com.lpg_booking.lpg_booking_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class LpgBookingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LpgBookingBackendApplication.class, args);
	}

}
