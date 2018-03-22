package at.refugeescode.javapsetstests.pset4;

import at.refugeescode.javapsetstests.pset4.controller.Airport;
import at.refugeescode.javapsetstests.pset4.model.Luggage;
import at.refugeescode.javapsetstests.pset4.parse.LuggageParser;

import java.util.List;

public class Pset4Main {

    public static void main(String[] args) {
        LuggageParser luggageParser = new LuggageParser();
        List<Luggage> departureLuggage = luggageParser.asList("src/main/java/at/refugeescode/javapsetstests/pset4/data/luggage.csv");

        Airport airport = new Airport();
        List<Luggage> arrivalLuggage = airport.travel(departureLuggage);

        // Returning the list of arrival luggage will be very useful
        // when we learn about unit testing to be able to test the behaviour
        // of the Airport class automatically
    }
}

