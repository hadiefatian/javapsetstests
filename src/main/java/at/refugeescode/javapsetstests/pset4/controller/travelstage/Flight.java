package at.refugeescode.javapsetstests.pset4.controller.travelstage;

import oop.opencoding.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class Flight implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add travel duration to the processing time
        // Update arrival time

        addTravelDuration(luggage);
        updateArrivalTime(luggage);
        return luggage;
    }

    private void addTravelDuration(Luggage luggage) {
        Duration waitingDuration = luggage.getWaitingDuration();
        Duration flightDuration = luggage.getFlightDuration();
        Duration updatedDuration = waitingDuration.plus(flightDuration);
        luggage.setWaitingDuration(updatedDuration);
    }

    private void updateArrivalTime(Luggage luggage) {
        LocalDateTime departureTime = luggage.getDepartureTime();
        Duration flightDuration = luggage.getFlightDuration();
        LocalDateTime arrivalTime = departureTime.plus(flightDuration);
        luggage.setArrivalTime(arrivalTime);
    }
}
