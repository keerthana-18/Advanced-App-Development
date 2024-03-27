package com.partyplanner.eventmangement.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class VenueRequest {
    private Long venueId;

    private String venuName;
    private String location;
    private Long venueTypeId;
}
