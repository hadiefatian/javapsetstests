package at.refugeescode.javapsetstests.pset4.parse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractParser<T> {

    public List<T> asList(String path) {
        try {
            return Files.lines(Paths.get(path))
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(this::toObject)
                    .filter(object -> object.isPresent())
                    .map(Optional::get)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    protected abstract Optional<T> toObject(String[] columns);

}
