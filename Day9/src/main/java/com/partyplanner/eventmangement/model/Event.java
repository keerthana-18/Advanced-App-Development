package com.partyplanner.eventmangement.model;

import lombok.Builder;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@Builder

@AllArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    private String EventType;
    private String Description;
    private Long ParticipantCount;
    private Long charges;

    public Event(){
        super();
    }
    public Long getEventId() {
        return eventId;
    }

    public String getEventType() {
        return EventType;
    }

    public String getDescription() {
        return Description;
    }

    public Long getParticipantCount() {
        return ParticipantCount;
    }

    public Long getCharges() {
        return charges;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setParticipantCount(Long participantCount) {
        ParticipantCount = participantCount;
    }

    public void setCharges(Long charges) {
        this.charges = charges;
    }
}
