package com.astrobookings.fleet.domain.ports.output;

import com.astrobookings.fleet.domain.models.Rocket;

import java.util.List;

public interface RocketRepository {
    List<Rocket> findAll();
    Rocket findById(String id);
    Rocket save(Rocket rocket);
}
