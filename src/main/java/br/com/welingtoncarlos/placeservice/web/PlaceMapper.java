package br.com.welingtoncarlos.placeservice.web;

import br.com.welingtoncarlos.placeservice.api.PlaceResponse;
import br.com.welingtoncarlos.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.city(), place.createdAt(),
                place.updatedAt());
    }
}
