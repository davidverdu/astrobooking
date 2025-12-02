package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.output.BookingRepository;
import com.astrobookings.domain.ports.output.FlightRepository;
import com.astrobookings.domain.ports.output.RocketRepository;
import com.astrobookings.infrastructure.adapters.inmemory.BookingRepositoryInMemory;
import com.astrobookings.infrastructure.adapters.inmemory.FlightRepositoryInMemory;
import com.astrobookings.infrastructure.adapters.inmemory.RocketRepositoryInMemory;

public class RepositoryFactory {
    public static RocketRepository getRocketRepository() {
        return new RocketRepositoryInMemory();
    }

    public static FlightRepository getFlightRepository() {
        return new FlightRepositoryInMemory();
    }

    public static BookingRepository getBookingRepository() { return new BookingRepositoryInMemory(); }
}
