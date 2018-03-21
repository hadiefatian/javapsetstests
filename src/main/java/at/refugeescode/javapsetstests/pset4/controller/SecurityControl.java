package at.refugeescode.javapsetstests.pset4.controller;

import oop.opencoding.pset4.model.Luggage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SecurityControl {

    private List<Luggage> rejectedLuggage = new ArrayList<>();

    public boolean isAllowedToTravel(Luggage luggage) {
        // validate that the luggage arrived at least 30 minutes before departure time
        // counting between the drop off time and the departure time
        // remember the luggage that has been rejected in order to facilitate it later on

        if (arrivedInTime(luggage)) {
            return true;
        }
        reject(luggage);
        return false;
    }

    private boolean arrivedInTime(Luggage luggage) {
        LocalDateTime dropOffTime = luggage.getDropOffTime();
        LocalDateTime departureTime = luggage.getDepartureTime();
        LocalDateTime boardingTime = departureTime.minusMinutes(30);
        return dropOffTime.isBefore(boardingTime);
    }

    private void reject(Luggage luggage) {
        rejectedLuggage.add(luggage);
    }

    public List<Luggage> getRejectedLuggage() {
        return rejectedLuggage;
    }
}
