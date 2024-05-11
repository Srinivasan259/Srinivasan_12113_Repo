package com.taxisys.dao;

import java.util.List;

import com.taxisys.enity.Booking;

public interface BookingDAO {

	public void addBooking(Booking booking);

	public List<Booking> findAllBooking();

	public Booking findBookingId(int bookingId);

}
