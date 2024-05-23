package com.ironhack.lab304.repository;

import com.ironhack.lab304.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends JpaRepository <Flight, Integer>{
    Optional<Flight> findByFlightNumber(String dl143);

    List<Flight> findByFlightMileageGreaterThan(int i);

    List<Flight> findFlightsWithMileageGreaterThan(int i);

    List<Flight> findFlightsWithAircraftContaining(String boeing);
}
