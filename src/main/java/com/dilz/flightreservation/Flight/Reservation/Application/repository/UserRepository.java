package com.dilz.flightreservation.Flight.Reservation.Application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dilz.flightreservation.Flight.Reservation.Application.entities.Flight;

public interface UserRepository extends MongoRepository<Flight, Long>{

}
