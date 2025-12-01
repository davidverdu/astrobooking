package com.astrobookings.persistence;

import com.astrobookings.persistence.models.Rocket;

import java.util.List;

public interface RocketRepository {
    List<Rocket> findAll();
    Rocket save(Rocket rocket);
}
