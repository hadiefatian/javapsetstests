package at.refugeescode.javapsetstests.pset4.view;

import oop.opencoding.pset4.model.Luggage;
import oop.opencoding.pset4.util.TimeUtils;

import java.time.Duration;
import java.util.List;

public class SummaryReporter {

    public void showHeader() {
        System.out.println("### Luggage Madness ###\n");
    }

    public void reportRejected(List<Luggage> luggage) {
        System.out.println("\n--- Airport rejected report ---\n");

        luggage.forEach(this::reportRejected);
    }

    private void reportRejected(Luggage luggage) {
        StringBuilder builder = new StringBuilder();
        builder.append(luggage.getType());
        builder.append(" of ");
        builder.append(luggage.getOwner());
        builder.append(" arrived to the drop off ");
        Duration interval = Duration.between(luggage.getDropOffTime(), luggage.getDepartureTime());
        long delay = interval.toMinutes();
        builder.append(delay);
        builder.append(" minutes late.");

        System.out.println(builder.toString());
    }

    public void reportAccepted(List<Luggage> luggage) {
        System.out.println("\n--- Airport arrivals report ---\n");

        luggage.forEach(this::reportAccepted);
    }

    private void reportAccepted(Luggage luggage) {
        StringBuilder builder = new StringBuilder();
        builder.append(luggage.getType());
        builder.append(" of ");
        builder.append(luggage.getOwner());
        builder.append(" arrived to ");
        builder.append(luggage.getDestination());
        builder.append(" at ");
        builder.append(TimeUtils.formatTime(luggage.getArrivalTime()));
        builder.append(" (local time ");
        builder.append(TimeUtils.formatLocalTime(luggage.getArrivalTime(), luggage.getDestination()));
        builder.append(") and waited a total of ");
        builder.append(TimeUtils.format(luggage.getWaitingDuration()));

        System.out.println(builder.toString());
    }


}
