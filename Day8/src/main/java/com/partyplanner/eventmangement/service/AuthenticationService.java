package com.partyplanner.eventmangement.service;

import com.partyplanner.eventmangement.dto.request.LoginRequest;
import com.partyplanner.eventmangement.dto.request.RegisterRequest;
import com.partyplanner.eventmangement.dto.response.LoginResponse;
import com.partyplanner.eventmangement.dto.response.RegisterResponse;

public interface AuthenticationService {
RegisterResponse register(RegisterRequest request);
LoginResponse login(LoginRequest request);
}
