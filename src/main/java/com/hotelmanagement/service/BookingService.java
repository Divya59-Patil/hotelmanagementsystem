package com.hotelmanagement.service;

import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelmanagement.dao.BookingDao;
import com.hotelmanagement.entity.Booking;
import com.hotelmanagement.entity.User;

@Service
public class BookingService {
	
	@Autowired
	private BookingDao bookingDao;
	
	User user = new User();
	
	private final EmailService emailService;

    @Autowired
    public BookingService(EmailService emailService) {
        this.emailService = emailService;
    }
	
    public void confirmBooking(Booking booking) {
        // Code to save the booking and perform necessary operations

        // Send email notification
        try {
        	if(booking.getStatus()== "Approved") {
        		 emailService.sendBookingConfirmationEmail(user.getEmailId(), booking.toString());
        	}  
        } catch (MessagingException e) {
            // Handle exception
        	System.out.println(e);
        }
    }
	
	public Booking bookHotel(Booking booking) {
	    bookingDao.save(booking);
	    try {
        	
        		 emailService.sendBookingConfirmationEmail(user.getEmailId(), booking.toString());
        	
        } catch (MessagingException e) {
            // Handle exception
        	System.out.println(e);
        }
	    return bookingDao.save(booking);
	}


	public List<Booking> getAllBookings() {
		return bookingDao.findAll();
	}
	
	public List<Booking> getMyBookings(int userId) {
		return bookingDao.findByUserId(userId);
	}
	
	public List<Booking> getMyHotelBookings(int hotelId) {
		return bookingDao.findByHotelId(hotelId);
	}
	
	public Booking getBookingById(int bookingId) {
		return bookingDao.findById(bookingId).get();
	}
	
	
	
}
