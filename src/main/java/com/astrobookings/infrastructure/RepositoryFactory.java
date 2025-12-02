package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.BookingRepository;
import com.astrobookings.domain.ports.FlightRepository;
import com.astrobookings.domain.ports.RocketRepository;
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
