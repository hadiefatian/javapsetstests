package at.refugeescode.javapsetstests.pset4.controller;

import at.refugeescode.javapsetstests.pset4.model.Luggage;
import at.refugeescode.javapsetstests.pset4.util.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {


    private Luggage luggage = new Luggage();
    private Airport airport = new Airport();

    @Test
    void acceptedLuggage() {

        luggage.setOwner("Hadi");
        luggage.setDestination("Helsinki");
        luggage.setType("Backpack");
        luggage.setDropOffTime(TimeUtils.todayAt("10:00"));
        luggage.setDepartureTime(TimeUtils.todayAt("12:00"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("5"));
        luggage.setWaitingDuration(Duration.ofSeconds(0));

        List<Luggage> departures = new ArrayList<>();
        departures.add(luggage);
        List<Luggage> arrivals = airport.travel(departures);

        // one luggage arrives
        assertEquals(1, arrivals.size());

        // the luggage has right waiting duration
        Luggage arrivalLuggage = arrivals.get(0);
        Duration expected = Duration.parse("PT7H45M");
        Duration waitingDuration = arrivalLuggage.getWaitingDuration();

        assertEquals(expected, waitingDuration);

        // the luggage has the right arrival time
        LocalDateTime arrivalTime = luggage.getArrivalTime();
        LocalDateTime expectedArrival = TimeUtils.todayAt("17:00");

        assertEquals(expectedArrival, arrivalTime);
    }

    @Test
    void rejectedLuggage() {

        luggage.setOwner("Hadi");
        luggage.setDestination("Helsinki");
        luggage.setType("Backpack");
        luggage.setDropOffTime(TimeUtils.todayAt("10:00"));
        luggage.setDepartureTime(TimeUtils.todayAt("10:15"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("5"));
        luggage.setWaitingDuration(Duration.ofSeconds(0));

        List<Luggage> rejectedLuggageList = new ArrayList<>();
        rejectedLuggageList.add(luggage);
        List<Luggage> noTravel = airport.travel(rejectedLuggageList);
        assertEquals(0, noTravel.size());

    }
}