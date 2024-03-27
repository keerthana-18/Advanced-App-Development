package com.partyplanner.eventmangement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Entity
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long venueId;

    private String venuName;
    private String location;
    private Long venueTypeId;

    public Venue() {
    }

    public Long getVenueId() {
        return venueId;
    }

    public void setVenueId(Long venueId) {
        this.venueId = venueId;
    }

    public String getVenuName() {
        return venuName;
    }

    public void setVenuName(String venuName) {
        this.venuName = venuName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getVenueTypeId() {
        return venueTypeId;
    }

    public void setVenueTypeId(Long venueTypeId) {
        this.venueTypeId = venueTypeId;
    }
}
