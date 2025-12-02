package com.astrobookings.domain.ports;

import com.astrobookings.domain.models.Rocket;

import java.util.List;

public interface RocketRepository {
    List<Rocket> findAll();
    Rocket save(Rocket rocket);
}
