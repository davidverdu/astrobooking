package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.BookingRepositoryPort;
import com.astrobookings.domain.ports.FlightRepositoryPort;
import com.astrobookings.domain.ports.RocketRepositoryPort;
import com.astrobookings.infrastructure.implementation.InMemoryBookingRepository;
import com.astrobookings.infrastructure.implementation.InMemoryFlightRepository;
import com.astrobookings.infrastructure.implementation.InMemoryRocketRepository;

public class RepositoryFactory {
    public static RocketRepositoryPort createRocketRepository() {
        return new InMemoryRocketRepository();
    }

    public static FlightRepositoryPort createFlightRepository() {
        return new InMemoryFlightRepository();
    }

    public static BookingRepositoryPort createBookingRepository() { return new InMemoryBookingRepository(); }
}
