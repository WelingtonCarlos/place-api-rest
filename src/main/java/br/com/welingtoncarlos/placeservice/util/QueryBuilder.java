package br.com.welingtoncarlos.placeservice.util;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import br.com.welingtoncarlos.placeservice.domain.Place;

public class QueryBuilder {
    private QueryBuilder() {
    }

    public static Example<Place> makeQuery(Place place) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnoreNullValues();
        return Example.of(place, exampleMatcher);
    }
}
