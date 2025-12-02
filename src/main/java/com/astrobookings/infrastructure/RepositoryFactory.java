package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.BookingRepository;
import com.astrobookings.domain.ports.FlightRepository;
import com.astrobookings.domain.ports.RocketRepository;
import com.astrobookings.infrastructure.implementation.InMemoryBookingRepository;
import com.astrobookings.infrastructure.implementation.InMemoryFlightRepository;
import com.astrobookings.infrastructure.implementation.InMemoryRocketRepository;

public class RepositoryFactory {
    public static RocketRepository createRocketRepository() {
        return new InMemoryRocketRepository();
    }

    public static FlightRepository createFlightRepository() {
        return new InMemoryFlightRepository();
    }

    public static BookingRepository createBookingRepository() { return new InMemoryBookingRepository(); }
}
