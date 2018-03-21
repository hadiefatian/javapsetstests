package at.refugeescode.javapsetstests.pset1.controller;

import oop.opencoding.pset1.model.Actor;
import oop.opencoding.pset1.model.Gender;
import oop.opencoding.pset1.model.Movie;
import oop.opencoding.pset1.model.Summary;
import oop.opencoding.pset1.parser.ActorParser;
import oop.opencoding.pset1.parser.MovieParser;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieDatabaseSummarizer {

    public Summary summarize() {
        MovieParser movieParser = new MovieParser();
        ActorParser actorParser = new ActorParser();

        List<Movie> movies = movieParser.asList("src/oop/opencoding/pset1/data/movies.csv");
        List<Actor> actors = actorParser.asList("src/oop/opencoding/pset1/data/actors.csv");

        Summary summary = new Summary();
        summary.setNumberOfMovies(movies.size());
        summary.setNumberOfActors(actors.size());
        summary.setMostRatedMovies(getMostRated(movies));
        summary.setMostHiredActors(getMostHired(actors));
        summary.setMostAppearingGenres(getMostAppearingGenres(movies));
        summary.setMaleFemaleRatio(getMaleFemaleRatio(actors));
        return summary;
    }

    private List<String> getMostRated(List<Movie> movies) {
        return movies.stream()
                .sorted((e1, e2) -> e2.getRating().compareTo(e1.getRating()))
                .limit(5)
                .map(e -> e.getTitle() + " (" + e.getRating() + ")")
                .collect(Collectors.toList());
    }

    private List<String> getMostHired(List<Actor> actors) {
        return actors.stream()
                .map(actor -> actor.getName())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getKey() + " (" + e.getValue() + ")")
                .collect(Collectors.toList());
    }

    private List<String> getMostAppearingGenres(List<Movie> movies) {
        return movies.stream()
                .map(movie -> movie.getGenres())
                .flatMap(genres -> genres.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " (" + e.getValue() + ")")
                .collect(Collectors.toList());
    }

    private String getMaleFemaleRatio(List<Actor> actors) {
        double size = actors.size();
        return actors.stream()
                .map(actor -> actor.getGender())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> getPercentage(size, e) + e.getKey().toString().toLowerCase())
                .collect(Collectors.joining(", "));
    }

    private String getPercentage(double size, Map.Entry<Gender, Long> e) {
        double percentage = e.getValue() / size;
        NumberFormat formatter = new DecimalFormat("0.0 %");
        return formatter.format(percentage);
    }
}
