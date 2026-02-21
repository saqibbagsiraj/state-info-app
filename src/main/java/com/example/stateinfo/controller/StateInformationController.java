package com.example.stateinfo.controller;

import com.example.stateinfo.domain.StateInformation;
import com.example.stateinfo.service.StateInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/states")
public class StateInformationController {

    @Autowired
    private StateInformationService service;

    // API 1: get all states
    @GetMapping
    public List<String> getAllStates() {
        return service.getAllStates();
    }

    // API 2: get state details
    @GetMapping("/{stateName}")
    public StateInformation getStateInfo(@PathVariable String stateName) {
        return service.getStateInfo(stateName);
    }
}
//test change