package com.astrobookings.fleet.domain.models;

public class Rocket {
  private String id;
  private String name;
  private RocketCapacity capacity;
  private Double speed;

  public Rocket() {
  }

  public Rocket(String id, String name, RocketCapacity capacity, Double speed) {
    this.id = id;
    this.name = name;
    this.capacity = capacity;
    this.speed = speed;
  }

    public Rocket(String name, RocketCapacity capacity, Double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCapacity() {
    return capacity.getValue();
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }
}