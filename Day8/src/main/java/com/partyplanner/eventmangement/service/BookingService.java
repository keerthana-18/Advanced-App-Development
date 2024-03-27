package com.partyplanner.eventmangement.service;

import java.util.List;

import com.partyplanner.eventmangement.dto.request.BookingRequest;
import com.partyplanner.eventmangement.dto.response.BookingResponse;
import com.partyplanner.eventmangement.model.Booking;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
    List<Booking> getAllBookings();
    // List<Booking> getusersidebookings(String userid);
    void deleteBooking(Long userId);
    // String getUsernameByUserId(String userIds);
    List<Booking> getBookingsByUserId(String userId) ;
    Long getTotalBookingsCount();

}
