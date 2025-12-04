package com.astrobookings.fleet.domain;

import java.util.List;

import com.astrobookings.fleet.domain.models.RocketCapacity;
import com.astrobookings.shared.domain.models.BusinessErrorCode;
import com.astrobookings.shared.domain.models.BusinessException;
import com.astrobookings.fleet.domain.models.CreateRocketCommand;
import com.astrobookings.fleet.domain.models.Rocket;
import com.astrobookings.fleet.domain.ports.input.RocketsUseCases;
import com.astrobookings.fleet.domain.ports.output.RocketRepository;

public class RocketService implements RocketsUseCases {
    private final RocketRepository rocketRepository;

    public RocketService(RocketRepository rocketRepository) {
        this.rocketRepository = rocketRepository;
    }

    public List<Rocket> getAllRockets() {
        return rocketRepository.findAll();
    }

    public Rocket saveRocket(CreateRocketCommand command) {
        var capacity = new RocketCapacity(command.capacity());
        Rocket rocket = new Rocket(command.name(), capacity, command.maxSpeed() );
        return rocketRepository.save(rocket);
    }
}