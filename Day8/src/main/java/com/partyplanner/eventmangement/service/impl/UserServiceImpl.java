package com.partyplanner.eventmangement.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.partyplanner.eventmangement.dto.response.BasicResponse;
import com.partyplanner.eventmangement.dto.response.UserResponse;
import com.partyplanner.eventmangement.model.User;
import com.partyplanner.eventmangement.repository.UserRepository;
import com.partyplanner.eventmangement.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public BasicResponse<UserResponse> getAllUser(){
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponses = users.stream().map(user-> UserResponse.builder()
            .id(user.getId())
            .username(user.getUsername())
            .email(user.getEmail())
            .role(user.getRole())
            .build())
            .collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder()
            .message("User data fetched successfully!!!")
            .data(userResponses)
            .build(); 
    }

}