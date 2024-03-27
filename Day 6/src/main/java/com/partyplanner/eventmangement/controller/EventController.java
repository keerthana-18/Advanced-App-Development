package com.partyplanner.eventmangement.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyplanner.eventmangement.dto.request.EventRequest;
import com.partyplanner.eventmangement.dto.response.EventResponse;
import com.partyplanner.eventmangement.model.Event;
import com.partyplanner.eventmangement.service.EventService;

import lombok.RequiredArgsConstructor;

import java.util.List;
@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {
    private final EventService eventservice;
    @PostMapping("/create")
    public ResponseEntity<EventResponse> createEvent(EventRequest request){
        EventResponse res=new EventResponse();
        try{
            res=eventservice.createEvent(request);
            return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            res.setMessage("Something wrong");
            return new ResponseEntity<>(res,HttpStatus.EXPECTATION_FAILED);
        }

    }
    @GetMapping("/all")
    public ResponseEntity<List<Event>> getAllEvents(){
        List<Event> event=eventservice.getAllEvents();
        return new ResponseEntity<>(event,HttpStatus.OK);
    }

     @PutMapping("/update/{eventId}")
    public ResponseEntity<EventResponse> updateEvent(@PathVariable Long eventId, @RequestBody EventRequest request) {
        EventResponse res = new EventResponse();
        try {
            res = eventservice.updateEvent(eventId, request);
            return new ResponseEntity<>(res, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            res.setMessage("Something wrong");
            return new ResponseEntity<>(res, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/delete/{eventId}")
    public ResponseEntity<EventResponse> deleteEvent(@PathVariable Long eventId) {
        EventResponse res = new EventResponse();
        try {
            res = eventservice.deleteEvent(eventId);
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            res.setMessage("Something wrong");
            return new ResponseEntity<>(res, HttpStatus.EXPECTATION_FAILED);
        }
    }
    @GetMapping("/count")
    public Long countEvents() {
        return eventservice.countEvents();
    }

    

}
