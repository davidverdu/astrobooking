package com.astrobookings.domain;

import com.astrobookings.domain.ports.RocketPort;

public class RocketService {
    private final RocketPort rocketRepository;

    public RocketService(RocketPort rocketRepository) {
        this.rocketRepository = rocketRepository;
    }

    public String getRockets() {
        var rockets = this.rocketRepository.findAll();
        return "TODO";
    }
}
