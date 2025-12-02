package com.astrobookings.domain.ports;

import com.astrobookings.infrastructure.models.Rocket;

import java.util.List;

public interface RocketPort {
    List<Rocket> findAll();
    Rocket save(Rocket rocket);
}
