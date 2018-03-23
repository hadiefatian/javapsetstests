package at.refugeescode.javapsetstests.pset4.controller;

import at.refugeescode.javapsetstests.pset4.model.Luggage;
import at.refugeescode.javapsetstests.pset4.util.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
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
        luggage.setType("package");
        luggage.setDropOffTime(TimeUtils.todayAt("10:00"));
        luggage.setDepartureTime(TimeUtils.todayAt("12:00"));
        luggage.setFlightDuration(TimeUtils.durationOfHours("5"));
        luggage.setWaitingDuration(Duration.ofSeconds(0));

        List<Luggage> acceptedLuggageList = new ArrayList<>();
        acceptedLuggageList.add(luggage);
        List<Luggage> travel = airport.travel(acceptedLuggageList);
        assertEquals(1, travel.size());
    }

    @Test
    void rejectedLuggage() {

        luggage.setOwner("Hadi");
        luggage.setDestination("Helsinki");
        luggage.setType("package");
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