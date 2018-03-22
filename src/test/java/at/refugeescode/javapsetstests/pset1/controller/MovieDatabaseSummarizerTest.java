package at.refugeescode.javapsetstests.pset1.controller;

import at.refugeescode.javapsetstests.pset1.model.Summary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieDatabaseSummarizerTest {

    private MovieDatabaseSummarizer movieDatabaseSummarizer = new MovieDatabaseSummarizer();

    @Test
    void summarize() {

        Summary summary = movieDatabaseSummarizer.summarize();

        Integer numberOfMovies = summary.getNumberOfMovies();
        assertEquals(Integer.valueOf(29947), numberOfMovies);

        Integer numberOfActors = summary.getNumberOfActors();
        assertEquals(Integer.valueOf(274570), numberOfActors);

        List<String> mostRatedMovies = summary.getMostRatedMovies();
        assertEquals(5, mostRatedMovies.size());
        assertEquals("Reckless (10.0)", mostRatedMovies.get(0));
        assertEquals("Girl in the Cadillac (10.0)", mostRatedMovies.get(1));
        assertEquals("The Haunted World of Edward D. Wood, Jr. (10.0)", mostRatedMovies.get(2));
        assertEquals("Carmen Miranda: Bananas Is My Business (10.0)", mostRatedMovies.get(3));
        assertEquals("Other Voices Other Rooms (10.0)", mostRatedMovies.get(4));

        List<String> mostHiredActors = summary.getMostHiredActors();
        assertEquals(5, mostHiredActors.size());
        assertEquals("Bess Flowers (82)", mostHiredActors.get(0));
        assertEquals("Christopher Lee (69)", mostHiredActors.get(1));
        assertEquals("Grey Griffin (58)", mostHiredActors.get(2));
        assertEquals("Danny Trejo (54)", mostHiredActors.get(3));
        assertEquals("Eric Roberts (52)", mostHiredActors.get(4));

        List<String> mostAppearingGenres = summary.getMostAppearingGenres();
        assertEquals(2, mostAppearingGenres.size());
        assertEquals("Drama (14495)", mostAppearingGenres.get(0));
        assertEquals("Comedy (8955)", mostAppearingGenres.get(1));

        String maleFemaleRatio = summary.getMaleFemaleRatio();
        assertEquals("64,1 %female, 35,9 %male", maleFemaleRatio);

    }
}