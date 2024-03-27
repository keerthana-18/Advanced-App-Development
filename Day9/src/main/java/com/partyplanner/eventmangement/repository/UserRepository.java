package com.partyplanner.eventmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.partyplanner.eventmangement.model.User;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User,String>{

    Optional <User> findByEmail(String username);

}
