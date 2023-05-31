package com.hotelmanagement.dto;

import lombok.Data;

@Data
public class BookingDto {
	
	private int id;
	
    private String bookingId;
	
	private int userId;
	
	private String customerName;

	private String checkIn;    
	 
	private String checkOut;   
	
	private String status;
	
	private int hotelId;
	
	private int totalRoom;   
	
	private int totalDay;   

	private String hotelContact;
	
	private String hotelEmail;
	
	private String hotelImage;
	
	private String hotelName;
	
	private String customerContact;
	
	private String totalAmount;

	@Override
	public String toString() {
		return "BookingDto [id=" + id + ", bookingId=" + bookingId + ", userId=" + userId + ", customerName="
				+ customerName + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", status=" + status + ", hotelId="
				+ hotelId + ", totalRoom=" + totalRoom + ", totalDay=" + totalDay + ", hotelContact=" + hotelContact
				+ ", hotelEmail=" + hotelEmail + ", hotelImage=" + hotelImage + ", hotelName=" + hotelName
				+ ", customerContact=" + customerContact + ", totalAmount=" + totalAmount + "]";
	}
	
	
	
}
