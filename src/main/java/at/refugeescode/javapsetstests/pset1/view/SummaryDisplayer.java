package at.refugeescode.javapsetstests.pset1.view;

import oop.opencoding.pset1.model.Summary;

public class SummaryDisplayer {

    public void display(Summary summary) {
        System.out.println("--- Movie Database Summary ---");
        System.out.println("\nNumber of movies: " + summary.getNumberOfMovies());
        System.out.println("Number of actors: " + summary.getNumberOfActors());
        System.out.println("\nMost rated movies:");
        summary.getMostRatedMovies().forEach(System.out::println);
        System.out.println("\nMost hired actors:");
        summary.getMostHiredActors().forEach(System.out::println);
        System.out.println("\nMost appearing genres:");
        summary.getMostAppearingGenres().forEach(System.out::println);
        System.out.println("\nMale-Female ratio:" + summary.getMaleFemaleRatio());
    }
}
