package com.astrobookings.domain.ports;

import com.astrobookings.infrastructure.models.Booking;

import java.util.List;

public interface BookingRepository {
    List<Booking> findAll();
    List<Booking> findByFlightId(String flightId);
    List<Booking> findByPassengerName(String passengerName);
    Booking save(Booking booking);
}
