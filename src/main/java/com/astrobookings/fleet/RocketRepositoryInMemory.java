package com.astrobookings.fleet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.astrobookings.fleet.domain.models.RocketCapacity;
import com.astrobookings.fleet.domain.ports.output.RocketRepository;
import com.astrobookings.fleet.domain.models.Rocket;

public class RocketRepositoryInMemory implements RocketRepository {
  private static final Map<String, Rocket> rockets = new HashMap<>();
  private static int nextId = 1;

  static {
    // Pre-load one rocket
    var rocketId = "00000000-0000-0000-0000-000000000001";
    RocketCapacity capacity = null;
    try {
        capacity = new RocketCapacity(7);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    Rocket falcon9 = new Rocket(rocketId, "Falcon 9", capacity, 27000.0);
    rockets.put(rocketId, falcon9);
    nextId = 2;
  }

  public List<Rocket> findAll() {
    return new ArrayList<>(rockets.values());
  }

  public Rocket findById(String id) {
        return rockets.get(id);
    }

  public Rocket save(Rocket rocket) {
    if (rocket.getId() == null) {
      rocket.setId("r" + nextId++);
    }
    rockets.put(rocket.getId(), rocket);
    return rocket;
  }
}