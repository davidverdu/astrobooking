package com.astrobookings.domain.ports;

import com.astrobookings.infrastructure.models.Flight;

import java.util.List;

public interface FlightRepositoryPort {
    List<Flight> findAll();
    List<Flight> findByStatus(String status);
    Flight save(Flight flight);
}
