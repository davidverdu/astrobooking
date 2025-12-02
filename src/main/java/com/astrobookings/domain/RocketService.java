package com.astrobookings.domain;

import com.astrobookings.domain.ports.RocketRepositoryPort;

public class RocketService {
    private final RocketRepositoryPort rocketRepository;

    public RocketService(RocketRepositoryPort rocketRepository) {
        this.rocketRepository = rocketRepository;
    }

    public String getRockets() {
        var rockets = this.rocketRepository.findAll();
        return "TODO";
    }
}
