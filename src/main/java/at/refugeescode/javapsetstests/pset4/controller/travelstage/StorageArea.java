package at.refugeescode.javapsetstests.pset4.controller.travelstage;

import oop.opencoding.pset4.model.Luggage;

import java.time.Duration;
import java.time.LocalDateTime;

public class StorageArea implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add as much duration to the processing time as the departure time minus 30 minutes
        // if 30 minutes is not possible, the luggage won't be stored at all, which means that
        // no waiting time will be added at all

        return new StorageAreaProcessor(luggage).process();
    }

    private class StorageAreaProcessor {

        private LocalDateTime begin;
        private LocalDateTime end;
        private Luggage luggage;

        public StorageAreaProcessor(Luggage luggage) {
            this.luggage = luggage;
        }

        public Luggage process() {
            calculateBegin();
            calculateEnd();
            addStorageDuration();
            return luggage;
        }

        private void calculateBegin() {
            Duration waitingDuration = luggage.getWaitingDuration();
            begin = luggage.getDropOffTime().plus(waitingDuration);
        }

        private void calculateEnd() {
            LocalDateTime departureTime = luggage.getDepartureTime();
            end = departureTime.minusMinutes(30);
        }

        private void addStorageDuration() {
            if (end.isBefore(begin)) {
                return;
            }
            Duration storageDuration = Duration.between(begin, end);
            Duration waitingDuration = luggage.getWaitingDuration();
            Duration updatedDuration = waitingDuration.plus(storageDuration);
            luggage.setWaitingDuration(updatedDuration);
        }
    }
}
