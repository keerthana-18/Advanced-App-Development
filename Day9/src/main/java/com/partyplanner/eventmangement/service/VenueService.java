package com.partyplanner.eventmangement.service;

import java.util.List;

import com.partyplanner.eventmangement.dto.request.VenueRequest;
import com.partyplanner.eventmangement.dto.response.VenueResponse;
import com.partyplanner.eventmangement.model.Venue;

public interface VenueService {
    VenueResponse createVenue(VenueRequest request);

    List<Venue> getAllVenues();

    void deleteVenue(Long venueId);


    

}
