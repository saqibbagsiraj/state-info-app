package com.example.stateinfo.service;

import com.example.stateinfo.domain.StateInformation;
import java.util.List;

public interface StateInformationService {

    List<String> getAllStates();

    StateInformation getStateInfo(String stateName);
}