package com.astrobookings.shared;

import com.astrobookings.sales.domain.ports.output.BookingRepository;
import com.astrobookings.fleet.domain.ports.output.FlightRepository;
import com.astrobookings.fleet.domain.ports.output.RocketRepository;
import com.astrobookings.sales.infrastructure.persistance.BookingRepositoryInMemory;
import com.astrobookings.fleet.FlightRepositoryInMemory;
import com.astrobookings.fleet.RocketRepositoryInMemory;

public class RepositoryFactory {
    public static RocketRepository getRocketRepository() {
        return new RocketRepositoryInMemory();
    }

    public static FlightRepository getFlightRepository() {
        return new FlightRepositoryInMemory();
    }

    public static BookingRepository getBookingRepository() { return new BookingRepositoryInMemory(); }
}
