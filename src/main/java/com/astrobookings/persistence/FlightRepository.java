package com.astrobookings.persistence;

import com.astrobookings.persistence.models.Flight;

import java.util.List;

public interface FlightRepository {
    List<Flight> findAll();
    List<Flight> findByStatus(String status);
    Flight save(Flight flight);
}
