package br.com.welingtoncarlos.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
        String name,
        String slug,
        String state,
        String city,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {

}
