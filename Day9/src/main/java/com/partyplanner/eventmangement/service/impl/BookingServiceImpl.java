package com.partyplanner.eventmangement.service.impl;


import org.springframework.stereotype.Service;

import com.partyplanner.eventmangement.dto.request.BookingRequest;
import com.partyplanner.eventmangement.dto.response.BookingResponse;
import com.partyplanner.eventmangement.model.Booking;

import com.partyplanner.eventmangement.repository.BookingRepository;

import com.partyplanner.eventmangement.service.BookingService;

import lombok.RequiredArgsConstructor;
import java.util.*;
@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    


    @Override
    public BookingResponse createBooking(BookingRequest request) {
       
        String userId = request.getUserId();
        String venueId = request.getVenueId();

        Booking booking = Booking.builder()
                .noOfPersons(request.getNoOfPersons())
                .ondate(request.getOnDate())
             
                .userId(userId)
                .venueId(venueId)
                .eventType(request.getEventType())
                .paymentStatus(request.getPaymentStatus())
                .build();

        bookingRepository.save(booking); 

        return BookingResponse.builder()
                .message("Booking created successfully!")
                .build();
    }
    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    // @Override
    // public List<Booking> getusersidebookings(String userid){
       
    //         return bookingRepository.findby;
        
       
    // }

    @Override
    public void deleteBooking(Long userId){
        bookingRepository.deleteById(userId);
    }
    @Override
    public List<Booking> getBookingsByUserId(String userId) {
        return bookingRepository.findByUserId(userId);
    }

    @Override
    public Long getTotalBookingsCount() {
        return bookingRepository.count();
    }


}
     