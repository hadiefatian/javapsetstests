package at.refugeescode.javapsetstests.pset1.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractParser<T> {

    public List<T> asList(String path) {
        try {
            return Files.lines(Paths.get(path))
                    .skip(1)
                    .map(line -> line.split(";"))
                    .map(columns -> toObject(columns))
                    .flatMap(objects -> objects.stream())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    protected abstract List<T> toObject(String[] columns);

}
