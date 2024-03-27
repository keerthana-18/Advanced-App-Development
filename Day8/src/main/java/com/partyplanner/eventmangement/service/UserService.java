package com.partyplanner.eventmangement.service;

import com.partyplanner.eventmangement.dto.response.BasicResponse;
import com.partyplanner.eventmangement.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}
