package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.output.BookingRepository;
import com.astrobookings.domain.ports.output.FlightRepository;
import com.astrobookings.domain.ports.output.RocketRepository;
import com.astrobookings.infrastructure.persistence.BookingRepositoryInMemory;
import com.astrobookings.infrastructure.persistence.FlightRepositoryInMemory;
import com.astrobookings.infrastructure.persistence.RocketRepositoryInMemory;

public class RepositoryFactory {
    public static RocketRepository getRocketRepository() {
        return new RocketRepositoryInMemory();
    }

    public static FlightRepository getFlightRepository() {
        return new FlightRepositoryInMemory();
    }

    public static BookingRepository getBookingRepository() { return new BookingRepositoryInMemory(); }
}
