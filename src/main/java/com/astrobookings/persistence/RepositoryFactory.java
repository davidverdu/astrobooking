package com.astrobookings.persistence;

import com.astrobookings.persistence.implementation.InMemoryFlightRepository;
import com.astrobookings.persistence.implementation.InMemoryRocketRepository;

public class RepositoryFactory {
    public static RocketRepository createRocketRepository() {
        return new InMemoryRocketRepository();
    }

    public static FlightRepository createFlightRepository() {
        return new InMemoryFlightRepository();
    }
}
