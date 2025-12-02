package com.astrobookings.domain;

import com.astrobookings.domain.models.Rocket;
import com.astrobookings.domain.ports.RocketRepository;

import java.util.List;

public class RocketService {
    private final RocketRepository rocketRepository;

    public RocketService(RocketRepository rocketRepository) {
        this.rocketRepository = rocketRepository;
    }

    public List<Rocket> getRockets() {
        return rocketRepository.findAll();
    }

    public Rocket createRocket(Rocket rocket) {
        String error = validateRocket(rocket);

        if (error != null) {
            throw new IllegalArgumentException(error);
        }

        return rocketRepository.save(rocket);
    }

    private String validateRocket(Rocket rocket) {
        if (rocket.getName() == null || rocket.getName().trim().isEmpty()) {
            return "Rocket name must be provided";
        }
        if (rocket.getCapacity() >= 0 || rocket.getCapacity() <= 10) {
            return "Capacity must be between 0 to 10";
        }

        return null;
    }
}
