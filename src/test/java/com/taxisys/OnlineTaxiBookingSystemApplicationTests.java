package com.taxisys;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.taxisys.controller.BookingController;
import com.taxisys.enity.Booking;
import com.taxisys.enity.Cab;
import com.taxisys.enity.Customer;

@SpringBootTest
class OnlineTaxiBookingSystemApplicationTests {

	@Autowired
	private BookingController bookingController;
	
	// for booking controller
		@Test
		void getallbookingTest() {
			List<Booking> book = bookingController.findallBooking();
			assertNotNull(book);
		}

		// for adding

		@Test
		@Order(2)
		void addBooking() {
			Booking book = new Booking();
			Customer customer = new Customer();
			Cab cab = new Cab();

			book.setBookingStatus("booked");
			customer.setCustomerId(3);
			cab.setCabId(1);
			book.setCustomer(customer);
			book.setCab(cab);

			Booking result = bookingController.addbooking(book);
			assertNotNull(result);
		}

		@Test
		@Order(2)
		void getBooking() {
			Booking book = new Booking();
			book = bookingController.findbookingId(4);

			assertNotNull(book);

		}


}
