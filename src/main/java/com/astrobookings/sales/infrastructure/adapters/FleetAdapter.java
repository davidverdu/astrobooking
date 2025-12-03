package com.astrobookings.sales.infrastructure.adapters;

import com.astrobookings.fleet.domain.models.Flight;
import com.astrobookings.fleet.domain.models.Rocket;
import com.astrobookings.fleet.domain.ports.output.FlightRepository;
import com.astrobookings.fleet.domain.ports.output.RocketRepository;
import com.astrobookings.sales.domain.ports.output.FlightInfoProvider;

public class FleetAdapter implements FlightInfoProvider {
    private final FlightRepository flightRepository;
    private final RocketRepository rocketRepository;

    public FleetAdapter(FlightRepository flightRepository, RocketRepository rocketRepository) {
        this.flightRepository = flightRepository;
        this.rocketRepository = rocketRepository;
    }

    public FlightInfo findFlightById(String flightId) {
        Flight flight = flightRepository.findById(flightId);
        if (flight == null) {
            return null;
        }
        Rocket rocket = rocketRepository.findById(flight.getRocketId());
        int capacity = rocket != null ? rocket.getCapacity() : 0;

        return new FlightInfo(
                flight.getId(),
                flight.getRocketId(),
                flight.getDepartureDate(),
                flight.getBasePrice(),
                flight.getStatus().name(),
                flight.getMinPassengers(),
                capacity
        );
    }
}
