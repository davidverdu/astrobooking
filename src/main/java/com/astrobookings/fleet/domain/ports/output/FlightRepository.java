package com.astrobookings.fleet.domain.ports.output;

import com.astrobookings.fleet.domain.models.Flight;

import java.util.List;

public interface FlightRepository {
    Flight findById(String id);
    List<Flight> findAll();
    List<Flight> findByStatus(String status);
    Flight save(Flight flight);
}
