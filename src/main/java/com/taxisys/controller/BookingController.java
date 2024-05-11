package com.taxisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxisys.dao.BookingDAO;
import com.taxisys.enity.Booking;

@RestController
@CrossOrigin("*")
public class BookingController {

	@Autowired
	private BookingDAO bookdao;

	@PostMapping("/addBooking")
	public Booking addbooking(@RequestBody Booking booking) {
		bookdao.addBooking(booking);
		return booking;

	}

	@GetMapping("/getAllbooking")
	public List<Booking> findallBooking() {
		return bookdao.findAllBooking();
	}

	@GetMapping("/getBookingById/{bookingId}")
	public Booking findbookingId(@PathVariable("bookingId") int bookingId) {
		return bookdao.findBookingId(bookingId);

	}	

}
