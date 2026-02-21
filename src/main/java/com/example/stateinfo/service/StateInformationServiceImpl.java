package com.example.stateinfo.service;

import com.example.stateinfo.domain.StateInformation;
import com.example.stateinfo.repository.StateInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateInformationServiceImpl
        implements StateInformationService {

    @Autowired
    private StateInformationRepository repository;

    @Override
    public List<String> getAllStates() {
        return repository.findAll()
                .stream()
                .map(StateInformation::getStateName)
                .toList();
    }

    @Override
    public StateInformation getStateInfo(String stateName) {
        return repository.findByStateName(stateName).orElse(null);
    }
}