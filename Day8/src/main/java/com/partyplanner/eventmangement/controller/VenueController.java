package com.partyplanner.eventmangement.controller;

import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.partyplanner.eventmangement.dto.request.VenueRequest;
import com.partyplanner.eventmangement.dto.response.VenueResponse;
import com.partyplanner.eventmangement.model.Venue;
import com.partyplanner.eventmangement.service.VenueService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/venues")
@RequiredArgsConstructor
public class VenueController {
    private final VenueService venueService;
    @PostMapping("/create") 
    public ResponseEntity<VenueResponse> createVenue(@RequestBody VenueRequest request){
        VenueResponse res=new VenueResponse();
        try{
            res=venueService.createVenue(request);
            return new ResponseEntity<>(res,HttpStatus.ACCEPTED);
        }
        catch(Exception e){
            res.setMessage("something Wrong!");
            return new ResponseEntity<>(res,EXPECTATION_FAILED);
        }
    }
    @GetMapping("/all")
    public ResponseEntity<List<Venue>> getAllVenue(){
        List<Venue> venues=venueService.getAllVenues();
        return new ResponseEntity<>(venues,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{venueId}")
    public void deleteVenue(@PathVariable Long venueId){
        venueService.deleteVenue(venueId);
    }

}
