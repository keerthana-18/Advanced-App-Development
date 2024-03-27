package com.partyplanner.eventmangement.dto.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventRequest {
    private Long eventId;

    private String EventType;
    private String Description;
    private Long ParticipantCount;
    private Long charges;


}
