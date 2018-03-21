package at.refugeescode.javapsetstests.pset4.controller.travelstage;

import oop.opencoding.pset4.model.Luggage;

import java.time.Duration;

public class DropOffStand implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 10 minutes to the processing time

        Duration waitingDuration = luggage.getWaitingDuration();
        Duration updatedDuration = waitingDuration.plusMinutes(10);
        luggage.setWaitingDuration(updatedDuration);
        return luggage;
    }
}
