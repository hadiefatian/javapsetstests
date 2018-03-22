package at.refugeescode.javapsetstests.pset1.parser;

import at.refugeescode.javapsetstests.pset1.model.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieParser extends AbstractParser<Movie> {


    @Override
    protected List<Movie> toObject(String[] columns) {
        if (columns.length != 24) {
            return new ArrayList<>();
        }

        Movie movie = new Movie();
        movie.setTitle(columns[8]);
        movie.setGenres(getGenres(columns[3]));
        movie.setRating(Double.parseDouble(columns[22]));
        return Arrays.asList(movie);
    }

    private Set<String> getGenres(String genres) {
        String[] columns = genres.split(", ");
        return Stream.of(columns)
                .filter(field -> field.contains("'name':"))
                .map(genre -> genre.replaceAll("'name':", ""))
//                .map(genre -> genre.replaceAll("\\{", ""))
//                .map(genre -> genre.replaceAll("\\[", ""))
                .map(genre -> genre.replaceAll("]", ""))
                .map(genre -> genre.replaceAll("}", ""))
                .map(genre -> genre.replaceAll("'", ""))
                .map(genre -> genre.trim())
                .collect(Collectors.toSet());
    }
}
