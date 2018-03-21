package at.refugeescode.javapsetstests.pset1.parser;

import oop.opencoding.pset1.model.Actor;
import oop.opencoding.pset1.model.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActorParser extends AbstractParser<Actor> {

    @Override
    protected List<Actor> toObject(String[] columns) {
        if (columns.length != 3) {
            return new ArrayList<>();
        }

        String cast = columns[0];
        cast = cast.replaceAll("\\[", "").replaceAll("]", "");
        String[] actors = cast.split("}, ");

        return Stream.of(actors)
                .filter(e -> e.contains("'name':") && e.contains("'gender':"))
                .map(jsonActor -> toActor(jsonActor))
                .collect(Collectors.toList());
    }

    private Actor toActor(String jsonActor) {
        Actor actor = new Actor();
        actor.setName(getName(jsonActor));
        actor.setGender(getGender(jsonActor));
        return actor;
    }

    private String getName(String jsonActor) {
        return getRawField(jsonActor, "'name':");
    }

    private Gender getGender(String jsonActor) {
        String rawField = getRawField(jsonActor, "'gender':");
        return toGender(rawField);
    }

    private String getRawField(String jsonActor, String fieldName) {
        String[] fields = jsonActor.split(",");
        return Stream.of(fields)
                .filter(field -> field.contains(fieldName))
                .map(gender -> gender.replaceAll(fieldName, ""))
                .map(gender -> gender.replaceAll("\\{", ""))
                .map(gender -> gender.replaceAll("}", ""))
                .map(gender -> gender.replaceAll("'", ""))
                .map(gender -> gender.trim())
                .findFirst().get();
    }

    private Gender toGender(String number) {
        if (number.equals("2")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }
}
