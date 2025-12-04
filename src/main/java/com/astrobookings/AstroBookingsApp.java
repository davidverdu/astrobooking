package com.astrobookings;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.astrobookings.fleet.domain.RocketService;
import com.astrobookings.fleet.domain.ports.input.RocketsUseCases;
import com.astrobookings.fleet.domain.ports.output.RocketRepository;
import com.astrobookings.fleet.RocketRepositoryInMemory;
import com.astrobookings.sales.infrastructure.presentation.AdminHandler;
import com.astrobookings.sales.infrastructure.presentation.BookingHandler;
import com.astrobookings.fleet.infrastructure.presentation.FlightHandler;
import com.astrobookings.fleet.infrastructure.presentation.RocketHandler;
import com.sun.net.httpserver.HttpServer;

public class AstroBookingsApp {
  public static void main(String[] args) throws IOException {
    // Create HTTP server on port 8080
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    RocketRepository rocketRepository = new RocketRepositoryInMemory();
    RocketsUseCases rocketsUseCases = new RocketService(rocketRepository);

    // Register handlers for endpoints
    server.createContext("/rockets", new RocketHandler(rocketsUseCases));
    server.createContext("/flights", new FlightHandler());
    server.createContext("/bookings", new BookingHandler());
    server.createContext("/admin/cancel-flights", new AdminHandler());

    // Start server
    server.setExecutor(null); // Use default executor
    server.start();
    System.out.println("Server started at http://localhost:8080");
  }
}
