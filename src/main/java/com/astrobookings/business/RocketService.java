package com.astrobookings.business;

import com.astrobookings.persistence.RocketRepository;
import com.astrobookings.persistence.models.Rocket;

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
