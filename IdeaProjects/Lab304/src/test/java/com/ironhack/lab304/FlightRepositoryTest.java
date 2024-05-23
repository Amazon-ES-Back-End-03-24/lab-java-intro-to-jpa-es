package com.ironhack.lab304;

import com.ironhack.lab304.models.Flight;
import com.ironhack.lab304.repository.FlightRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class FlightRepositoryTest {

    @Autowired
    private FlightRepository flightRepository;

    @BeforeEach
    public void setUp() {
        // Limpiar y preparar la base de datos antes de cada prueba
        flightRepository.deleteAll();

        Flight flight1 = new Flight();
        flight1.setFlightNumber("DL143");
        flight1.setAircraft("Boeing 747");
        flight1.setTotalAircraftSeats(400);
        flight1.setFlightMileage(135);

        Flight flight2 = new Flight();
        flight2.setFlightNumber("DL53");
        flight2.setAircraft("Boeing 777");
        flight2.setTotalAircraftSeats(264);
        flight2.setFlightMileage(2078);

        Flight flight3 = new Flight();
        flight3.setFlightNumber("DL122");
        flight3.setAircraft("Airbus A330");
        flight3.setTotalAircraftSeats(236);
        flight3.setFlightMileage(4370);

        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
    }

    @Test
    public void testFindFlightsWithAircraftContaining() {
        // Buscar vuelos que contengan "Boeing" en el nombre del avión
        List<Flight> boeingFlights = flightRepository.findFlightsWithAircraftContaining("Boeing");

        // Verificar que se encuentran los vuelos correctos
        Assertions.assertEquals(2, boeingFlights.size());
        for (Flight flight : boeingFlights) {
            Assertions.assertTrue(flight.getAircraft().contains("Boeing"));
        }
    }

    @Test
    public void testFindFlightsWithMileageGreaterThan() {
        // Buscar vuelos con una distancia mayor a 500 millas
        List<Flight> longFlights = flightRepository.findFlightsWithMileageGreaterThan(500);

        // Verificar que se encuentra el vuelo correcto
        Assertions.assertEquals(1, longFlights.size());
        Assertions.assertEquals("DL122", longFlights.get(0).getFlightNumber());
    }
}
