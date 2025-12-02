package com.astrobookings.domain.ports;

import com.astrobookings.domain.models.Flight;

import java.util.List;

public interface FlightPort {
    List<Flight> findAll();
    List<Flight> findByStatus(String status);
    Flight save(Flight flight);
}
