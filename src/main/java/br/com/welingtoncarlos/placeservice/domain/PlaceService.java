package br.com.welingtoncarlos.placeservice.domain;

import br.com.welingtoncarlos.placeservice.api.PlaceRequest;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(null, placeRequest.name(), placeRequest.slug(), placeRequest.state(), placeRequest.city(),
                placeRequest.createdAt(), placeRequest.updatedAt());
        return placeRepository.save(place);
    }
}
