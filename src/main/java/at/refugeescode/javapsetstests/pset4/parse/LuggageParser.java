package at.refugeescode.javapsetstests.pset4.parse;

import oop.opencoding.pset4.model.Luggage;
import oop.opencoding.pset4.util.TimeUtils;

import java.time.Duration;
import java.util.Optional;

public class LuggageParser extends AbstractParser<Luggage> {

    @Override
    protected Optional<Luggage> toObject(String[] columns) {
        if (columns.length != 6) {
            return Optional.empty();
        }
        return Optional.of(toTravelReport(columns));
    }

    private Luggage toTravelReport(String[] columns) {
        Luggage luggage = new Luggage();
        luggage.setOwner(columns[0]);
        luggage.setDestination(columns[1]);
        luggage.setType(columns[2]);
        luggage.setDropOffTime(TimeUtils.todayAt(columns[3]));
        luggage.setDepartureTime(TimeUtils.todayAt(columns[4]));
        luggage.setFlightDuration(TimeUtils.durationOfHours(columns[5]));
        luggage.setWaitingDuration(Duration.ofSeconds(0));
        return luggage;
    }
}
