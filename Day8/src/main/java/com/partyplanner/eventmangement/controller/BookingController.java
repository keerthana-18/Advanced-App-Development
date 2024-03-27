package com.partyplanner.eventmangement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.partyplanner.eventmangement.dto.request.BookingRequest;
import com.partyplanner.eventmangement.dto.response.BookingResponse;
import com.partyplanner.eventmangement.model.Booking;
import com.partyplanner.eventmangement.service.BookingService;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.http.HttpStatus;
import java.util.*;
@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingRequest request) {
        BookingResponse response = new BookingResponse();
        try {
            response = bookingService.createBooking(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
    // @GetMapping("/user/{userId}")
    // public ResponseEntity<List<Booking>> getBookingsByUserId(@PathVariable String userId) {
    //     List<Booking> bookings = bookingService.getusersidebookings(userId);
    //     BookingResponse response = new BookingResponse();
    //     if (bookings.isEmpty()) {
    //         response.setMessage("no bookings");
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }

    //     return new ResponseEntity<>(bookings, HttpStatus.OK);
    // }
    @DeleteMapping("/delete/{userId}")
    public void deleteBooking(@PathVariable Long userId){
        bookingService.deleteBooking(userId);
    }
    @GetMapping("/get-by-user/{userId}")
    public List<Booking> getBookingsByUserId(@PathVariable String userId) {
        return bookingService.getBookingsByUserId(userId);
    }

    @GetMapping("/total")
    public Long getTotalBookingsCount() {
        return bookingService.getTotalBookingsCount();
    }

}
