package com.partyplanner.eventmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partyplanner.eventmangement.model.Event;

public interface EventRepository extends JpaRepository<Event,Long> {

}
