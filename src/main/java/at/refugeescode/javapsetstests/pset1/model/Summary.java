package at.refugeescode.javapsetstests.pset1.model;

import java.util.List;

public class Summary {

    private Integer numberOfActors;
    private Integer numberOfMovies;
    private List<String> mostRatedMovies;
    private List<String> mostHiredActors;
    private List<String> mostAppearingGenres;
    private String maleFemaleRatio;

    public Integer getNumberOfActors() {
        return numberOfActors;
    }

    public void setNumberOfActors(Integer numberOfActors) {
        this.numberOfActors = numberOfActors;
    }

    public Integer getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(Integer numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public List<String> getMostRatedMovies() {
        return mostRatedMovies;
    }

    public void setMostRatedMovies(List<String> mostRatedMovies) {
        this.mostRatedMovies = mostRatedMovies;
    }

    public List<String> getMostHiredActors() {
        return mostHiredActors;
    }

    public void setMostHiredActors(List<String> mostHiredActors) {
        this.mostHiredActors = mostHiredActors;
    }

    public List<String> getMostAppearingGenres() {
        return mostAppearingGenres;
    }

    public void setMostAppearingGenres(List<String> mostAppearingGenres) {
        this.mostAppearingGenres = mostAppearingGenres;
    }

    public String getMaleFemaleRatio() {
        return maleFemaleRatio;
    }

    public void setMaleFemaleRatio(String maleFemaleRatio) {
        this.maleFemaleRatio = maleFemaleRatio;
    }
}
