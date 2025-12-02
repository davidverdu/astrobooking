package com.astrobookings.domain;

import com.astrobookings.domain.ports.RocketRepository;

public class RocketService {
    private final RocketRepository rocketRepository;

    public RocketService(RocketRepository rocketRepository) {
        this.rocketRepository = rocketRepository;
    }

    public String getRockets() {
        var rockets = this.rocketRepository.findAll();
        return "TODO";
    }
}
