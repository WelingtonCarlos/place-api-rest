package br.com.welingtoncarlos.placeservice.api;

import java.time.LocalDateTime;

public record PlaceResponse(
        Long id,
        String name,
        String slug,
        String state,
        String city,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}
