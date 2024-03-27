package com.partyplanner.eventmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partyplanner.eventmangement.model.Venue;


public interface VenueRepository extends JpaRepository<Venue, Long> {

}
