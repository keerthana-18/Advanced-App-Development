package com.partyplanner.eventmangement.service;

import java.util.List;

import com.partyplanner.eventmangement.dto.request.EventRequest;

import com.partyplanner.eventmangement.dto.response.EventResponse;

import com.partyplanner.eventmangement.model.Event;

public interface EventService{
EventResponse createEvent(EventRequest request);
List<Event> getAllEvents();

    EventResponse deleteEvent(Long Id);
    EventResponse updateEvent(Long Id,EventRequest request);
    Long countEvents();

}
