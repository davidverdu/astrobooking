package com.astrobookings.sales.domain.ports.output;

import java.util.List;

public interface FlightInfoProvider {
    FlightInfo findFlightById(String flightId);

    record FlightInfo(
            String id,
            String rocketId,
            java.time.LocalDateTime departureDate,
            double basePrice,
            String status,
            int minPassengers,
            int capacity
    ) {}
}


