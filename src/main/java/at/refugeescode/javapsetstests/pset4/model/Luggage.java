package at.refugeescode.javapsetstests.pset4.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Luggage {

    private String owner;

    private String destination;

    private String type;

    private LocalDateTime dropOffTime;

    private LocalDateTime departureTime;

    private Duration flightDuration;

    private Duration waitingDuration;

    private LocalDateTime arrivalTime;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(LocalDateTime dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Duration getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(Duration flightDuration) {
        this.flightDuration = flightDuration;
    }

    public Duration getWaitingDuration() {
        return waitingDuration;
    }

    public void setWaitingDuration(Duration waitingDuration) {
        this.waitingDuration = waitingDuration;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
