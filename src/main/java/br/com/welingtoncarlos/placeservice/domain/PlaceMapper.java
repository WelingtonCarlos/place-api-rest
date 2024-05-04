package br.com.welingtoncarlos.placeservice.domain;

import org.springframework.util.StringUtils;

import br.com.welingtoncarlos.placeservice.api.PlaceRequest;
import br.com.welingtoncarlos.placeservice.api.PlaceResponse;

public class PlaceMapper {
    public static Place updatePlaceFromDTO(PlaceRequest placeRequest, Place place) {
        final String name = StringUtils.hasText(placeRequest.name()) ? placeRequest.name() : place.name();
        final String city = StringUtils.hasText(placeRequest.city()) ? placeRequest.city() : place.city();
        final String state = StringUtils.hasText(placeRequest.state()) ? placeRequest.state() : place.state();
        return new Place(place.id(), name, place.slug(), city, state, place.createdAt(), place.updatedAt());
    }

    public static PlaceResponse fromPlaceResponse(Place place) {
        return new PlaceResponse(place.id(), place.name(), place.slug(), place.state(), place.city(), place.createdAt(),
                place.updatedAt());
    }
}
