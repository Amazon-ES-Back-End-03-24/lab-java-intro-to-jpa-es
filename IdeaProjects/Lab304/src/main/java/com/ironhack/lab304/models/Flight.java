package com.ironhack.lab304.models;


import jakarta.persistence.*;

@Entity
@Table(name="flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    private String flightNumber;

    private String aircraft;

    private Integer totalAircraftSeats;

    private Integer flightMileage;

    public Flight() {

    }

    public Flight(String flightNumber,String aircraft, Integer totalAircraftSeats,Integer flightMileage){
        this.flightNumber= flightNumber;
        this.aircraft=aircraft;
        this.totalAircraftSeats=totalAircraftSeats;
        this.flightMileage=flightMileage;

    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
}
