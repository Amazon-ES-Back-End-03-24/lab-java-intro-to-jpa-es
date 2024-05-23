package com.ironhack.lab304.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "Flight_bookings")

public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer bookingId;

    private Integer customerId;

    private Integer flightId;

    public FlightBooking(){

    }

    public FlightBooking(Integer customerId, Integer flightId){
        this.customerId=customerId;
        this.flightId=flightId;

    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
}
