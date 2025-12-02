package com.astrobookings.infrastructure;

import com.astrobookings.infrastructure.models.Flight;

import java.util.List;

public interface FlightRepository {
    List<Flight> findAll();
    List<Flight> findByStatus(String status);
    Flight save(Flight flight);
}
