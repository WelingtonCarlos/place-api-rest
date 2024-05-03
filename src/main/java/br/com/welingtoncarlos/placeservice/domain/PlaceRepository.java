package br.com.welingtoncarlos.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long> {

}
