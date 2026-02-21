package com.example.stateinfo.repository;

import com.example.stateinfo.domain.StateInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateInformationRepository
        extends JpaRepository<StateInformation, Long> {

    Optional<StateInformation> findByStateName(String stateName);
}