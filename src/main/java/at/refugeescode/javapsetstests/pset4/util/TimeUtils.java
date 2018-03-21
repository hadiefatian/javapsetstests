package at.refugeescode.javapsetstests.pset4.util;

import java.time.*;
import java.time.format.DateTimeFormatter;

// This class is a utility class
public class TimeUtils {

    private static final String TIME_PATTERN = "HH:mm";
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(TIME_PATTERN);

    // Does not allow anybody to create instances of this class
    // as it is provides no value
    private TimeUtils() {
    }

    public static LocalDateTime todayAt(String time) {
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int minute = Integer.parseInt(split[1]);

        return LocalDate.now().atTime(hour, minute);
    }

    public static Duration durationOfHours(String hours) {
        int durationOfHours = Integer.parseInt(hours);
        return Duration.ofHours(durationOfHours);
    }

    public static String formatTime(LocalDateTime localDateTime) {
        return dateTimeFormatter.format(localDateTime);
    }

    public static String formatTime(ZonedDateTime zonedDateTime) {
        return dateTimeFormatter.format(zonedDateTime);
    }

    public static String format(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        return String.format(
                "%02d hours %02d minutes",
                hours,
                minutes);
    }

    public static String formatLocalTime(LocalDateTime time, String destination) {
        ZoneId originZone = ZoneId.of("Europe/Vienna");
        ZoneId destinationZone = ZoneId.of("Europe/" + destination);

        ZonedDateTime originTime = time.atZone(originZone);
        ZonedDateTime destinationTime = originTime.withZoneSameInstant(destinationZone);

        return formatTime(destinationTime);
    }

}
