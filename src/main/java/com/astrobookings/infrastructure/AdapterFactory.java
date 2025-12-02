package com.astrobookings.infrastructure;

import com.astrobookings.domain.ports.BookingPort;
import com.astrobookings.domain.ports.FlightPort;
import com.astrobookings.domain.ports.RocketPort;
import com.astrobookings.infrastructure.adapters.inmemory.BookingAdapter;
import com.astrobookings.infrastructure.adapters.inmemory.FlightAdapter;
import com.astrobookings.infrastructure.adapters.inmemory.RocketAdapter;

public class AdapterFactory {
    public static RocketPort getRocketAdapter() {
        return new RocketAdapter();
    }

    public static FlightPort getFlightAdapter() {
        return new FlightAdapter();
    }

    public static BookingPort getBookingAdapter() { return new BookingAdapter(); }
}
