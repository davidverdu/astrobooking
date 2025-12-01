package com.astrobookings.business;

import com.astrobookings.persistence.implementation.InMemoryRocketRepository;

public class RocketService {
    private final InMemoryRocketRepository inMemoryRocketRepository;

    public RocketService(InMemoryRocketRepository inMemoryRocketRepository) {
        this.inMemoryRocketRepository = inMemoryRocketRepository;
    }

    public String getRockets() {
        var rockets = this.inMemoryRocketRepository.findAll();
        return "TODO";
    }
}
