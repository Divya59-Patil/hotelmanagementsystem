package com.hotelmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {
    private final JavaMailSender mailSender;

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendBookingConfirmationEmail(String recipient, String bookingDetails) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        
        helper.setFrom("royalhotelgr4@gmail.com");
        helper.setTo(recipient);
        helper.setSubject("Hotel Booking Confirmation");
        helper.setText("Dear Guest,\n\nThank you for booking a hotel. Here are your booking details:\n\n" + bookingDetails);

        mailSender.send(message);
    }
}
